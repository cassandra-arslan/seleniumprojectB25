package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC004_iFramePractice {
        WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(("https://practice.cydeo.com/iframe"));
    }
    @Test
    public void iframe_test(){
        //We need to switch driver's focus to iframe
        //option #1- switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        //Assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }
    @Test
    public void iframe_test2(){
        //We need to switch driver's focus to iframe
        //option #1- switching to iframe using id attribute value
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        //Assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());
    }
    @AfterMethod
    public void methodTearDown(){
        driver.close();
    }
}
