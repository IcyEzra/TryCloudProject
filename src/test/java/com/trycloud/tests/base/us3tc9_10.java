package com.trycloud.tests.base;

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class us3tc9_10 extends TestBase{

    @Test

    public void US3_TC9(){

        WebElement fileButton = driver.findElement(By.xpath("//a[@aria-label='Files']"));
        fileButton.click();
        BrowserUtils.sleep(3);

        WebElement settingButton= driver.findElement(By.xpath("//button[@class='settings-button']"));
        settingButton.click();
        BrowserUtils.sleep(3);

        WebElement workSpaceButton=driver.findElement(By.xpath("//label[@for=\"showRichWorkspacesToggle\"]"));
        workSpaceButton.click();
        BrowserUtils.sleep(3);

        WebElement recommendationsButton=driver.findElement(By.xpath("//label[@for=\"recommendationsEnabledToggle\"]"));
        recommendationsButton.click();
        BrowserUtils.sleep(3);

        WebElement hiddenFilesButton= driver.findElement(By.xpath("//label[@for=\"showhiddenfilesToggle\"]"));
        hiddenFilesButton.click();
        BrowserUtils.sleep(3);

    }

    public void US3_TC10(){

    }


}
