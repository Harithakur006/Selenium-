package MyMavenAssignment;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @DataProvider(name = "loginData")
    public Iterator<Object[]> loginDataProvider() throws Exception {
        CSVReader reader = new CSVReader(new FileReader("src/test/resources/users.csv"));
        List<Object[]> data = new ArrayList<>();
        String[] nextLine;

        reader.readNext(); // skip header
        while ((nextLine = reader.readNext()) != null) {
            data.add(new Object[]{nextLine[0], nextLine[1]});
        }
        reader.close();
        return data.iterator();
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        driver.get("https://example.com/login"); // change this to your login URL

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();

        // Add assertion logic here for successful login validation
    }

    @AfterClass
    public void tearDown() {
       driver.close();
    }
}

