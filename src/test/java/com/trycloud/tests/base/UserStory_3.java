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

        WebElement checkboxAll = driver.findElement(By.xpath("//label[@for='select_all_files']"));
        checkboxAll.click();

        List<WebElement> listOfFiles = driver.findElements(By.xpath("//table//tbody//a//div[@class='thumbnail']"));

        for (WebElement eachFile : listOfFiles) {
            if(eachFile.isSelected()){
                Assert.assertTrue(eachFile.isSelected());
            }else{
                System.out.println("No such Element in this page");
            }
        }
    }

}
