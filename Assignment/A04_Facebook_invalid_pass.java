package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04_Facebook_invalid_pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();	
driver.get("https://www.facebook.com/");

WebElement emailId = driver.findElement(By.className("_6luy"));
emailId.sendKeys("harithakur816@gmail.com");
WebElement password = driver.findElement(By.className("_9npi"));
password.sendKeys("123456");

WebElement login= driver.findElement(By.className("_4jy6"));
login.click();

String err = driver.findElement(By.className("_9ay7")).getText();
System.out.println("error masage:"+ err);




  }
	

}
