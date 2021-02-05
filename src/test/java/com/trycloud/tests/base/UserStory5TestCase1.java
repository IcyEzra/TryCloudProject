package com.trycloud.tests.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory5TestCase1 extends TestBase{
    @Test
    public void user_access_contacts_module() throws InterruptedException {

        driver.findElement(By.xpath("//a[@aria-label='Contacts']")).click();
        String expectedTile = "Contacts";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTile = " + expectedTile);
        Assert.assertTrue(actualTitle.contains(expectedTile));
    }
}
