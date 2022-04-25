package com.cydeo.tests.day1_selenium_intro;

import com.cydeo.util.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_YahooTitleVerification {
    @Test
            public void verify_title_test(){
        Driver.getDriver().get("https://www.yahoo.com");
            //3. Verify title:
            //4.Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
