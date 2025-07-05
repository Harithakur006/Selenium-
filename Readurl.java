package com.Testprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/");
String url=driver.getCurrentUrl();
System.out.println("URL:"+url );
driver.close();
	}

}
