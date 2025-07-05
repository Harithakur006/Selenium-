package com.Testprojects;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiffrenetBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = null;
 Scanner scn = new Scanner(System.in);
 int choice;
 System.out.println("select your browser\n1. chrome\n2. edge\n3.firefox\nEnter choice: ");
 choice=scn.nextInt();
 
 switch(choice){
 case 1:
	 driver= new ChromeDriver();
	 
 case 2:
	 driver = new EdgeDriver();
	 
 case 3:
	 driver= new FirefoxDriver();
	 
	 }
 driver.manage().window().maximize();
 driver.get("https://www.google.com/search?q=orangehrm+login&oq=or&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTISCAEQLhhDGMcBGNEDGIAEGIoFMgYIAhBFGEAyBggDEEUYOTIMCAQQIxgnGIAEGIoFMhIIBRAuGEMYxwEY0QMYgAQYigUyBggGEEUYPDIGCAcQRRg80gEINDY0NGowajSoAgCwAgA&sourceid=chrome&ie=UTF-8");
String title=driver.getTitle();	
System.out.println("title: "+ title);
driver.close();
	}

}
