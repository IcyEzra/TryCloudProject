package com.trycloud.tests.base;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void LogIn(){

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User29";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }


    public void LogIn_2(){
        driver = WebDriverFactory.getDriver("chrome");
     //   driver.manage().window().maximize();
        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User59";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }


    public void LogIn_3(){
        driver = WebDriverFactory.getDriver("chrome");
     //   driver.manage().window().maximize();
        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User89";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }


    public void LogIn_4(){
        driver = WebDriverFactory.getDriver("chrome");
     //   driver.manage().window().maximize();
        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User119";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }



    }


    public void LogIn_2(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User59";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }


    public void LogIn_3(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User89";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }


    public void LogIn_4(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://qa3.trycloud.net");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = "User119";
        String password = "Userpass123";


        WebElement usernameButton = driver.findElement(By.xpath("//input[@id='user']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();
    }



    @AfterMethod
    public void close(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       driver.close();

    }
}


