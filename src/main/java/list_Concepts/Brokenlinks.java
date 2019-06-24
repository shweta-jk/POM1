package list_Concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.in/crm/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		List<WebElement> images=driver.findElements(By.tagName("img"));

			links.addAll(images);
			
			System.out.println("The total no of links and images are**" +  links.size());
			
			List<WebElement> activelinks= new ArrayList<WebElement>();
			
			for(int i=0;i<links.size();i++)
			{
				if(links.get(i).getAttribute("href")!=null &&(!links.get(i).getAttribute("href").contains("javascript")&&
						(!links.get(i).getAttribute("href").contains("accounts"))))
				{
					activelinks.add(links.get(i));
				}	
			}
	
	
			System.out.println("the active links are"+  activelinks.size());
			
			
			for(int j=0;j<activelinks.size();j++)
			{
				
				HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
				
				connection.connect();
				String msg=connection.getResponseMessage();
				connection.disconnect();
				
				System.out.println(activelinks.get(j).getAttribute("href")+"---->"+msg);
				
				
			}
			
			
			
	
	}
}