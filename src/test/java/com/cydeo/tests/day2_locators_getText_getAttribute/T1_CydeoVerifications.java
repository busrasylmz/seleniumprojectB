package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

       //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains


        //Expected: cydeo
        String expectURL= "cydeo";
        String actuaURL = driver.getCurrentUrl();

        if(actuaURL.contains(expectURL)){
            System.out.println("URL PASSED");
        }else{
            System.out.println("URL FAILED");
        }


        //4. Verify title:

        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!!");
        }else{
            System.out.println("Title verification FAILED!!");
        }


        driver.close();




    }
}
