package co.pragra.learning.fullstackqa.b15framework.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TopNavBar {

    private WebDriver driver;

    @FindBy(css = "#black-topbar ul>li:nth-child(1)>a")
    private WebElement reqDemo;

    @FindBy(css = "#black-topbar ul>li:nth-child(2)>a")
    private WebElement one800;

    @FindBy(css = "#black-topbar ul>li:nth-child(3)>a")
    private WebElement resources;

    @FindBy(css = "#black-topbar ul>li:nth-child(4)>a")
    private WebElement support;

    @FindBy(css = "#resourcesDropdown>li:nth-child(1)>a")
    private WebElement downlodZoom;

    @FindBy(css = "#resourcesDropdown>li:nth-child(3)>a")
    private WebElement videoTuts;

    @FindBy(css = "#resourcesDropdown>li:nth-child(5)>a")
    private WebElement liveTrainig;

    @FindBy(css = "#resourcesDropdown>li:nth-child(7)>a")
    private WebElement webinar;

    @FindBy(css = "#resourcesDropdown>li:nth-child(9)>a")
    private WebElement blog;

    @FindBy(css = "#resourcesDropdown>li:nth-child(11)>a")
    private WebElement faq;

    public TopNavBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public RequestDemoPage  clickOnRequest(){
        this.reqDemo.click();
        return new RequestDemoPage(driver);
    }

    public DownLoadPage clickDownLoad(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources)
                .pause(1000)
                .moveToElement(downlodZoom)
                .click()
                .build()
                .perform();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Download Center - Zoom" );
        return new DownLoadPage(driver);
    }


    public VideoTutorialPage clickOnVideoTut(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources)
                .pause(1000)
                .moveToElement(videoTuts)
                .click()
                .build()
                .perform();
        return new VideoTutorialPage(driver);
    }

    public LiveTrainingPage clickOnLiveTra(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources)
                .pause(1000)
                .moveToElement(liveTrainig)
                .click()
                .build()
                .perform();
        return new LiveTrainingPage(driver);
    }

    public WebinarsEventsPage clickOnWesEs(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources)
                .pause(1000)
                .moveToElement(webinar)
                .click()
                .build()
                .perform();
        return new WebinarsEventsPage(driver);
    }
    public ZoomBlogPage clickOnBlog() {
        Actions actions = new Actions(driver);
        actions.moveToElement(resources)
                .pause(1000)
                .moveToElement(blog)
                .click()
                .build()
                .perform();
        return new ZoomBlogPage(driver);
    }
    public ZoomFAQPage clickOnFaq() {
        Actions actions = new Actions(driver);
        actions.moveToElement(resources)
                .pause(1000)
                .moveToElement(faq)
                .click()
                .build()
                .perform();
        return new ZoomFAQPage(driver);
    }
public  PlanPricingPage ClickOnPlanPricing()
{
    driver.findElement(By.xpath("//a[@class='top-pricing']")).click();
    return new PlanPricingPage(driver);
}
    public SupportPage  clickOnSupport(){
        this.support.click();
        return new SupportPage(driver);
    }
    public WebElement getReqDemo() {
        return reqDemo;
    }

    public WebElement getOne800() {
        return one800;
    }

    public WebElement getResources() {
        return resources;
    }
//    public WebElement getPlanPricingPage(){ return PlanPricing; }

   public WebElement getSupport() {return support; }

    public WebElement getDownlodZoom() {
        return downlodZoom;
    }

    public WebElement getVideoTuts() {
        return videoTuts;
    }

    public WebElement getLiveTrainig() {
        return liveTrainig;
    }

    public WebElement getWebinar() {
        return webinar;
    }
    public WebElement getBlog() {return blog;}
    public WebElement getFaq() {return faq;}

}
