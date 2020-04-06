package utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;

import step.Step;

public class LogHelper {
	
	public enum LogLevel {INFO,ERROR}
	//public static String scenarioName=null;
	
	
	public static void createLogFile(String Filename) throws IOException
	{
		File logfile=new File("C:\\Ashwini Kumar\\Java Prep\\Logs\\"+Filename+".txt");
		if(logfile.exists())
		{
			logfile.delete();
		}
		logfile.createNewFile();
	}
	
	public static void log(LogLevel loglevel,String message) throws IOException
	{
		switch(loglevel) {
		case INFO: apendFile(Step.scenarioName, "Log.INFO: "+message); 
		break;
		case ERROR: apendFile(Step.scenarioName, "Log.ERROR: "+message); 
		Assert.assertFalse(true);
		break;
		}
		
	}
	
	
	
	public static void apendFile(String FileName, String message) throws IOException
	{
		
		String CompleteFilePath="C:\\Ashwini Kumar\\Java Prep\\Logs\\"+FileName+".txt";
		
		File tempfile=new File(CompleteFilePath);
		if (tempfile.exists())
		{
			BufferedWriter out = new BufferedWriter( 
	                   new FileWriter(CompleteFilePath, true)); 
			out.newLine();
			out.write(message); 
	            out.close(); 
	          }
		else
		{
		BufferedWriter out = new BufferedWriter(new FileWriter(CompleteFilePath));
		out.append(message);
		out.close();
		}
		
	}
	
	
	}
