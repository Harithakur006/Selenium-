package com.TestNG_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GoogleSearchTest {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void startReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/MySimpleReport.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Google Test Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Hari");
    }

    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleSearchTest() {
        test = extent.createTest("Google Search");

        try {
            test.info("Opening Google");
            driver.get("https://www.google.com");

            test.info("Typing in search bar");
            driver.findElement(By.name("q")).sendKeys("ExtentReports");
            Thread.sleep(1000);

            test.pass("Google Search Pass");

        } catch (Exception e) {
            test.fail("Test failed due to: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterTest
    public void endReport() {
        extent.flush();
    }
}
