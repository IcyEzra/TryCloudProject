package com.trycloud.tests.base;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void LogIn(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa3.trycloud.net");

        String username = "User29";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);
        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }


    @AfterMethod
    public void LogOut(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}

/*
Test case #1 - verify user login successfully
1.Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2.Enter valid username
3.Enter valid password
4.Click login button
5.Verify the URL is chawed to homepage’s url(Put this test case in testBase class with an annotation so it runs for all the test case)
 */
