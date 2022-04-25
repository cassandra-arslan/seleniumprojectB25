package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathLocatorPractice {

    @Test
    public void verifyButtonMessageText(){
        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons");
        WebElement buttonOne = Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        buttonOne.click();
        WebElement messageAfterClick = Driver.getDriver().findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals(messageAfterClick.getText(), "Clicked on button one!");
    }
}

