package com.Testprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheTitile {

	public static void main(String[] args) {
		String exptitle = "Google",acttitle;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

	acttitle=driver.getTitle();
	System.out.println("get the titile: "+ acttitle);
	
	if(exptitle.equals(acttitle))
		System.out.println("Opened google \nTest case pass");	
		
	else 
		System.out.println("not opened google\n test case fail");
	driver.close();
	}

}
