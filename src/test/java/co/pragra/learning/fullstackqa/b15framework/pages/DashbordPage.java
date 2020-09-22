package co.pragra.learning.fullstackqa.b15framework.pages;

import org.openqa.selenium.WebDriver;

public class DashbordPage {
    public WebDriver driver;

    public DashbordPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        Thread.sleep(4000);

    }
}
