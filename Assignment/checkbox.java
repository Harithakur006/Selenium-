package Assignment;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.WebDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
 driver.get(ARRAY_MISMATCH_TEMPLATE "");   
	}

}
