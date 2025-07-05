package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jetbrains.letsPlot.Geom.image;

public class Partial_Link_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
 driver.findElement(By.partialLinkText("Images")).click();
//driver.close();
	}

}
