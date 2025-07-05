package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	Actions act= new Actions(driver);
	WebElement click= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	act.moveToElement(click).contextClick().perform();
	//act.contextClick(click).perform();	
WebElement dbclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
act.moveToElement(dbclick).contextClick().doubleClick().perform();

//controll for alerts on webpages
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	
	//driver.close();
	}
	 }
