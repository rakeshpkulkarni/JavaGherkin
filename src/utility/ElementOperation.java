package utility;

import org.openqa.selenium.WebElement;

public class ElementOperation {

	
	
	public static void enterText(WebElement e,String value)
	{
		e.sendKeys(value);
	}
	
	public static void click(WebElement e, String value)
	{
		e.click();
	}
	
	public static String getText(WebElement e, String value)
	{
		return e.getText();
	}
	
	
	
}
