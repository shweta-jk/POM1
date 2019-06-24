package com.zohocrm.qa.testcases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

import com.zohocrm.qa.base.TestBase;
import com.zohocrm.qa.pages.ContactsPage;
import com.zohocrm.qa.pages.HomePage;
import com.zohocrm.qa.pages.LoginPage;

@Listeners(com.zohocrm.qa.testcases.Listclass.class)

public class Parameterstest extends TestBase{
	
	
		
	
	@Test
	public void test1() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		//driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		
		System.out.println(driver.getWindowHandle());
		List<WebElement> cl=driver.findElements(By.name("profession"));
		int scl=cl.size();
		for(int i=0;i<scl;i++)
		{
			String sc=cl.get(i).getAttribute("value");
			System.out.println(sc);
			if(sc.equals("Automation Tester"))
				cl.get(i).click();
		}
		
		//input[@id='tool-1']
		
		List<WebElement> tool=driver.findElements(By.name("tool"));
		int tl=tool.size();
		for(int i=0;i<tl;i++)
		{
			String tk=tool.get(i).getAttribute("value");
			System.out.println(tk);
			if(tk.equals("Selenium IDE"))
				tool.get(i).click();
		}
		
		Select oselect=new Select(driver.findElement(By.name("continents")));
		List<WebElement> sel1=oselect.getOptions();
		int ssize=sel1.size();
		
		for(int i=0;i<ssize;i++)
		{
			String svalue=oselect.getOptions().get(i).getText();
			if(svalue.equals("Europe"))
				{
				oselect.selectByIndex(i);	
				}
			
		}
		
		Select mulselect=new Select(driver.findElement(By.name("selenium_commands")));
		List<WebElement>muls1=mulselect.getOptions();
		for(int i=0;i<muls1.size();i++)
		{
			String selval=mulselect.getOptions().get(i).getText();
			if(selval.equals("Browser Commands"))
			{
				mulselect.selectByIndex(i);
			mulselect.deselectByIndex(i);
			}
			
			if(selval.equals("Navigation Commands"))
			{
				mulselect.selectByVisibleText("Navigation Commands");
			mulselect.deselectByVisibleText("Navigation Commands");
			}
		}	
			for(int i=0;i<muls1.size();i++)
			{	String selval2=mulselect.getOptions().get(i).getText();
				System.out.println(selval2);
				mulselect.selectByIndex(i);
				
				
			}
			mulselect.deselectAll();
			
			//Actions Class
			//1> Drag and drop
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
			driver.manage().window().maximize();
			WebElement fromwb=driver.findElement(By.xpath("abcd"));
			WebElement towb=driver.findElement(By.xpath("wxyz"));
			Actions action=new Actions(driver);
			action.moveToElement(fromwb).click();
			action.clickAndHold(fromwb).moveToElement(towb).release(towb).build().perform();
			
			
			Alert myalert=driver.switchTo().alert();
			
			String alerttext=myalert.getText();
			
			myalert.accept();
		
			
		
		/*
		 * driver.findElement(By.
		 * xpath("//a[@class='zgh-login' and @style='display: inline-block;']")).click()
		 * ;
		 * driver.findElement(By.xpath("//@name='lid'")).sendKeys("shweta.ukp@gmail.com"
		 * ); driver.findElement(By.xpath("//@name='pwd'")).sendKeys("Na6ayan@");
		 * driver.findElement(By.xpath("//@id='signin_submit'")).click();
		 * 
		 * driver.findElement(By.
		 * xpath("//span[@tabindex='0' and @class='lyteDot svgIconsImg']")).click();
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//a[contains(text(),'Documents')]"))).click().build().perform();
		 * Thread.sleep(200); try { driver.switchTo().frame(driver.findElement(By.xpath(
		 * ".//iframe[@id='externalIframe']"))).switchTo().frame(driver.findElement(By.
		 * xpath(".//iframe[@id='AttachmentFrame']"))); }catch(Exception e) {
		 * System.out.println("The ele is not present"); }
		 */
	/*
	 * @Test
	 * 
	 * @Parameters({"url","emailid"}) public void testngparameter(String url,String
	 * emailid) { System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 * driver=new ChromeDriver(); driver.get(url);
	 * driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).clear();
	 * driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(
	 * emailid);
	 * driver.findElement(By.xpath("//button[text()='Continue']")).click();
	 * 
	 * 
	 * }
	 */
		/*
		 * Select oselect=new Select(driver.findElement(By.xpath("//abc")));
		 * List<WebElement> osize=oselect.getOptions(); int lissize=osize.size();
		 * 
		 * for(int i=0;i<osize.size();i++) { String
		 * ovalue=oselect.getOptions().get(i).getText(); System.out.println(ovalue);
		 * oselect.selectByIndex(i); if(ovalue.contentEquals("Africa"))
		 * oselect.selectByIndex(i);
		 * 
		 * }
		 * 
		 * List<WebElement> radiobtn=driver.findElements(By.name("tOOLSQA")); boolean
		 * bvalue=false; if(radiobtn.get(0).isSelected()) { radiobtn.get(1).click();
		 * 
		 * }else { radiobtn.get(0).click(); radiobtn.get(1).click(); }
		 * 
		 * Actions action1=new Actions(driver);
		 * action1.moveToElement(driver.findElement(By.xpath("abc"))).click();
		 */

}
}
