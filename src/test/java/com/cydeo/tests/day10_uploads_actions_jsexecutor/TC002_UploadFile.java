package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.util.BrowserUtils;
import com.cydeo.util.ConfigurationReader;
import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC002_UploadFile {
            //    TC #2 Upload Test
            //1. Go to https://practice.cydeo.com/upload
        @Test
        public void upload_file_test(){
            Driver.getDriver().get(ConfigurationReader.getProperty("upload.url"));
            //2. Find some small file from your computer, and get the path of it.
            String path = "/Users/cassandranaima/Downloads/Group Photo/Screen Shot 2022-03-07 at 3.56.48 PM.png";
            //3. Upload the file.
            WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
            BrowserUtils.sleep(2);
            fileUpload.sendKeys(path);
            WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
            uploadButton.click();

            //4. Assert:
            //-File uploaded text is displayed on the page
            WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
            Assert.assertTrue(fileUploadedHeader.isDisplayed());
        }
        @AfterMethod
    public void tearDown(){
            Driver.getDriver().close();
        }
}
