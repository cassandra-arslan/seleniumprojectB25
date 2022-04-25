package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC003_NextBaseCRM_Locators {
    public static void main(String[] args) {
//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        Driver.getDriver();
//        2- Go to: https://login1.nextbasecrm.com/
        Driver.getDriver().get("https://login1.nextbasecrm.com/");
//        3- Verify “Log in” button text is as expected:
//        Expected: Log In
        WebElement enterUsername = Driver.getDriver().findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        enterUsername.sendKeys("abc@gmail.com");
        WebElement enterPassword = Driver.getDriver().findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        enterPassword.sendKeys("abc123");
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
        WebElement invalidLoginMessage = Driver.getDriver().findElement(By.xpath("//div[@class='errortext']"));
        String expectedInvalidLoginText = "Incorrect login or password";
        System.out.println("invalidLoginMessage.getText() = " + invalidLoginMessage.getText());
        Assert.assertEquals(invalidLoginMessage.getText(), expectedInvalidLoginText);
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//                PS2: Pay attention to where to get the text of this button from
    }
}
