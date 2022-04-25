package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.util.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC001_URL_TitleVerification {
    @Test
    public void verify_title_test(){
        Driver.getDriver().get("https://practice.cydeo.com");
        String expectedURL = "Cydeo";
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);
        System.out.println("actualURL = " + actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL.toLowerCase()));
        String expectedTitle = "Practice";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver().close();
    }
}
