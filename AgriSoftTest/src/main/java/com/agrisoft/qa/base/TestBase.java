package com.agrisoft.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.agrisoft.qa.utilities.TestUtil;

public class TestBase extends TestUtil{
	
	public static WebDriver driver;
	public static Properties prop;
	public static TestUtil util;
	public TestBase()
	{
		 File src=new File("C:\\Users\\mvhas\\eclipse-workspace\\AgriSoftTest\\src\\main\\java\\com\\agrisoft\\qa\\config\\config.properties");
		 try {
			FileInputStream fis=new FileInputStream(src);
			 prop=new Properties();
			 prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
	     System.out.println("Not able to load config file"+e.getMessage());	
	     } 
	}
	public static void initialization()
	{
		util=new TestUtil();
		String browserName=prop.getProperty("browser");
		if (browserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}

}
