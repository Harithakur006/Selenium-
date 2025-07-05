package com.Testprojects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;

public class Fluent_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		

	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		//from city
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		driver.findElement(By.id("src")).sendKeys("kolha");
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"autoSuggestContainer\\\"]/div/div/div[1]/div/div[1]/ul/li[2]/div/text")));
		//Thread.sleep(5000);- pause for completing task
        driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[2]/div/text"));
        
		//to city
	driver.findElement(By.id("dest")).sendKeys("mumb");

	driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text"));
	
	// Calendar 
	driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
	
	//date
	driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/span[1]/div[5]/span[1]")).click();
	
	//Search
	driver.findElement(By.id("search_button")).click();
	
	//result 
	
	System.out.println();driver.findElement(By.xpath("//*[@id=\"U14\"]")).getText();
	


	}

}
