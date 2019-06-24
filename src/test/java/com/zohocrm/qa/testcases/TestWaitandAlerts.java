package com.zohocrm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestWaitandAlerts {
	WebDriver driver;
	
	
	@Test
	public void Testwaitsalerts() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-switch-windows");
	driver.findElement(By.name("Timing Alert")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,10); 
	Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
	
	myalert.accept();
	driver.close();
	
	
	
	}
	
	
	

}
