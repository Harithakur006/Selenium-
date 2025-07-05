package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInk_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.com/");
 driver.manage().window().maximize();
 
 WebElement aboutLink= driver.findElement(By.linkText("About"));
 
 aboutLink.click();
 driver.close();
 
 
	}

}
