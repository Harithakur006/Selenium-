package com.Testprojects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		///driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		//from city
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"autoSuggestContainer\\\"]/div/div/div[1]/div/div[1]/ul/li[2]/div/text")));
		driver.findElement(By.id("src")).sendKeys("kolha");
		//Thread.sleep(5000);- pause for completing task
        driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[2]/div/text"));
        
		//to city
	driver.findElement(By.id("dest")).sendKeys("mumb");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text"));
	
	// Calendar 
	driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
	
	//date
	driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/span[1]/div[5]/span[1]")).click();
	
	//Search
	driver.findElement(By.id("search_button")).click();
	
	//result 
	Thread.sleep(5000);
	System.out.println();driver.findElement(By.xpath("//*[@id=\"U14\"]")).getText();
	

	}

}
