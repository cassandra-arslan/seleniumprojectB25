package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.util.ConfigurationReader;
import com.cydeo.util.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC001_RegFormConfirm {
    //TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form

    @Test
    public void registration_form_test() {
        Faker faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String firstName = faker.name().firstName();
        inputFirstName.sendKeys(firstName);
        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String lastName = faker.name().lastName();
        inputLastName.sendKeys(lastName);
        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        inputUserName.sendKeys(firstName+lastName+faker.bothify("####"));
        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(firstName.toLowerCase()+lastName.toLowerCase()+"@gmail.com");
        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.bothify("###???##?#?##?"));
        //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));
        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();
        //10. Enter date of birth
        WebElement inputBirthDay = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthDay.sendKeys(faker.number().numberBetween(1,12)+"/"+faker.number().numberBetween(1,28)+"/"+faker.number().numberBetween(1920, 2000));
        //inputBirthDay.sendKeys("03/08/1954");
        //11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //12. Select Job Title
        //13. Select programming language from checkboxes
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
//
//
//Note:
//1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense
    }
}
