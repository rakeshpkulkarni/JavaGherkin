package pages;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import step.Step;
import utility.Helper;
import utility.WebDriverFactory;

public class LoginPage {
	
	public static WebDriver driver;
	//public TextBox UserName = new TextBox("id", "txtUsername");
	//By UserName = By.id("txtUsername");
	
	@FindBy(id="txtUsername") public WebElement UserName;
	
	//public String[] UserName= {"TextBox","id","txtUsername"};
	
	public WebElement UserName()
	{
		return WebDriverFactory.getCurrentWebDriver().findElement(By.id("txtUsername"));
	}
	
	public WebElement Proceed()
	{
		return WebDriverFactory.getCurrentWebDriver().findElement(By.id("CustomImageButtonControl1"));
	}
	
	public WebElement Password()
	{
		return WebDriverFactory.getCurrentWebDriver().findElement(By.id("txtPassword"));
	}
	
	public WebElement Warning_Message()
	{
		return WebDriverFactory.getCurrentWebDriver().findElement(By.id("lblError"));
	}
	

	public WebElement Confirmation()
	{
		return WebDriverFactory.getCurrentWebDriver().findElement(By.id("btnContinue"));
	}
	
	public boolean isOpen()
	{
		  String uniqueIdentifier= "//*[@id='txtUsername']"; 
		  return Step.pageValidation(uniqueIdentifier);
	}
	
    public void navigateto() throws IOException
    {
    	WebDriverFactory.launchbrowser();
		Properties obj = Helper.readProprtiesFile();
		WebDriverFactory.getCurrentWebDriver().get(obj.getProperty("JMS"));
    }
    
    
}
