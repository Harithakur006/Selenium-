package com.Testprojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tag_Name {
 public static void main (String[]args) {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 
	List<WebElement> links = driver.findElements(By.tagName("a"));
	//links.size();

	System.out.println("total links:"+ links.size());
 System.out.println(links.get(0).getText());
	
  String hari=links.get(8).getText(); 
  System.out.println(hari);//i can write this way also
 driver.close();
 }
}
