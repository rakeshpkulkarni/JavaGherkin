package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Helper {

	
	public static Properties readProprtiesFile() throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(
				"C:\\Ashwini Kumar\\Java Prep\\POC\\src\\utility\\Application.properties");
		obj.load(objfile);
		return obj;
	}
	
	
	
	public String getReportConfigPath(){
		Properties properties = new Properties();
	 String reportConfigPath = properties.getProperty("reportConfigPath");
	 if(reportConfigPath!= null) return reportConfigPath;
	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}



	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
