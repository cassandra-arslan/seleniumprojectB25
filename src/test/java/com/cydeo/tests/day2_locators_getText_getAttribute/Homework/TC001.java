package com.cydeo.tests.day2_locators_getText_getAttribute.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
    public static void main(String[] args) {
//        TC #1: Etsy Title Verification
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        1. Open Chrome browser
        driver.get("https://www.etsy.com");
//        2. Go to https://www.etsy.com
        WebElement searchBar = driver.findElement(By.name("search_query"));
//        3. Search for “wooden spoon”
        searchBar.sendKeys("wooden spoon");
        //WebElement searchButton = driver.findElement(By.className("wt-icon wt-nudge-b-2 wt-nudge-r-1"));
        //searchButton.click();
        searchBar.sendKeys("wooden spoon"+ Keys.ENTER);

//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification failed!");
        }

    }
}
