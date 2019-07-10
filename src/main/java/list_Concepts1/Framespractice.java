package list_Concepts1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Framespractice {

	public static WebDriver driver;

	@Test
	public static void frametest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		/*
		 * WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 * 
		 * driver.switchTo().frame(frame1);
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi There");
		 * driver.switchTo().frame("frame3");
		 * driver.findElement(By.xpath("//input[@id='a']")).click();
		 * driver.switchTo().parentFrame(); driver.switchTo().defaultContent();
		 * driver.switchTo().frame("frame2"); Select os = new
		 * Select(driver.findElement(By.xpath("//select[@id='animals']")));
		 * os.selectByVisibleText("Big Baby Cat");
		 */
		// driver.switchTo().frame("globalSqa");
		/*
		 * iframe[name="GB_frame"]&&#GB_frame~~#txtKeywordsId  ul.new-joblist > li:nth-of-type(1) > header
		 * iframe[name="GB_frame"]&&#GB_frame~~#button  iframe[name^="a-"]~~
		 * ul.new-joblist > div:nth-of-type(2) > div.colombiatracked
		 * iframe[src*="8849256.fls.doubleclick.net"]~~
		 */

		// String
		// title=driver.findElement(By.xpath("//img[@title='TimesJobs']")).getText();
		// Assert.assertEquals(title,"TimesJobs","Title do not match");

		
		  driver.findElement(By.xpath("//input[@id='txtKeywords']")).sendKeys(
		  "Selenium");
		  
		  driver.findElement(By.xpath("//input[@id='txtLocation']")).sendKeys(
		  "Bangalore");
		  
		  Select oselect = new Select(driver.findElement(By.id("cboWorkExp1")));
		  oselect.selectByVisibleText("6 years");
		  driver.findElement(By.xpath("//button[contains(text(),'Find Jobs')]")).click(
		  ); // driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		  // driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys("Ssk");
		  //
		  driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("abc_Ssk")
		  ; // driver.findElement(By.xpath("//span[@class='material-icons close-modal
		  // modal-action modal-close' and contains(text(),'close')]")).click(); try {
		  /*Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		  Auto-generated catch block e.printStackTrace(); }
		  
		  Alert myalert=driver.switchTo().alert(); myalert.dismiss();
		  */
		  WebElement formel=driver.findElement(By.xpath("//form[@id='jobAlertBean']"));
		  
		  
		  Set<String> winhandle=driver.getWindowHandles(); Iterator<String>
		  it=winhandle.iterator(); while(it.hasNext()) { String parenthan=it.next();
		  String childhan=it.next(); System.out.println(parenthan+""+childhan);
		  driver.switchTo().window(childhan); }
		  
		/*  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0], args) WebDriverWait wait=new
		  WebDriverWait(driver,30); wait.until(ExpectedConditions.alertIsPresent());
		  Alert myalert=driver.switchTo().alert();*/
		  
		  try { //WebElement
		  formel=driver.findElement(By.xpath("//input[@name='emailId']"));//.sendKeys(
		  // * "abc_ssk@gmail.com"); //driver.switchTo().frame("GB_frame1");
		  
		  List<WebElement> webels=driver.findElements(By.tagName("iframe")); for(int
		  i=0;i<webels.size();i++) { System.out.println("The no of iframes are:"
		  +webels.size());
		  
		  System.out.println(webels.get(i).getAttribute("id"));
		  
		  }
		  
		  
		  
		  JavascriptExecutor jsExecutor = (JavascriptExecutor)driver; String
		  currentFrame = (String) jsExecutor.executeScript("return self.name");
		  System.out.println(currentFrame);
		  
		  //formel.sendKeys("abc_ssk@gmail.com");
		  
		  //WebElement active_element = driver.switchTo().activeElement();GB_frame1
		  //System.out.println(active_element); //WebElement formel =
		  driver.findElement(By.xpath("//form[@id='jobAlertBean']"));
		  
		  //Alert myalert=driver.switchTo().alert();
		  driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys(
		  "abc_ssk@gmail.com");
		  driver.findElement(By.xpath("//input[@id='textFA']")).click();
		  driver.findElement(By.xpath("//input[@id='cboPresFuncArea_13']")).click();
		  driver.findElement(By.xpath("//input[@id='cboPresFuncArea_15']")).click();
		  driver.findElement(By.xpath("//input[@title='HR/PM/IR/Training']")).click();
		  driver.findElement(By.xpath("//a[@href='javascript:FAMultiSelect.hideDiv()']"
		  )).click();
		  
		  
		  WebElement ele=driver.findElement(By.xpath("//input[@value='Submit']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",ele);
		  
		  }catch(Exception e) { e.printStackTrace(); }
		  
		  List<WebElement> titles=driver.findElements(By.
		  xpath("//img[@src='http://globalsqa.com/wp-content/uploads/2015/10/logo1.png' and @alt=\"GlobalSQA\"]"
		  ));
		  
		  for(int i=0;i<titles.size();i++) {
		  System.out.println(titles.get(i).getText()); }
		  
		  // Assert.assertEquals(title,"TimesJobs","Title do not match");
		  driver.switchTo().defaultContent();
		  
		  WebElement ele=driver.findElement(By.xpath("//li[@id='tabind']")); Actions
		  action=new Actions(driver);
		  action.click(ele).moveToElement(driver.findElement(By.xpath(
		  "//span[@title='IT-Hardware/Networking']"))).click().build().perform();
		  driver.findElement(By.xpath("//span[@title='Affluent Global Services']")).
		  click();
		  
		 

		}
	}

