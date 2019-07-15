package com.wagwalking;

import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstTest extends BaseTest {


    @Test
    public void testFirst() {

        WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));

        walkFreeButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input[type=email]"));

        emailField.sendKeys(user.getEmail());

        WebElement passField = driver.findElement(By.cssSelector("input[type=password]"));

        passField.sendKeys(user.getPassword());

        WebElement firstnameField = driver.findElement(By.cssSelector("input[data-testid=register-first-name]"));

        firstnameField.sendKeys(user.getFirstName());

        WebElement lastnameField = driver.findElement(By.cssSelector("input[data-testid=register-last-name]"));

        lastnameField.sendKeys(user.getLastName());

        WebElement phoneField = driver.findElement(By.cssSelector("input[type=tel]"));

        phoneField.sendKeys(user.getPhone());


    }




}
