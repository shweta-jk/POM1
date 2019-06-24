package com.zohocrm.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zohocrm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long Page_Time_Outs=40;
	public static long Implicit_Wait=30;
	
	static Workbook book;
	static Sheet sheet;

	
	public static String Testdata_sheetpath="C:\\Users\\skulkarni74\\eclipse-workspace\\POM1\\src\\main\\java\\com\\zohocrm\\qa\\testdata\\CRMTestData.xlsx";
	
	
	
	
	public static void signout()
	{
		driver.findElement(By.xpath("//img[@id='topdivuserphoto_22163000000062013']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	}
	
	public static Object[][] getTestData(String sheetname)
	{
		FileInputStream file=null;
		try
		{
			file=new FileInputStream(Testdata_sheetpath);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			book=WorkbookFactory.create(file);
		}catch(IOException e)
		{	
		
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetname);
		Object data [][]=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(k).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
				
			}
		}
		
		return data;
		
	}

	public static void takeScreenshotAtEndOfTest() throws IOException 
	{
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		FileUtils.copyFile(scrFile,new File(currentDir + "/screenshots/" +System.currentTimeMillis() + ".png"));
		
	}
	
	public static void switchtoAlert()
	{
		Alert alert=driver.switchTo().alert();
			  
		System.out.println(alert.getText());	
		alert.accept();
	}
	
	public static void switchtofileupload()
	{
		driver.findElement(By.xpath("//browse_button")).sendKeys("/users/docs/abc.docx");
	}
	
	public static void switchtoframe() throws InterruptedException
	{
		driver.switchTo().frame("externalIframe");
		Thread.sleep(2000);
	}
	
	public static void mouseoverelement()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//element"))).build().perform();
		driver.findElement(By.xpath("//@id='Fleet'")).click();
	}
	
	public static void draganddrop()
	{
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//element"))).moveToElement(driver.findElement(By.xpath("//drop"))).release().build().perform();
	}
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout)
	{
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	public static void switchtowindow() throws InterruptedException
	{
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowId=it.next();
		String childwindowId=it.next();
		driver.switchTo().window(childwindowId);
		Thread.sleep(2000);
		System.out.println("The child window title is"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowId);
		Thread.sleep(2000);
		System.out.println("The parent window title is"+driver.getTitle());
		
		
		
	}
	
}	

