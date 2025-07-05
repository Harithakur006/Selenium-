package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Located_By_class_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");

WebElement serchbox= driver.findElement(By.className("gLFyf"));
serchbox.sendKeys("operncart.com");
serchbox.sendKeys(Keys.ENTER);

String title=driver.getTitle();
if(title.contains("opencart"))
	System.out.println("correct serch displyed");

else
	System.out.println("title not matched");
driver.close();

	}

}
