package com.trycloud.tests.base;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UserStory5TestCase2 extends TestBase{


    // 1. Login as a user
    @Test
    public void user_add_contacts(){

        List<String> contactNames = new ArrayList<String>();
        //2.Click contacts module
        driver.findElement(By.xpath("//a[@aria-label='Contacts']")).click();

        // create new contact
        contactNames.add(createContacts());
        String actualName = driver.findElement(By.xpath("//div[@class='app-content-list-item-line-one']")).getText();
        String expected = contactNames.get(0);
        System.out.println("actualName = " + actualName);
        System.out.println("expected = " + expected);
        Assert.assertTrue(actualName.contains(expected));

        //System.out.println(contactNames);

    }

    public String createContacts(){
        //3. Click "New Contact" button
        driver.findElement(By.id("app-content-vue")).click();
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        // entering full name of the contact
        driver.findElement(By.id("contact-fullname")).sendKeys(fullName);
        // company name
        driver.findElement(By.id("contact-org")).sendKeys(faker.company().name());
        // title
        driver.findElement(By.id("contact-title")).sendKeys(faker.name().title());
        // home phone number
        driver.findElement(By.xpath("//input[@inputmode='tel']")).sendKeys(faker.phoneNumber().phoneNumber());
        // email
        driver.findElement(By.xpath("//input[@inputmode='email']")).sendKeys(faker.internet().emailAddress());
        // address
        driver.findElement(By.xpath("//div[contains(text(),'Address')]/following-sibling::input")).sendKeys(faker.address().streetAddress());
        // zip code
        driver.findElement(By.xpath("//div[contains(text(),'Postal code')]/following-sibling::input")).sendKeys(faker.address().zipCode());
        //city
        driver.findElement(By.xpath("//div[contains(text(),'City')]/following-sibling::input")).sendKeys(faker.address().cityName());
        // state or province
        driver.findElement(By.xpath("//div[contains(text(),'State or province')]/following-sibling::input")).sendKeys(faker.address().state());
        // Country
        driver.findElement(By.xpath("//div[contains(text(),'Country')]/following-sibling::input")).sendKeys(faker.address().country()+ Keys.ENTER);
        return fullName;
    }
}
