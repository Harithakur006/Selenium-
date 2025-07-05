package com.Testprojects;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_table {
	public static void main(String[]args) {
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
 
	//List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
List<WebElement> header = driver.findElements(By.tagName("th"));
	for (WebElement h: header)
	System.out.println(h.getText());
	List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	System.out.println("table row:"+ row.size());
	for(WebElement R: row)
		System.out.println(R.getText());
	
	Random rm= new Random();
	int n = rm.nextInt(10);
	System.out.println(n);
	
	driver.close();
	}
}
