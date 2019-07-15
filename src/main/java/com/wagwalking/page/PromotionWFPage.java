package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionWFPage extends BasePage {

    public PromotionWFPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "input[type=email]")
    WebElement emailfield;

    @FindBy(css = "input[type=password]")
    WebElement passfield;

    @FindBy(css = "input[data-testid=register-first-name]")
    WebElement firstnamefield;

    @FindBy(css = "input[data-testid=register-last-name]")
    WebElement lastnamefield;

    @FindBy(css = "input[type=tel]")
    WebElement phonefield;

    public void inputEmail (String email) {

        emailfield.sendKeys(email);
    }

    public void inputPass (String pass) {

        passfield.sendKeys(pass);
    }

    public void inputFirstName (String firstName) {

        firstnamefield.sendKeys(firstName);
    }

    public void inputLastName (String lastName) {

        lastnamefield.sendKeys(lastName);
    }

    public void inputPhone (String phone) {

        phonefield.sendKeys(phone);
    }
}
