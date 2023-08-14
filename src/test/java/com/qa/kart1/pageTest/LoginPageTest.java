package com.qa.kart1.pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.kart1.baseTest.BaseClass;

public class LoginPageTest extends BaseClass {
	
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		Assert.assertTrue(lc.loginMethod("vamsi7@gmail.com", "automation"));		
	}
	
	@Test
	public void subSections_Test()
	{
		Assert.assertEquals(lc.subsections(), 13);
	}
	
	@Test
	
	public void search_visible_Test()
	{
		Assert.assertTrue(lc.searchVisibility());
	}

}
