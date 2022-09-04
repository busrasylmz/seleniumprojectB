package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website:https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe  ");


    }
    @Test
    public void iframe_test(){

        //We need to switch drivers focus to iframe
        driver.switchTo().frame("mce_0_ifr");

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());


        //4. Assert: “Your content goes here.” Text is displayed.
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        headerText.isDisplayed();

        Assert.assertTrue(headerText.isDisplayed());



    }

}
