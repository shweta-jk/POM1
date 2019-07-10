package list_Concepts1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class windowtab {

	 public static WebDriver driver;
	 

		@Test
		public static void dynamictab()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			String
			 Beforexpath="//*[@id=\"post-body-5867683659713562481\"]/div/table/tbody/tr[";
			  String afterxpath="]/td["; String value="Taipei";
			  
				  for(int i=1;i<=4;i++)
				  { 
					  for(int j=1;j<=6;j++) 
					  {
				  
				  
				  String reqvalue=driver.findElement(By.xpath(Beforexpath+i+afterxpath+j+"]")).getText();
				  System.out.println(reqvalue); 
				  if(value.equals(reqvalue))
				  {
				  //driver.findElement(By.xpath(Beforexpath+i+afterxpath+6+"]")).click();
				  //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
				  Actions action=new Actions(driver);
				  action.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath(Beforexpath+i+afterxpath+6+
						  "]"))).keyUp(Keys.SHIFT).build().perform();
				  //action.sendKeys(selectLinkOpeninNewTab); //new
				  //Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).perform();
				  
				  } 
			
				  }		
					  }
				  try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  Set<String> handles=driver.getWindowHandles();
				  Iterator<String> it=handles.iterator();
				  String parentwindow=it.next();
				  String childwindow=it.next();
				  driver.switchTo().window(childwindow);
				  String title=driver.getTitle();
				  System.out.println(title);
}
}