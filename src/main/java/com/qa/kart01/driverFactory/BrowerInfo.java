package com.qa.kart01.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerInfo {
	
	// Public WebDriver
	// Type of Browser to be invoked
	// Calling the URL
	
	public WebDriver driver;
	
	public WebDriver init(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
       driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   
	   return driver;
	}

}
