package webElements;
public class Button extends BaseElement{
	
	public Button(String locatorType, String locatorValue) {
		super(locatorType, locatorValue);
		
	}

	public void click()
	{
		this.elementFinder().click();
	}
	
	


}
