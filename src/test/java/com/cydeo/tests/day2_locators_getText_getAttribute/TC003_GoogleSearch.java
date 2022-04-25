package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC003_GoogleSearch {
    @Test
    public void google_search_test(){
        Driver.getDriver().get("https://www.google.com");
        //Identify search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        //Type apple into search box and press enter
        googleSearchBox.sendKeys("apple" +Keys.ENTER);
        //Verify Title: Expected: start with "apple" word
        String expectedTitle = "apple";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.startsWith(expectedTitle));
    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver().close();
    }
}
