package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import step.Step;
import utility.WebDriverFactory;

public class HomePage {

	
	public static WebDriver driver;
	
	
	public boolean isOpen()
	{
		  String uniqueIdentifier= "//*[text()='Home']"; 
		  return Step.pageValidation(uniqueIdentifier);
	}
	
    public void navigateto() throws IOException
    {
    	LoginPage JLP=new LoginPage();
    	JLP.navigateto();
    	WebDriverFactory.getCurrentWebDriver().findElement(By.id("txtUsername")).sendKeys("AKS1009");
    	WebDriverFactory.getCurrentWebDriver().findElement(By.id("CustomImageButtonControl1")).click();
    	WebDriverFactory.getCurrentWebDriver().findElement(By.id("txtPassword")).sendKeys("Abcd1234");
    	WebDriverFactory.getCurrentWebDriver().findElement(By.id("CustomImageButtonControl1")).click();
    	WebDriverFactory.getCurrentWebDriver().findElement(By.id("btnContinue")).click();
    	
    }
}
