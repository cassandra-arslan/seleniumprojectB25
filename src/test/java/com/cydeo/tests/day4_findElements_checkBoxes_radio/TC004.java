package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC004 {
    public static void main(String[] args) {
        //TC #4: FindElements Task
        //1- Open a Chrome browser
        //Providing extra wait time for our driver before it throws NoSuchElementException
        //2- Go to: https://practice.cydeo.com/abtest
        Driver.getDriver().get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        //windows : alt+enter --> press enter again
        //mac     : option + Enter --> press enter again
        List <WebElement> allLinks = Driver.getDriver().findElements(By.tagName("a"));
        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Text of link: " + each.getText());
            System.out.println("HREF Values: " + each.getAttribute("href"));
        }

    }
}
