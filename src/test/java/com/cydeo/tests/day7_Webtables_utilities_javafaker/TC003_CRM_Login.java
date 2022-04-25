package com.cydeo.tests.day7_Webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.util.BrowserUtils;
import com.cydeo.util.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC003_CRM_Login extends TestBase {

    @Test
    public void crm_login_test_1(){
//        2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//        3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");
//        4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
//        5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
//        6. Verify title is as expected:
//        Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
//        USERNAME  PASSWORD
//        helpdesk1@cybertekschool.com  UserUser
//        Helpdesk2@cybertekschool.com  UserUser
    }
    @Test
    public void crm_login_test_2(){
//        2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver);
//        6. Verify title is as expected:
//        Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
//        USERNAME  PASSWORD
//        helpdesk1@cybertekschool.com  UserUser
//        Helpdesk2@cybertekschool.com  UserUser
    }
    @Test
    public void crm_login_test_3(){
        driver.get("https:/login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver, "Helpdesk2@cybertekschool.com", "UserUser");
        BrowserUtils.verifyTitle(driver, "(2) Portal");
    }

}
