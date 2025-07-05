package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class special_Charector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebElement email= driver.findElement(By.cssSelector("input[type=\"text\"]"));
email.sendKeys("harithakur");
WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
password.sendKeys("12345");

//'^' statr with special character using for button sometimes
	WebElement loginbtn= driver.findElement(By.cssSelector("button[id^=\"u_0_5_\"]"));
	loginbtn.click();
	driver.close();
 
	//	'$'starting are changing 
//WebElement loginbtn= driver.findElement(By.cssSelector("button[id$=\"u_0_5_\"]"));

	// * for half using place for half charactor
	//WebElement loginbtn= driver.findElement(By.cssSelector("button[id$=\"u_0_5_\"]"));
	}

}
