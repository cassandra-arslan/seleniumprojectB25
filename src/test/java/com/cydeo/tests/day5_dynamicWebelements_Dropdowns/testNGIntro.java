package com.cydeo.tests.day5_dynamicWebelements_Dropdowns;

import org.testng.annotations.*;

public class testNGIntro {
    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("----> BeforeMethod is running!");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> AfterMethod is running!");
    }
    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");
    }
    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");
    }
}
