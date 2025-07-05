package com.Testprojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

WebElement dropdownlist = driver.findElement(By.id("country"));
Select countries = new Select(dropdownlist);

System.out.println("selected:"+ countries.getFirstSelectedOption().getText());
	
	List<WebElement>countrylist= countries.getOptions();
System.out.println("total no:"+countrylist.size());
System.out.println("first country:"+ countrylist.get(0).getText());	

//for printing all country
/* for(WebElement  count: countrylist)
{System.out.println(count.getText());
	}*/

// for printing all country
	for(int i=0; i<countrylist.size();i++) {
		System.out.println(i+"."+ countrylist.get(i).getText());
	 }
	
	//selecting Canada method
	countries.selectByVisibleText("Canada");
	System.out.println("select country:"+ countries.getFirstSelectedOption().getText());
	
	//select by value
	//countries.selectByVisibleText("");
	countries.selectByValue("40");
	System.out.println("Select country:"+ countries.getFirstSelectedOption().getText());	
	}

}


