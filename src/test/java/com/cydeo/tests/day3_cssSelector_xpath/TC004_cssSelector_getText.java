package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC004_cssSelector_getText {
//        TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        @Test
    public void verify_reset_button_text(){
            Driver.getDriver().get("https://login1.nextbasecrm.com/?forgot_password=yes");
            WebElement resetButton = Driver.getDriver().findElement(By.xpath("//button[@value='Reset password']"));
//        3- Verify “Reset password” button text is as expected:
//        Expected: Reset password
            Assert.assertEquals(resetButton.getText(), "Reset password");
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//                PS2: Pay attention to where to get the text of this button from

    }
}
