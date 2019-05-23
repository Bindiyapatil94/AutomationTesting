package Base_Test;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile {
	public  static String getProperty(String key)
	{
		
	String propertyfilepath="../AutomationTesting/src/test/java/ConfigProperty/EnvirmentalVariables";
	
	
		Properties p=new Properties(); //creating object of properties class
	
	try 
	{
		FileInputStream file  = new FileInputStream(propertyfilepath);//read the propertyfile
		p.load(file);
	} 
	catch (Exception e1)
	{
		
		e1.printStackTrace();
	}
	return p.getProperty(key);
}

}
