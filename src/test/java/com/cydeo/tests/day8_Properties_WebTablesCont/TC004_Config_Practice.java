package com.cydeo.tests.day8_Properties_WebTablesCont;

import com.cydeo.util.ConfigurationReader;
import com.cydeo.util.Driver;
import com.cydeo.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC004_Config_Practice {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void google_search_test() {
        Driver.getDriver().get("https://www.google.com");
        // Write 'apple' in search box
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //4 - Verify Title:
        //Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

}
