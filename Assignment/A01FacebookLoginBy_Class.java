package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01FacebookLoginBy_Class {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.className("_6lux"));
	email.sendKeys("harithakur");

	WebElement pass = driver.findElement(By.className("_9npi"));
	pass.sendKeys("1234");
	
	driver.close();	
	}
}