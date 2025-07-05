package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

WebElement bday = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
Select day= new Select(bday);
day.selectByVisibleText("29");

System.out.println(day.getFirstSelectedOption());
	}

}
