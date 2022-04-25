package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC005_WindowsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(("https://practice.cydeo.com/windows"));
    }
    @Test
    public void multipleWindowTest(){
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
//        4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
//        5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
//        6. Switch to new Window.
        for(String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());
        }
        //driver.switchTo().window();
//        7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleAfterClick);
        System.out.println("Title after click = " + actualTitle);
    }
}
