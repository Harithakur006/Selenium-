package MyMavenAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LoginPageTest {

  @Test
    

    public class LoginPageTest2 {
        private WebDriver driver;
        private LoginPage loginPage;

        @Before
        public void setUp() {
            // Set up WebDriver (make sure to have the ChromeDriver executable in your PATH)
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://amazon.com/login"); // Replace with your login page URL
            loginPage = new LoginPage(driver);
        }

        @Test
        public void testLoginWithInvalidCredentials() {
            loginPage.login("invalidUser", "invalidPass");
            String errorMessage = loginPage.getErrorMessage();
            org.testng.Assert.assertEquals("Invalid username or password.", errorMessage);
        }

        @After
        public void tearDown() {
            // Close the browser
            driver.quit();
        }
    }

  }

