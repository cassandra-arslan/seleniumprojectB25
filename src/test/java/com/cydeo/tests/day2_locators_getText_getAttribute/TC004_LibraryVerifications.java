package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.util.BrowserUtils;
import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC004_LibraryVerifications {
    @Test
    public void verify_library_test(){
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        // Enter username: "incorrect@email.com
        WebElement usernameInput = Driver.getDriver().findElement(By.xpath("//input[@type='email']"));
        usernameInput.sendKeys("incorrect@email.com");
        //Enter password: "incorrect password"
        WebElement passwordInput = Driver.getDriver().findElement((By.id("inputPassword")));
        passwordInput.sendKeys("incorrect password");
        // Click Sign-in Button
        WebElement signInButton = Driver.getDriver().findElement(By.tagName("button"));
        signInButton.click();
        WebElement incorrectAlert = Driver.getDriver().findElement(By.xpath("//div[@class='mb-4']"));
        Assert.assertTrue(incorrectAlert.isDisplayed());
    }
    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(2);
        Driver.getDriver().close();
    }
}
