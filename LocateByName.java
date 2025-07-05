package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebElement emailId= driver.findElement(By.name("email"));
emailId.sendKeys("harithaur*****");
	
WebElement password = driver.findElement(By.name("pass"));
password.sendKeys("12345678");
driver.findElement(By.name("login")).click();
driver.close()
;	}

}
