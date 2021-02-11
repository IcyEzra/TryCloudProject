package com.trycloud.tests.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory5TestCase1 extends TestBase{

    //1. Login as a user
    @Test
    public void user_access_contacts_module() throws InterruptedException {

        //2. Click "Contacts" module
        driver.findElement(By.xpath("//a[@aria-label='Contacts']")).click();
        //3. Verify the page title is Contents module's title
        String expectedTile = "Contacts - Trycloud QA";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTile = " + expectedTile);
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTile));
    }
}
