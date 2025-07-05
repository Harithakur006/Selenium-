package com.Testprojects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class echo_echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://echoecho.com/htmlfroms09.htm");
 List<WebElement> products = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
 for(WebElement pr: products) {
	 System.out.println("before....");
	 System.out.println(pr.getAttribute("Value")+"selected:"+pr.isSelected());
	 System.out.println(pr.getAttribute("Value")+"selected:"+pr.isDisplayed());
	 System.out.println(pr.getAttribute("Value")+"selected:"+pr.isEnabled());
 
 
	 if(pr.isSelected()) {
	 pr.click();
 }
 int[]nos = {1,2,3,4,5,6,7};
 for(int i=0; i<nos.length; i++)
 System.out.println(nos[i]);
		 
 for (int n : nos)
	 System.out.println(n);
 
 
 }	
	
	
	
	}

}
