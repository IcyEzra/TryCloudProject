package com.trycloud.tests.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory_3 extends TestBase {



    @Test
    public void US3_TC1(){

        WebElement fileButton = driver.findElement(By.xpath("//a[@aria-label='Files']"));
        fileButton.click();

        String actualFileTitle = driver.getTitle();
        String expectedFileTitle = "Files - Trycloud QA";

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
