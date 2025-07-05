package com.Testprojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglist_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://omayo.blogspot.com/");

WebElement handling = driver.findElement(By.id("multiselect1"));
	Select cars = new Select(handling);
	Select car = new Select(driver.findElement(By.id("multiselect1")));
	
	List<WebElement> carlist= car.getOptions();
	System.out.println("all car name ");
	for(WebElement gadi:carlist)
		System.out.println(gadi.getText());
	 
	car.selectByIndex(1);
   
	car.selectByIndex(4);
List<WebElement>selectedcars=car.getAllSelectedOptions();

for(WebElement gadi:selectedcars)
	System.out.println(gadi.getText());

cars.deselectByIndex(1);
	}

}
