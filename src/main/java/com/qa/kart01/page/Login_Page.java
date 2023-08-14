package com.qa.kart01.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	// Private by locators, WebDriver
	// one constructor
	// Page Actions ( Each method must have some return type 
  private WebDriver driver;
  
  private By search = By.xpath("//input[@name =\"search\"]");
  private By u_name = By.xpath("//input[@id =\"input-email\"]");
  private By p_word = By.xpath("//input[@id =\"input-password\"]");
  private By login = By.xpath("//input[@type =\"submit\"]");
  private By logout = By.xpath("(//a[text()=\"Logout\"])[1]");
  
  public Login_Page(WebDriver driver)
  {
	  this.driver = driver;
  }
  

public Boolean loginMethod(String username, String password) throws InterruptedException
  {
	  driver.findElement(u_name).sendKeys(username);
	  driver.findElement(p_word).sendKeys(password);
	  driver.findElement(login).click();
	  Thread.sleep(3000);
	  Boolean flag = driver.findElement(logout).isDisplayed();
	  return flag;
	  
  }
  
  public int subsections()
  
  {
	  
	 List<WebElement> subs = driver.findElements(By.xpath("//div[@class=\"list-group\"]//a[@href]"));
     List<String> header = new ArrayList();
	 for (WebElement subHeaders: subs)
	 {
		 String sHeader = subHeaders.getText();
		 header.add(sHeader);
	 }
	
	 int subSize = header.size();
	  
	return subSize;
	  
  }
  
  public Boolean searchVisibility()
  {
	  Boolean serach_Flag = driver.findElement(search).isDisplayed();
	  return serach_Flag;
  }


  
 

}
