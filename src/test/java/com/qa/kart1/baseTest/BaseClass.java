package com.qa.kart1.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.kart01.driverFactory.BrowerInfo;
import com.qa.kart01.page.Login_Page;

public class BaseClass {
	
	// Driver passing
	// Creating all the page class reference
	// calling browser for initial data setup
	
	
	public WebDriver driver;
	protected Login_Page lc;
	 BrowerInfo bi;

	@BeforeTest
	public void setUp()
	{
	 
		bi = new BrowerInfo();
	    driver = bi.init("chrome");
		lc = new Login_Page(driver);
	}
	
	@AfterTest
	public void tearDown()
	
	{
		driver.quit();
	}
	

}
