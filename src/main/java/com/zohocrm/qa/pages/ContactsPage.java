package com.zohocrm.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.zohocrm.qa.base.TestBase;
import com.zohocrm.qa.utilities.TestUtil;

public class ContactsPage extends TestBase {

	@FindBy(id = "combo")
	WebElement Contactspgcheck;

	@FindBy(xpath = "//button[ @data-zcqa='cv_createbtn']")
	WebElement clicknewContactbtn;

	@FindBy(id = "Crm_Contacts_FIRSTNAME")
	WebElement firstname;

	@FindBy(id = "Crm_Contacts_LASTNAME")
	WebElement lastname;

	@FindBy(id = "//span[@tabindex='7']")
	WebElement persontitle;

	@FindBy(id = "Crm_Contacts_PHONE")
	WebElement conphone;

	@FindBy(id = "saveContactsBtn")
	WebElement Savebtn;

	@FindBy(xpath = "//span[@tabindex='0' and @class='lyteDot svgIconsImg']")
	WebElement dots;

	@FindBy(xpath = "//a[contains(text(),'Documents')]")
	WebElement docs;

	@FindBy(xpath = "//a[@id='wstopcreatenewbutton']")
	WebElement createdoc;

	@FindBy(xpath = "//span[contains(text(),'Document') and @class='ui-zmenu-text']")
	WebElement docupload;
	
	@FindBy(id = "wsuploadmenu")
	WebElement uploadclick;////li[@title='Upload']
	
	@FindBy(xpath = "//li[@id='upload_desktopfile'] ")
	WebElement filesclick;
	

	@FindBy(xpath = "//span[contains(text(),'Start Upload')]")
	WebElement startupload;
	
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);

	}

	public boolean verifycontactspage() {
		return Contactspgcheck.isDisplayed();
	}

	/*
	 * public void verifycontactsChecked() throws InterruptedException {
	 * driver.findElement(By.xpath("//span[ @id='selectEntity_22163000000065203']"))
	 * .click();
	 * driver.findElement(By.xpath("//span[ @id='selectEntity_22163000000065204']"))
	 * .click();
	 * 
	 * Thread.sleep(20000);
	 * 
	 * }
	 */

	public void clickondots() throws InterruptedException {
		dots.click();
		Actions action = new Actions(driver);
		action.moveToElement(docs).click().build().perform();
		Thread.sleep(20000);

		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@id='externalIframe']")));
		//driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@id='AttachmentFrame']")));
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(uploadclick).click().build().perform();
		action1.moveToElement(filesclick).click().perform();
		filesclick.sendKeys("C:\\Users\\skulkarni74\\Desktop\\SOQL.docx");
		Thread.sleep(100);
		startupload.click();
		
		
		/*
		 * driver.switchTo().defaultContent(); Set<String>
		 * handle=driver.getWindowHandles() ;
				
		driver.switchTo().window("CDwindow-2BCDD88A9CAA6B4D6DAE67200AFB6C91");*/
		
		
		/*
		 * Actions action2 = new Actions(driver);
		 * action2.moveToElement(createdoc).click().build().perform();
		 * action2.moveToElement(docupload).click().perform();
		 */
			
		
		
		/*
		 * int size = driver.findElements(By.tagName("iframe")).size(); for(int i=0;
		 * i<=size; i++){ driver.switchTo().frame(i);
		 * 
		 * if(createdoc != null)
		 * 
		 * //int total=driver.findElements(By.xpath("html/body/a/img")).size();
		 * 
		 * driver.switchTo().defaultContent();}
		 */

		/*
		 * List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		 * System.out.println("Number of frames in a page :" + ele.size());
		 * for(WebElement el : ele){ //Returns the Id of a frame.
		 */
		
		/*
		 * System.out.println("Frame Id :" + el.getAttribute("id"));
		 * System.out.println("Frame name :" + el.getAttribute("name")); }
		 */
		 

		// TestUtil.switctoframe();
		/*
		 * Select sel=new Select(createdoc); sel.selectByVisibleText("Document");
		 * 
		 * System.out.println("The element is selected");
		 */

	}

	public void clickonNewContact(String fname, String lname, String phone) {
		// Select select=new Select(persontitle);
		// driver.findElement(By.xpath("//span[@class='select2-selection
		// select2-selection--single' and
		// @aria-labelledby='select2-Crm_Contacts_FIRSTNAME_SALUTATION-container']")));
		// select.selectByVisibleText(title);
		clicknewContactbtn.click();
		// persontitle.click();
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		conphone.sendKeys(phone);
		Savebtn.click();

	}

}
