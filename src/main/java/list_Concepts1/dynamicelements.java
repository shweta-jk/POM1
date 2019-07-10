package list_Concepts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dynamicelements {

	
		
		 public static WebDriver driver;

		 

		
		
		//*[@id="post-body-5867683659713562481"]/div/table/thead/tr/th[2]
		//*[@id="post-body-5867683659713562481"]/div/table/thead/tr/th[3]
		//*[@id="post-body-5867683659713562481"]/div/table/thead/tr/th[1]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/th
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[2]/th
		
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/td[1]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/td[2]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[2]/td[1]
		 
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[3]/td[6]/a
		//*[@id="content"]/table/tbody/tr[2]/th
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[2]/th
		 
		//*[@id="post-body-5867683659713562481"]/div/table/thead/tr/th[1]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/th
		//*[@id="post-body-5867683659713562481"]/div/table/thead/tr/th[2]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/td[2]
		 
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/td[3]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[2]/td[3]
		 
		//*[@id="post-body-5867683659713562481"]/div/table/thead/tr/th[4]
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[1]/td[3]
		 
		//*[@id="post-body-5867683659713562481"]/div/table/tbody/tr[3]/th
		 String Beforexpath="//*[@id=\"post-body-5867683659713562481\"]/div/table/tbody/tr[";
			String afterxpath="]/td[";
		
		@Test
		public static void dynamictab()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");*/
			
			Actions action=new Actions(driver);
			  action.moveToElement(driver.findElement(By.xpath("abc"))).contextClick().sendKeys(Keys.ENTER).build().perform();
			
			
			
		
		/*
		 * String
		 * Beforexpath="//*[@id=\"post-body-5867683659713562481\"]/div/table/tbody/tr[";
		 * String afterxpath="]/td["; String value="Taipei";
		 */
		
		/*
		 * for(int i=1;i<=4;i++) { for(int j=1;j<=6;j++) {
		 * 
		 * String
		 * reqvalue=driver.findElement(By.xpath(Beforexpath+i+afterxpath+j+"]")).getText
		 * (); System.out.println(reqvalue); if(value.equals(reqvalue)) {
		 * //driver.findElement(By.xpath(Beforexpath+i+afterxpath+6+"]")).click();
		 * //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		 * Actions action=new Actions(driver);
		 * action.moveToElement(driver.findElement(By.xpath(Beforexpath+i+afterxpath+6+
		 * "]"))).contextClick().sendKeys(Keys.ENTER).build().perform();
		 * //action.sendKeys(selectLinkOpeninNewTab); //new
		 * Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).perform();
		 * 
		 * 
		 * 
		 * } }
		 */
		/*To switch between new tabs
		 * ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 * driver.switchTo().window(tabs2.get(1)); driver.close();
		 * driver.switchTo().window(tabs2.get(0));
		 */
			
		
		/*String befxpathheadcol="//*[@id=\"post-body-5867683659713562481\"]/div/table/thead/tr/th[";
		String afxpathcol="]";
		String hgt="Height";
		String cellval="ac";
		
			
	
		
	
		for(int i=1;i<=5;i++)
		{
			
				String headerval=driver.findElement(By.xpath(befxpathheadcol+i+afxpathcol)).getText();
				if(headerval.equals(hgt))
				{	
					System.out.println(headerval);
					for(int k=1;k<=4;k++)
					{
						
										
						for(int j=1;j<i;j++)
						{
						
							if(j==(i-1))
							{
							cellval = driver.findElement(By.xpath(Beforexpath+k+afterxpath+j+"]")).getText();
							System.out.println(cellval);
							}	
						
				}
			}
		}*/
		
		
		
		
	}


		
}



