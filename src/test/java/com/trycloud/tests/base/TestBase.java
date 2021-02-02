package com.trycloud.tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void LogIn(){

    }


    @AfterMethod
    public void LogOut(){

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
