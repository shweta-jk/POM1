package com.zohocrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//OR---Page Factory
	
	@FindBy(xpath="//a[@class='zgh-login' and @style='display: inline-block;']")
	WebElement login;
	

	@FindBy(name="lid")
	WebElement emailorphone;
	
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(id="signin_submit")
	WebElement Signinbtn;
	
	//Initializing the OR
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public String validateloginpagetitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage Login(String ephn,String pwd)
	{
		login.click();
		emailorphone.sendKeys(ephn);
		password.sendKeys(pwd);
		Signinbtn.click();
		return new HomePage();
	}
	
}
