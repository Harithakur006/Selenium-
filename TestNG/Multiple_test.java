package com.TestNG_project;

import java.time.Duration;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_test {
  @Test(priority=1)
  public void test_Amazon() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	System.out.println("Title:" + driver.getTitle());
  driver.close();
  }
  @Test(priority = 4)
  public void test_myntra() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.in/");
		System.out.println("Title:" + driver.getTitle());
	  driver.close();  
  }
  @Test(priority = 3)
  public void Ajio() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.in/");
		System.out.println("Title:" + driver.getTitle());
	  driver.close();
  }
  @Test(priority=2)
  public void meesho() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.meesho.in/");
		System.out.println("Title:" + driver.getTitle());
	  driver.close();
  }
}
