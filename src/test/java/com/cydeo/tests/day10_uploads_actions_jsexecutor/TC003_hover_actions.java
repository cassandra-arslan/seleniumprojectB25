package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_hover_actions {
    @Test
    public void hover_actions_test(){
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        //Locate all three images
        WebElement firstImage = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement secondImage = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        //Locate all the "user" texts
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(firstImage).perform();
        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        //b. “view profile” is displayed
//        WebElement viewProfile = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
//        Assert
        //4. Hover over to second image
        actions.moveToElement(secondImage).perform();
        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());
        //b. “view profile” is displayed
        //6. Hover over to third image
        actions.moveToElement(thirdImage).perform();
        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());
        //b. “view profile” is displayed
    }
}
