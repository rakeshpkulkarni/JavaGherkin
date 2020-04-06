package pages;

import org.openqa.selenium.WebDriver;

import utility.WebDriverFactory;

public abstract class BasePage {
	
	public String pageURL;
	public String xPathValidator=null;
	  

	  
	public BasePage()
	{
	 
	}

	protected abstract void navigateTo();



	public  boolean isOpen() 
	{
		WebDriver driver=WebDriverFactory.getCurrentWebDriver();
				
		//return this.xPathValidator.elementFinder().isDisplayed();
		return true;
	}

}
