package com.Testprojects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot_class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
// robot class for fast and indirect using tabs function in keyboard
//upload file selcting fast with tab button
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://sampleapp.tricentis.com/101/");
	driver.findElement(By.partialLinkText("Automobile")).click();
	driver.findElement(By.linkText("Enter Insurant Data")).click();
	driver.findElement(By.name("Open")).click();
	
	Robot rbt= new Robot();
	for(int i=1;i<=8; i++) {
	Thread.sleep(5000);
	rbt.keyPress(KeyEvent.VK_TAB);
	rbt.keyPress(KeyEvent.VK_DOWN);
	
	rbt.keyPress(KeyEvent.VK_ENTER);
	rbt.keyPress(KeyEvent.VK_TAB);
	for(int t=0; i<7;i++) {
		
	}
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_DOWN);
	 }
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_ENTER);
	}

}
