package com.TestNG_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class OrangeHRMLoginTest {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void setupReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/OrangeHRM_Login_Report.html");
        spark.config().setDocumentTitle("OrangeHRM Automation Report");
        spark.config().setReportName("Login Test Report");
        spark.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("Tester", "Hari");
    }

    @BeforeMethod
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        test = extent.createTest("OrangeHRM Login Test");

        try {
            test.info("Navigating to OrangeHRM login page");
            driver.get("https://opensource-demo.orangehrmlive.com/");

            test.pass("Page opened successfully");

            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));

            test.info("Entering valid credentials");
            username.sendKeys("Admin");
            password.sendKeys("admin123");
            loginBtn.click();

            // Wait and validate login success by checking dashboard element
            Thread.sleep(2000); // you can replace with WebDriverWait

            if (driver.getCurrentUrl().contains("dashboard")) {
                test.pass("Login successful and dashboard loaded");
            } else {
                test.fail("Login failed. Dashboard not loaded.");
            }

        } catch (Exception e) {
            test.fail("Test failed due to exception: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterTest
    public void flushReport() {
        extent.flush();
    }
}

