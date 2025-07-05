package com.Testprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class checkbox_handlening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

WebElement checkbox= driver.findElement(By.cssSelector("input[name^=\"chk_altemail\"]"));
//System.out.println("Select:"+checkbox);
System.out.println("Before");
System.out.println("Selected:"+checkbox.isSelected());

//flase or selecting 
if(checkbox.isSelected()==false) {
	//checkbox.click();
	
	//true foe deselcting
	//if
	//(!checkbox.isSelected()) {
		checkbox.click();
}	
System.out.println("\n After.class.");
System.out.println("Selected:"+checkbox.isSelected());
System.out.println("Visisble:"+checkbox.isDisplayed());	
System.out.println("enable:"+checkbox.isEnabled());
	
	}

}
