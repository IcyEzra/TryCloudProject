package com.trycloud.tests.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory_1 extends TestBase {



    @Test
    public void US3_TC1(){

        WebElement fileButton = driver.findElement(By.xpath("//a[@aria-label='Files']"));
        fileButton.click();

        String actualFileTitle = driver.getTitle();
        String expectedFileTitle = "Files - Trycloud";

        Assert.assertEquals(actualFileTitle,expectedFileTitle, "Displayed Title is not match. FAILED!!!");


    }

    @Test
    public void US3_TC2(){

        WebElement fileButton = driver.findElement(By.xpath("//a[@aria-label='Files']"));
        fileButton.click();

        WebElement checkboxAll = driver.findElement(By.xpath("//table[@id='filestable']//th[1]//label"));
        checkboxAll.click();

        //WebElement file1 = driver.findElement(By.xpath())

        List<WebElement> listOfFiles = driver.findElements(By.xpath("//tbody[@id='fileList']//td//label"));

        for(WebElement eachFile : listOfFiles){
            System.out.println("eachFile = " + eachFile);
            Assert.assertTrue(eachFile.isSelected());
        }

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