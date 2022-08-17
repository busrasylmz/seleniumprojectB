package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


        //3- Verify header text is as expected:
        WebElement headerTest= driver.findElement(By.tagName("h2"));
        // Expected : registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerTest.getText();


        if(actualHeaderText.equals(actualHeaderText)){
            System.out.println("Header text verifications PASSED!!");
        }else{
            System.out.println("Header text verifications FAILED!!");
        }



        //Expected: Registration form
        //4- Locate “First name” input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        String expectedPlaceholder= "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceholder)){
            System.out.println("Placeholder text verification PASSED!!");
        }else{
            System.out.println("Placeholder text verification FAILED!!");
        }
        driver.close();

        //Expected: first name



    }
}
