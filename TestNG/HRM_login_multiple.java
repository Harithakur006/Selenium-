package com.TestNG_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class HRM_login_multiple{
	
	WebDriver driver;
	
  @Test(dataProvider="loginData")
  public  void loginHRM(String un, String ps) {
driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(un);
driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(ps);
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
  }
	  
  @DataProvider
  public Object [][]loginData(){
	return  new Object[][] {
	new Object[]{"admin","admin123"},
	new Object[]{"vinod","vinod123"},
	new Object[]{"ram","ram123"},
	new Object[]{"admin","admin123"},

	};
  }
  @AfterMethod
	public void logout() {
		if(driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("login pass");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
	driver.findElement(By.partialLinkText("Log")).click();	
		}
		else {
			System.out.println("login fail");
		}
  }	
		@BeforeTest
		public void beforeTest() {
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
		
  @AfterTest
  public void afterTest() {driver.close();
	  
   }
  }
  
	  
  

