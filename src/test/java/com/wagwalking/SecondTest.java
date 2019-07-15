package com.wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SecondTest extends BaseTest {

    @Test
    public void testSecond() {

        WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));

        walkFreeButton.click();

        List<WebElement> fieldCollection = driver.findElements(By.cssSelector("input"));


        fieldCollection.get(0).sendKeys(user.getEmail());
        fieldCollection.get(1).sendKeys(user.getPassword());
        fieldCollection.get(2).sendKeys(user.getFirstName());
        fieldCollection.get(3).sendKeys(user.getLastName());
        fieldCollection.get(4).sendKeys(user.getPhone());



        /*
        [0] - email
        [1] - password
        [2] - firstName
        [3] - lastName
        [4] - phone


         */
    }

    @Test
    public void testNewUser() {

        WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));

        walkFreeButton.click();

        List<WebElement> fieldCollection = driver.findElements(By.cssSelector("input"));


        fieldCollection.get(0).sendKeys(user1.getEmail());
        fieldCollection.get(1).sendKeys(user1.getPassword());
        fieldCollection.get(2).sendKeys(user1.getFirstName());
        fieldCollection.get(3).sendKeys(user1.getLastName());
        fieldCollection.get(4).sendKeys(user1.getPhone());
}}
