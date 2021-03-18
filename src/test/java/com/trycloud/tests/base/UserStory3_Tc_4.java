package com.trycloud.tests.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory3_Tc_4 extends TestBase{
    @Test
    public void deleteFavorite(){


    WebElement file = driver.findElement(By.xpath("//a[@aria-label='Files']"));
        file.click();
    WebElement actionIcon = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]"));
        actionIcon.click();

    WebElement AddFavorite = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));
        AddFavorite.isDisplayed();
        AddFavorite.click();
        actionIcon.click();



        WebElement removeFavorite= driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));
        removeFavorite.isDisplayed();
        removeFavorite.click();

}
}

//        1.Login as a user
//        2.Click action-icon from any file on the page
//        3.Click “Remove from Favorites” option
//        4.Verify that the file is removed from Favorites sub-module’s table.
//        (Pre-condition: there should be at least 1 file is added to favorites table)