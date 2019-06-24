package com.zohocrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohocrm.qa.base.TestBase;
import com.zohocrm.qa.pages.HomePage;
import com.zohocrm.qa.pages.LoginPage;
import com.zohocrm.qa.utilities.TestUtil;

public class LoginPageTest extends TestBase{
	
	public LoginPageTest()
	{
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void SetUp()
	{
		Initialization();
		loginPage=new LoginPage();
	}
	
	
	@Test(priority=1)
	public void validateloginpagetitleTest()
	{
		String title=loginPage.validateloginpagetitle();
		Assert.assertEquals(title, "Sales CRM | Customer Relationship Management Software - Zoho CRM");
		
	}

	@Test(priority=2)
	public void LoginTest() throws InterruptedException
	{
		homePage=loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
		Thread.sleep(10000);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//TestUtil.signout();
		//driver.quit();
	}
	
}
