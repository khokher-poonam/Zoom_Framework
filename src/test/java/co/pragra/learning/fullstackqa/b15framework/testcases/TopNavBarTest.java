package co.pragra.learning.fullstackqa.b15framework.testcases;

import co.pragra.learning.fullstackqa.b15framework.listeners.ScreenshotListener;

import co.pragra.learning.fullstackqa.b15framework.pages.*;

import co.pragra.learning.fullstackqa.b15framework.pages.DownLoadPage;
import co.pragra.learning.fullstackqa.b15framework.pages.LiveTrainingPage;
import co.pragra.learning.fullstackqa.b15framework.pages.RequestDemoPage;
import co.pragra.learning.fullstackqa.b15framework.pages.SignInPage;
import co.pragra.learning.fullstackqa.b15framework.pages.SupportPage;
import co.pragra.learning.fullstackqa.b15framework.pages.TopNavBar;
import co.pragra.learning.fullstackqa.b15framework.pages.VideoTutorialPage;
import co.pragra.learning.fullstackqa.b15framework.pages.ZoomBlogPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ScreenshotListener.class)
public class TopNavBarTest {
    WebDriver driver;
    TopNavBar navBar;
    RequestDemoPage demoPage;
    VideoTutorialPage videoTutorialPage;
    WebinarsEventsPage webinarsEventsPage;
    ZoomBlogPage zoomBlogPage;
    SupportPage supportPage;
    ZoomFAQPage zoomFaqPage;
    LiveTrainingPage liveTrainingPage;
    PlanPricingPage PlanPricingPage;
    DownLoadPage downloadpage;


    @BeforeSuite
    public void setUp() {
//        driver   = DriverManager.getDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://zoom.us/");
    }

    @Test
    public void ClickOnRequestDemo(){
        navBar = new TopNavBar(driver);
        demoPage = navBar.clickOnRequest();
//        Assert.assertEquals("https://zoom.us/livedemo",driver.getCurrentUrl());
    }

    @Test
    public void ClickOnLiveTraining()
    {
        navBar = new TopNavBar(driver);
        liveTrainingPage = navBar.clickOnLiveTra();
//        Assert.assertEquals("Live Training Webinars & Zoom Help Center",driver.getTitle());
    }
    @Test
    public void clickOnWebEv()
    {
        navBar = new TopNavBar(driver);
        webinarsEventsPage = navBar.clickOnWesEs();
//        Assert.assertEquals("Webinars and Events",driver.getTitle());
    }

//    @Test
//    public void testClickOnBlog()
//    {
//        navBar = new TopNavBar(driver);
//        zoomBlogPage = navBar.clickOnBlog();
//        Assert.assertEquals("Zoom Blog - The Video Communications Company",driver.getTitle());
//        Actions act=new Actions(driver);
////   driver.findElement(By.xpath("//div[@class='center']/a[@class='button simple']")).click();
//        act.moveToElement(driver.findElement(By.xpath("//div[@class='center']/a[@class='button simple']")))
//                .click().build().perform();
//    }


    @Test
    public void PlanPricing()
    {
 driver.get("https://zoom.us/pricing");
        PlanPricingPage page =new PlanPricingPage(driver);
//        page.clickPlanPricingIn();

    }
    @Test
    public void ContactSales() throws InterruptedException {
        driver.get("https://zoom.us/contactsales");
        ContactSalesPage page =new ContactSalesPage(driver);
//        page.clickContactSalesIn();
        Assert.assertEquals("Contact Sales - Zoom",driver.getTitle());

    }

    @Test
    public void JoinMeeting(){

        driver.get("https://zoom.us/join");
        JoinMeetingPage page = new JoinMeetingPage(driver);
        page
                .enterText("poonamkhokher@gmail.com")
                .clickJoinIn();
    }
//    @Test
//    public void signInTest(){
//
//        driver.get("https://zoom.us/signin");
//        SignInPage page = new SignInPage(driver);
//            page
//                .enterEmail("poonamkhokher@gmail.com")
//                .enterPassword("password")
//                .clickSignIn();
//    }
    @Test(dataProvider="dummyDataProvider")
    public void signInTest(String email , String pass){
        driver.get("https://zoom.us/signin");
        SignInPage page = new SignInPage(driver);
        page
                .enterEmail(email)
                .enterPassword(pass)
                .clickSignIn();
        System.out.println( email +"" + pass);
    }
    @DataProvider
    public Object[][] dummyDataProvider(){
        return new Object[][] {
                {"poonamkhokher@gmail.com","Pookho@123"}
        };
    }

    @Test
    public void clickOnDownloadZoom() {
    	navBar=new TopNavBar(driver);
    	downloadpage=navBar.clickDownLoad();
    	
    }
    @Test
    public void ClickOnSrt()
    {
//        driver.get("https://support.zoom.us/hc/en-us");
        navBar =new TopNavBar(driver);
        supportPage = navBar.clickOnSupport();
//        Assert.assertEquals("https://support.zoom.us/hc/en-us", driver.getTitle());
    }
    @Test
    public void ClickOnVideotu()
    {
        navBar = new TopNavBar(driver);
        videoTutorialPage = navBar.clickOnVideoTut();
//        Assert.assertEquals("Video Tutorial - The Video Communications Company",driver.getTitle());
    }
    @Test
    public void clickFaq()
    {
        navBar =new TopNavBar(driver);
        zoomFaqPage = navBar.clickOnFaq();
//        Assert.assertEquals("Frequently Asked Questions & Zoom Help Center", driver.getTitle());
    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
