package com.TestNG_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	WebDriver driver;
	
@Parameters({"username","password"})
  @Test
  
  public void loginpractice(String un , String ps) {
	  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
  }
@Parameters({"username1","password1"})
  @Test
  public void logintest2(String un, String ps ) {
	  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
  }

@AfterMethod
public void aftermethod() {
	driver.findElement(By.partialLinkText("Log out")).click();
}
  
	  @BeforeTest 
	  public void beforeclass() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://practicetestautomation.com/practice-test-login/");
	  }
 @AfterTest
 public void aftertest() {
	 driver.close();
 
  }
}
