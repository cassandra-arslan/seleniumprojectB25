package com.cydeo.tests.day5_dynamicWebelements_Dropdowns;
import com.cydeo.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC003_UtilityMethodForTask2 {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a List of Web Element
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : sportRadioButtons) {

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if (eachId.equals("hockey")){

                each.click();
                System.out.println("Hockey is selected : " + each.isSelected());
                break;

            }
        }
    }
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        //Loop through the List of WebElemente and select matching result "hockey"
        for (WebElement each : radioButtons){
            String eachID = each.getAttribute("id");
            //   if(eachID.equals
        }
    }
}
