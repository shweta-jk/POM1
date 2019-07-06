package list_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtab {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		//*[@id="content"]/table/thead/tr/th[3]
		
			String svalue=driver.findElement(By.xpath("//*[@id=\"content\"]/table/thead/tr/th[2]")).getText();
			System.out.println(svalue);

	}

}
