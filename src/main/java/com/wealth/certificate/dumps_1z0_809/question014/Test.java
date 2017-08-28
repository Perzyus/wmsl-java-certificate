package com.wealth.certificate.dumps_1z0_809.question014;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream (getCurrentPath() + "/resources/Message.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "Test"));//line n1 >> key, defaultValue (if does not existing key)
		System.out.println(prop.getProperty("welcome3"));
		
		/** Answered : D is incorrect, Correct is C **/
		/* Print :
		 * Good day!
		 * Test
		 * null
		 */
		
		System.out.println(System.getProperty ("user.dir"));
	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question014";
	}
}
