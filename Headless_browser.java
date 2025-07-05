package com.Testprojects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	
	}

}
