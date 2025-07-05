package com.Testprojects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.get("https://demoqa.com/alerts");
Alert alt;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//driver.findElement(By.id("alertButton")).click();
	
	WebElement clickalert = driver.findElement(By.id("alertButton"));
	js.executeScript("arguments[0].click()",clickalert);
	alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	}

}
