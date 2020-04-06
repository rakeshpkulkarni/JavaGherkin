package webElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {
	
		
	protected  String locatorType;
	protected  String locatorValue;
	public WebDriver driver;
	public WebElement element;
	
	public WebElement elementFinder()
	{
		switch(locatorType) 
		{
		case "ClassName" :
			element= driver.findElement(By.className(locatorValue));
			break;
		case "CssSelector" :
			element= driver.findElement(By.cssSelector(locatorValue));
			break;
		case "Id" :
			element= driver.findElement(By.id(locatorValue));
			break;
		case "LinkText" :
			element= driver.findElement(By.linkText(locatorValue));
			break;
		case "Name" :
			element= driver.findElement(By.name(locatorValue));
			break;
		case "PartialLinkText" :
			element= driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "TagName" :
			element= driver.findElement(By.tagName(locatorValue));
			break;
		case "XPath" :
			element= driver.findElement(By.xpath(locatorValue));
			break;
		}	
		return element;
	}


	public BaseElement(String locatorType,String locatorValue)
	{
		this.locatorType=locatorType;
		this.locatorValue=locatorValue;
	}
	

}
