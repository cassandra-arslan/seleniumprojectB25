package com.cydeo.tests.day13_review;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.util.BrowserUtils;
import com.cydeo.util.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {
    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){
        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }
    @Test
    public void remove_button_test(){
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();
        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);
        //5- Verify:
        //a. Checkbox is not displayed
        try {
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch(NoSuchElementException e){
            Assert.assertTrue(true);
        }
        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
        //
        //NOTE: FOLLOW POM
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
