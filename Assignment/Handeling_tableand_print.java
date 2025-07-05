package Assignment;


import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handeling_tableand_print {
	public static void main(String[]args) {
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://demoqa.com/webtables");
 
	//List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
List<WebElement> firstname = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
	for (WebElement f: firstname)
	System.out.println(f.getText());
	List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
	System.out.println("table row:"+ row.size());
	for(WebElement R: row)
		System.out.println(R.getText());
	
	Random rm= new Random();
	int n = rm.nextInt(row.size());
	System.out.println(n);
	System.out.println(row.get(n).getText());
	
	driver.close();
	
	/*for(int i =0; i< Company.size(); i++) {
	if(company.get(i).gettext().equal("Kierra"))
		break;
	}*/
	
	
	}
}

