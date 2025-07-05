package MyMavenAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assertion_Test {
	
	//String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
			WebDriver driver;
			@Test(dataProvider="getlogin_data")
 
	public void loginToHRM(String un,String ps) {
	driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(un); 
	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(ps);
  driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
  
  //actUrl = driver.getCurrentUrl();
  Assert.assertTrue(driver.getPageSource().contains("dashboard"));
  }
			@DataProvider
public Object[][] getlogin_data()	{
	return new Object[][] {
		new  Object[] {"admin","admin123"},
		new  Object[] {"vinod","vinod123"},
		new  Object[] {"rahul","rahul123"},
		new  Object[] {"raju","raju123"},	
     };
}
@AfterMethod 
public void logout() {
	if(driver.getCurrentUrl().contains("dashboard")) {
		System.out.println("login pass");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
	
	}
	else {
		System.out.println("login fail");
	 }
	}
@BeforeTest
public void beforetest() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
  @AfterTest
  public void aftertest() {
	  driver.close();
  }

 }

