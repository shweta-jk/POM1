package javaBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class traversemultidimarray {

				WebDriver driver;
			  public static void main(String[] args) {
		/*
		 * int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		 * 
		 * int x=myNumbers[1][2]; //System.out.println(x); for (int i = 0; i <
		 * myNumbers.length; ++i) { for(int j = 0; j < myNumbers[i].length; ++j) {
		 * System.out.println(myNumbers[i][j]); } }
		 */
		/*
		 * feb=//span[@class='lyteCalsCalMonth' and contains(text(),'February')]
		 * day=//span[@class='lyteCalDateSpan' and contains(text(),'21')]
		 * year=//span[@class='lyteCalsCalYear' and contains(text(),'2019')]
		 * 
		 * 
		 * 
		 * 
		 * String date="21-Feb-2019"; String[] date1=date.split("-");
		 */
			  
			  
			  
			 

}
	

public void selectdate(String yr,String mon,String day)
{
	driver.findElement(By.xpath("//span[@class='lyteCalsCalYear' and contains(text(),'"+yr+"')]"));
	driver.findElement(By.xpath("//span[@class='lyteCalsCalMonth' and contains(text(),'"+mon+"')]"));
	driver.findElement(By.xpath("//span[@class='lyteCalDateSpan' and contains(text(),'"+day+"')]"));
}
	
}
