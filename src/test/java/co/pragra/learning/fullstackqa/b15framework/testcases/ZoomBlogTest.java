package co.pragra.learning.fullstackqa.b15framework.testcases;

import co.pragra.learning.fullstackqa.b15framework.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ZoomBlogTest {
    WebDriver driver;
    TopNavBar navBar;
    ZoomBlogPage zoomBlogPage;


    @BeforeSuite
    public void setUp() {
//        driver   = DriverManager.getDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://zoom.us/");
    }
    @Test
    public void testClickOnBlog() throws InterruptedException {
        navBar = new TopNavBar(driver);
        zoomBlogPage = navBar.clickOnBlog();
        Assert.assertEquals("Zoom Blog - The Video Communications Company",driver.getTitle());
        Actions act=new Actions(driver);
//   driver.findElement(By.xpath("//div[@class='center']/a[@class='button simple']")).click();
        act.moveToElement(driver.findElement(By.xpath("//div[@class='center']/a[@class='button simple']")))
                .click().build().perform();
        Thread.sleep(2000);
//
//        Select sel=new Select(driver.findElement(By.cssSelector("div.zm-select:nth-child(1) > div:nth-child(1)")));
//                sel.selectByVisibleText("Feb");

        Thread.sleep(8000);
    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
