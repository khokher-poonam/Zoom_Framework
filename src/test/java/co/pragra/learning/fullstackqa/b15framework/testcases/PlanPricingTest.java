package co.pragra.learning.fullstackqa.b15framework.testcases;

import co.pragra.learning.fullstackqa.b15framework.pages.PlanPricingPage;
import co.pragra.learning.fullstackqa.b15framework.pages.TopNavBar;
import co.pragra.learning.fullstackqa.b15framework.pages.ZoomBlogPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PlanPricingTest {

    WebDriver driver;
    TopNavBar navBar;
    PlanPricingPage planPricingPage;


    @BeforeSuite
    public void setUp() {
//        driver   = DriverManager.getDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://zoom.us/");
    }
    @Test
    public void testClickOnPlanPricing() throws InterruptedException {
        navBar = new TopNavBar(driver);
        planPricingPage = navBar.ClickOnPlanPricing();
      driver.findElement(By.xpath("//a[@class='btn-cta cta-md cta-bgyellow']")).click();
      Thread.sleep(4000);
    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
