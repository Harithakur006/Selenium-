package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
//String source=driver.getPageSource();
//System.out.println(source);

System.out.println(driver.getPageSource());
driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]"));
	driver.close();
	}

}
