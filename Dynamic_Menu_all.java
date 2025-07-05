package com.Testprojects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Menu_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");	

	List<WebElement> menu= driver.findElements(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a"));
for(WebElement m: menu) {
	System.out.println(m.getText());
	
}
	
	driver.quit();
	}

}
