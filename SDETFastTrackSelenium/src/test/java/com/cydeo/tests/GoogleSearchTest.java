package com.cydeo.tests;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearchTest {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Test
    public void googleSearchTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        Assert.assertEquals(Driver.getDriver().getTitle(),"apple - Google Search");
    }

    @Test
    public void hardAssertionTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        Assert.assertEquals(Driver.getDriver().getTitle(),"app - Google Search");

        System.out.println("This is coming from after hard assertion fails!");

    }

    @Test
    public void softAssertionTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(Driver.getDriver().getTitle(),"app - Google Search");

        System.out.println("This is coming from after soft assertion fails!");

        softAssert.assertAll();

    }

}
