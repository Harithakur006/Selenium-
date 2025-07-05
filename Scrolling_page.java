package com.Testprojects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for popup notification 
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(op);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://echoecho.com/htmlforms10.htm");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)","");
	
	}

}
