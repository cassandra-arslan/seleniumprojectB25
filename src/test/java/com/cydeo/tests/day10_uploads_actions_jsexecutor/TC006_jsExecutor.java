package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.util.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC006_jsExecutor {

    @Test
    public void js_executor_test1(){
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        //3- Use below JavaScript method and scroll
        ((JavascriptExecutor)Driver.getDriver()).executeScript("");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(0,0)");
        //a.  750 pixels down 10 times.
        //b.  750 pixels up 10 times
        //
        //JavaScript method to use : window.scrollBy(0,0)
    }
}
