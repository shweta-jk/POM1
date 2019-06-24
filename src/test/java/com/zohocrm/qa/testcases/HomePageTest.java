package com.zohocrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohocrm.qa.base.TestBase;
import com.zohocrm.qa.pages.ActivitiesPage;
import com.zohocrm.qa.pages.ContactsPage;
import com.zohocrm.qa.pages.DealsPage;
import com.zohocrm.qa.pages.HomePage;
import com.zohocrm.qa.pages.LoginPage;
import com.zohocrm.qa.utilities.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginPage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	ActivitiesPage activitiesPage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	
	//test cases should be separated--independent of each other
	//before each test case-launch the browser and login
	//@test--execute the test case
	//after each test case --close the browser
	
	@BeforeMethod(alwaysRun=true)
	public void SetUp()
	{
		Initialization();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		dealsPage=new DealsPage();
		activitiesPage=new ActivitiesPage();
		homepage=loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test(groups="Home")
	public void verifyHomepagetitleTest()
	{
		String title=homepage.verifyHomepagetitle();
		Assert.assertEquals(title, "Zoho Accounts","Title not matched");
	}
	
	@Test(groups="Home")
	public void verifyusernamelabelTest()
	{
		Assert.assertTrue(homepage.verifyusernamelabel());
	}
	
	@Test(groups="Home")
	public void clickonContactslinkTest() throws InterruptedException
	{
		contactsPage=homepage.clickonContactslink();
		
		
	}
	
	@Test(groups="Deals")
	public void clickonDealslinkTest() throws InterruptedException
	{
		dealsPage=homepage.clickonDealslink();
		
		
	}
	
	@Test(groups="Deals")
	public void clickonActivitieslinkTest() throws InterruptedException
	{
		activitiesPage=homepage.clickonActivitieslink();
		
		
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		TestUtil.signout();
		driver.quit();
	}
}
