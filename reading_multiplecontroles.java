package com.Testprojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.minidev.json.writer.CollectionMapper.ListType;

public class reading_multiplecontroles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
//use of findelements method

List<WebElement>textboxes = driver.findElements(By.cssSelector("input[class=\"form-control\"]"));
textboxes.get(0).sendKeys("saroj");
textboxes.get(1).sendKeys("saroj1234");

driver.findElement(By.xpath("//input[@type=\"submit\"]")).getText();
///driver.close();


	}

}
