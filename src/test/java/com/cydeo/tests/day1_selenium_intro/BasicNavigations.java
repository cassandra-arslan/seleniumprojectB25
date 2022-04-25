package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("http://www.tesla.com");
        String currentTitle = driver.getTitle();
        System.out.println("Current Title = " +currentTitle );
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL = "+currentURL);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().to("https://google.com");
        currentTitle = driver.getTitle();
        System.out.println("Current Title = "+currentTitle);
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL = "+currentURL);

    }
}
