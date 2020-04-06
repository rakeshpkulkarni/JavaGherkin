package utility;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Ashwini Kumar\\Java Prep\\POC\\src\\feature_File",
 glue= {"step"},
 plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-reports.json"},
 monochrome = true
 )
 
public class Runner {

	
	
	  
	  
	/*
	 * @AfterClass public static void writeExtentReport() {
	 * Reporter.loadXMLConfig(new
	 * File("C:\\Ashwini Kumar\\Java Prep\\POC\\src\\utility\\extent-config.xml"));
	 * }
	 * 
	 * 
	 */
}
