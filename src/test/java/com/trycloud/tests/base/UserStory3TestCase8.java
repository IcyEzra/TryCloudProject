package com.trycloud.tests.base;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory3TestCase8 extends TestBase{

    @Test
    public void delete_file_folder(){

    // login and click Files
    WebElement files = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[2]/a"));
    files.click();

    // click action button
    WebElement actionButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]"));
    actionButton.click();

    // clicking Delete File button
    driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[8]/a/span[2]")).click();

    // go to Deleted Files page
    driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[7]/a")).click();

    // verifying file is deleted
     WebElement deletedFileName = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[4]/td[2]/a/span[1]/span"));


     List<WebElement> deletedFiles = driver.findElements(By.xpath("//div[@class=\"thumbnail-wrapper\"]"));
        if(deletedFiles.equals(deletedFileName)){
            Assert.assertTrue(deletedFileName.isDisplayed());
        }



    }




}
/*
3.Story: As a user, I should be able to access to Files module.
Test case #8 - verify users can delete a file/folder.
 1.Login as a user
 2.Click action-icon from any file on the page
 3.Choose “delete files” option
 4.Click deleted files on the left bottom corner
 5.Verify the deleted file is displayed no the page.
 (Pre-condition: there should be at least 1 file is uploaded inside files page)
 */