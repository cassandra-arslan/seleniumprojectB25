package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC002_LinkTextPractice {
    @Test
    public void navigation_test(){
        Driver.getDriver().get("https://practice.cydeo.com");
        WebElement abTestLink = Driver.getDriver().findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();
        String expectedTitle = "No A/B Test";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.getDriver().navigate().back();
    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver().close();
    }
}
