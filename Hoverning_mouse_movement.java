package com.Testprojects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Hoverning_mouse_movement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://istqb.in/");
		Actions act = new Actions(driver);
	WebElement menu= driver.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(menu).perform();
		List<WebElement> subMenu = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li"));
		for(WebElement m:subMenu) {
			System.out.println(m.getText());
		
		driver.close();
		}
	
	
	}

}
