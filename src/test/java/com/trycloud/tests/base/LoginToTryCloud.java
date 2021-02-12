package com.trycloud.tests.base;

import com.trycloud.pages.LoginPageTryCloud;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.testng.annotations.Test;

public class LoginToTryCloud {

    @Test
    public void login_to_trycloud(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LoginPageTryCloud loginPage = new LoginPageTryCloud();

        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("userName1"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password1"));
        loginPage.loginButton.click();
    }
}
