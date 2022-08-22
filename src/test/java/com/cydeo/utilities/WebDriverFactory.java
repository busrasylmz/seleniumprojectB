package com.cydeo.utilities;

// NEW METHOR CREATION
// Method NAme : getDriver
// Static Method


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
/*
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



    }


 */

    public static WebDriver getDriver(String browserType) {

        if(browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if(browserType.equalsIgnoreCase("firefox")){
             WebDriverManager.firefoxdriver().setup();
             return new FirefoxDriver();

        }else{
            System.out.println("Given browser type is does not exist/ or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }

    }


}

