package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.util.BrowserUtils;
import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC005 {
    public static void main(String[] args) throws InterruptedException {

        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        Driver.getDriver().get("https://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes
        WebElement checkbox1 = Driver.getDriver().findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = Driver.getDriver().findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is NOT selected by default.
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());
        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        //4. Click checkbox #1 to select it.
        BrowserUtils.sleep(2);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        BrowserUtils.sleep(2);
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

//        if(checkbox1.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }
//        //   7. Confirm checkbox #2 is NOT selected.
//
//        if(!checkbox2.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
       }
}
