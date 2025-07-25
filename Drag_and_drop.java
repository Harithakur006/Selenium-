package com.Testprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://jqueryui.com/");

Actions act = new Actions(driver);
driver.findElement(By.partialLinkText("Drop")).click();
driver.switchTo().frame(0);
WebElement source= driver.findElement(By.id("draggable"));
WebElement target= driver.findElement(By.id("droppable"));
	
act.dragAndDrop(source, target).perform();	
	}

}
