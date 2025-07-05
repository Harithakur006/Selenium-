package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebElement emailId= driver.findElement(By.id("email"));
emailId.sendKeys("harithakur***");

WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("1234567");

WebElement logIn = driver.findElement(By.id("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/button[1]"));
logIn.click();
driver.close();


	}

}
