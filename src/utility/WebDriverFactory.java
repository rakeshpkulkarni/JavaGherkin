package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

	public static WebDriver driver;
	
	public static void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Ashwini Kumar\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void quitbrowser()
	{
		driver.quit();
	}
	
	public static WebDriver getCurrentWebDriver() {
		
		return driver;
	}

}
