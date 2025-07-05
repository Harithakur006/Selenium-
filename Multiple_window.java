package com.Testprojects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.citigroup.com/global");
Set<Cookie> cookiehande=driver.manage().getCookies();
driver.findElement(By.xpath("//a[@class='newclose']")).click();
driver.findElement(By.xpath("//a[@class='newclose2']"));

driver.findElement(By.xpath("/*[@id=\\\"container\\\"]/div[2]/div[2]/div/div/div[2]/div/div/a[2]/span[2]")).click();

System.out.println("title:"+ driver.getTitle());

Set<String>windows=driver.getWindowHandles();
Iterator<String>itr = windows.iterator();

String win1 = itr.next();
String win2 = itr.next();

driver.switchTo().window(win2);
System.out.println("title:"+ driver.getTitle());
  driver.findElement(By.linkText("Continue")).click();
  
  Thread.sleep(5000);
  driver.switchTo().window(win1);
  
  driver.findElement(By.linkText("CONTACT US")).click();
  
  Thread.sleep(2000);
  
  driver.quit();
	
	}

}
