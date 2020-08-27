package co.pragra.learning.fullstackqa.b15framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactSalesPage {
    private WebDriver driver;


    public ContactSalesPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poonam@gmail.com");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("pragra");
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("poonam");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("abc");
        Select select=new Select(driver.findElement(By.id("employee_count")));
        select.selectByVisibleText("251-500");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("12334455");
        Select select2=new Select(driver.findElement(By.id("state")));
        select2.selectByVisibleText("Hawaii");
        Select select3=new Select(driver.findElement(By.id("country")));
        select3.selectByVisibleText("United States");
        driver.findElement(By.id("city")).sendKeys("AAA");
        driver.findElement(By.xpath("//div[@class='controls']//textarea[@id='description']")).sendKeys("Plz submit my information and let  me know");
        driver.findElement(By.xpath("//input[@id='gdpr-optin']")).click();
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(8000);
    }

}
