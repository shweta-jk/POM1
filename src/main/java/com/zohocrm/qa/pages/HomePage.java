package com.zohocrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//span[@id='show-uName']")
	WebElement usernamelabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement Deals;
	
	@FindBy(xpath="//a[contains(text(),'Activities')]")
	WebElement Activities;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}

	public String verifyHomepagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyusernamelabel()
	{
		return(usernamelabel.isDisplayed());
		
	}
	
	public ContactsPage clickonContactslink() throws InterruptedException
	{
		Contacts.click();
		Thread.sleep(10000);
		return new ContactsPage();
				
	}
	
	
	public DealsPage clickonDealslink() throws InterruptedException
	{
		Deals.click();
		Thread.sleep(10000);
		return new DealsPage();
		
		
	}
	
	public ActivitiesPage clickonActivitieslink() throws InterruptedException
	{
		Activities.click();
		Thread.sleep(10000);
		return new ActivitiesPage();
		
		
	}
	
	
	
}
