package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

WebElement radio = driver.findElement(By.xpath("//input[@value='f']"));

System.out.println("selected:"+radio.isSelected());
System.out.println("visible:"+radio.isDisplayed());
System.out.println("enabled:"+radio.isEnabled());
	radio.click();
	}

}
