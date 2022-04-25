package com.cydeo.tests.day8_Properties_WebTablesCont;

import com.cydeo.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC001_PizzaOrder {
        public WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
//        1. Open Chrome browser
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      TC #1: Web table practice
//      1. Go to: https://practice.cydeo.com/web-tables
            driver.get("https://practice.cydeo.com/web-tables");
        }

    @Test
    public void order_name_verify_test(){
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        //      2. Verify Bob’s name is listed as expected.
        //      Expected: “Bob Martin”
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();
        Assert.assertEquals(actualBobName, expectedBobName);
//      3. Verify Bob Martin’s order date is as expected
//      Expected: 12/31/2021
        //Alternative locator for bobMartinDateCell
        WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobMartinDateCell.getText();

        Assert.assertEquals(actualBobDate, expectedBobDate);
    }

    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }

    @Test
    public void test3(){
            WebTableUtils.order_verify(driver, "Bart Fisher", "01/16/2021");
    }
}
