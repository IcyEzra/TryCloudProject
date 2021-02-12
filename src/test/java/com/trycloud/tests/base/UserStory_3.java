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

/*3.Story: As a user, I should be able to access to Files module.
Test case
#1 - verify users can access to Files module
1.Login as a user
2.Verify the page tile is Files module’s tile Test case
#2 - verify users can select all the uploaded files from the page 1.Login as a user
2.Click the top left checkbox of the table
3.Assert all the files are selected(Pre-condition: there should be at least
2 files are uploaded the page)
 */

