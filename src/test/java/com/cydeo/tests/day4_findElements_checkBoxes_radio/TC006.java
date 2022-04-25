package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.util.BrowserUtils;
import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006 {

    @Test
    public void link_displayed_verification(){
        //TC #6: StaleElementReferenceException Task
        //Providing extra wait time for our driver before it throws NoSuchElementException
        BrowserUtils.sleep(2);
        //2- Go to: https://practice.cydeo.com/abtest
        Driver.getDriver().get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify if is displayed.
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("cydeoLink.getText() = " + cydeoLink.getText());
        Assert.assertTrue(cydeoLink.isDisplayed());
        //4- Refresh the page.
        Driver.getDriver().navigate().refresh();
        cydeoLink = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        //5- Verify it is displayed, again.
        Assert.assertTrue(cydeoLink.isDisplayed());

    }
}
