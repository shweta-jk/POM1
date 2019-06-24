package com.zohocrm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zohocrm.qa.base.TestBase;
import com.zohocrm.qa.pages.ActivitiesPage;
import com.zohocrm.qa.pages.ContactsPage;
import com.zohocrm.qa.pages.DealsPage;
import com.zohocrm.qa.pages.HomePage;
import com.zohocrm.qa.pages.LoginPage;
import com.zohocrm.qa.utilities.TestUtil;

public class ContactsPageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginPage;
	ContactsPage contactsPage;
	String sheetname="contacts";
	
	
	public ContactsPageTest()
	{
		super();
	}

	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		Initialization();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		homepage=new HomePage();
		homepage=loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
		contactsPage=homepage.clickonContactslink();
		
	}
	@Test(priority=1)
	
	public void verifycontactspageTest()
	{
		Assert.assertTrue(contactsPage.verifycontactspage(),"Not a contacts page");
	}
	
	/*
	 * @Test(priority=2) public void verifycontactsCheckedTest() throws
	 * InterruptedException { contactsPage.verifycontactsChecked();
	 * 
	 * }
	 */
	
	@Test(priority=3)
	
	  public void clickondotstest() throws InterruptedException
	{
		contactsPage.clickondots();
		
	}
	
	
	 
	
	/*
	 * @DataProvider
	 * 
	 * public Object[][] getzohoTestData() { 
	 * Object data[][]= TestUtil.getTestData(sheetname);
	 * return data; }
	 * 
	 * @Test(priority=3,dataProvider="getzohoTestData") 
	 * public void clickonNewContactTest(String fname,String lname,String phno) {
	 * contactsPage.clickonNewContact(fname,lname,phno);
	 * 
	 * }
	 */
	
	@AfterMethod
	public void teardown()
	{
		/*
		 * TestUtil.signout(); driver.quit();
		 */
	}
	
}
