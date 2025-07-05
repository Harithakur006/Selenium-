package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=  new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebElement emailId = driver.findElement(By.cssSelector("input[type='text']"));
	emailId.sendKeys("harithakur");
WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][aria-label=\"Password\"]"));
password.sendKeys("12345");
WebElement loginbtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
loginbtn.click();
driver.close();
	
	
	}

}
