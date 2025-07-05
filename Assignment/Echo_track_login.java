package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echo_track_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

WebElement email = driver.findElement(By.className("form-control"));
email.sendKeys("harithaku@");

WebElement password = driver.findElement(By.name("txtPassword"));
password.sendKeys("hari123456");

WebElement login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/div[1]/input[1]"));
login.click();
//String logintest = login.getText();
//System.out.println(logintest);

String err = driver.findElement(By.id("lblMsg")).getText();
System.out.println("Error message:" +err);

if(err.contains("Invalid"))
	System.out.println("test case pass");

else
	
	System.out.println("test case failed");
driver.close();
	}

}
