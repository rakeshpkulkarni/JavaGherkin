package step;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ElementOperation;
import utility.Log;
import utility.LogHelper;
import utility.WebDriverFactory;

public class Step {

	public static String currentPageName=null;
	
	public static String scenarioName=null;
	
	public static WebDriver driver;
	
	@Before
	public void getScenarioName(Scenario scenario) throws IOException {
	 scenarioName=scenario.getName();
	 LogHelper.createLogFile(scenarioName);
	 }
	
	@After
	public void closeBrowser()
	{
		WebDriverFactory.getCurrentWebDriver().close();
		Log.endLog(scenarioName);
	}
	
	public static boolean pageValidation(String args1) {
		
		try {
			WebDriverFactory.getCurrentWebDriver().findElement(By.xpath(args1)).isDisplayed();
		}
		catch (NoSuchElementException e)
		{
			//e.printStackTrace();
			return false;
		}
		return true;
	}

	private Object InvokeElementMethod(String element, String action, String value) throws ClassNotFoundException, InstantiationException, Exception, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//Identify the Page
		Class<?> CurrentPageObjectClass = Class.forName(currentPageName);
		//Identify the element
		Object handler = CurrentPageObjectClass.getConstructor().newInstance();
		Method returnedElement=CurrentPageObjectClass.getDeclaredMethod(element);
		WebElement returnedWebElement=(WebElement) returnedElement.invoke(handler);
		//Perform Action on the element
		ElementOperation EO=new ElementOperation();
		Method method=EO.getClass().getDeclaredMethod(action,WebElement.class,String.class);
		return method.invoke(EO, returnedWebElement,value);
		}
	
	@Given("^User is on \"([^\"]*)\"$")
	public void user_is_on(String arg1) throws Throwable {
		
		currentPageName = "pages." + arg1;
		Class<?> aClass = Class.forName(currentPageName);
		Method m = aClass.getDeclaredMethod("navigateto");
		Object o = aClass.getConstructor().newInstance();
		m.invoke(o);
		LogHelper.log(LogHelper.LogLevel.INFO, "User is on "+arg1 +" page");
	}
	
	@Then("^Validate user is on \"([^\"]*)\"$")
	public void validate_user_is_on(String arg1) throws Throwable {
		currentPageName = "pages." + arg1;
		Class<?> aClass = Class.forName(currentPageName);
		Method m = aClass.getDeclaredMethod("isOpen");
		Object o = aClass.getConstructor().newInstance();
		if ((boolean) m.invoke(o))
		{
			LogHelper.log(LogHelper.LogLevel.INFO, "User is on "+arg1 +" page");
		}
		else
		{
			LogHelper.log(LogHelper.LogLevel.ERROR, "User is not on "+arg1 +" page");
			
		}
	
		
	}

	@When("^User enters \"([^\"]*)\" in \"([^\"]*)\"$")
	public void user_enters_in(String arg1, String arg2) throws Throwable {

		InvokeElementMethod(arg2,"enterText",arg1);
		LogHelper.log(LogHelper.LogLevel.INFO, "User enters "+arg1 +" in "+arg2);
	}



	@When("^User clicks on \"([^\"]*)\" Button$")
	public void user_clicks_on_Button(String arg1) throws Throwable {
		InvokeElementMethod(arg1,"click",null);
	}
	
	@When("^User clicks on \"([^\"]*)\" Button if  present$")
	public void user_clicks_on_Button_if_present(String arg1) throws Throwable {
		try{
			InvokeElementMethod(arg1,"click",null);   
		}
		catch(InvocationTargetException e)
		{
			
		}
	}

	@Then("^User closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		WebDriverFactory.quitbrowser();
	}

	@Then("^Validate \"([^\"]*)\" is inner text of \"([^\"]*)\"$")
	public void validate_is_inner_text_of(String arg1, String arg2) throws Throwable {
		String ActualText=(String) InvokeElementMethod(arg2,"getText",null);
		if(arg1.equalsIgnoreCase(ActualText))
		{
			LogHelper.log(LogHelper.LogLevel.INFO, arg1 +" is the inner text of "+arg2);
		
		}
		else
		{
			LogHelper.log(LogHelper.LogLevel.ERROR, arg1 +" is not the inner text of "+arg2+" but "+ActualText);
			Assert.assertFalse(true);	
		}
	}
	
	
	
	
}
