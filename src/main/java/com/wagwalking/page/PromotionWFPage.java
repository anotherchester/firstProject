package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionWFPage extends BasePage {

    public PromotionWFPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "input[type=email]")
    private WebElement emailfield;

    @FindBy(css = "input[type=password]")
    private WebElement passfield;

    @FindBy(css = "input[data-testid=register-first-name]")
    private WebElement firstnamefield;

    @FindBy(css = "input[data-testid=register-last-name]")
    private WebElement lastnamefield;

    @FindBy(css = "input[type=tel]")
    private WebElement phonefield;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredfield;

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

    public void clickEmailField () {

        emailfield.click();
    }

    public void clickPassField() {

        passfield.click();
    }

    public void clickFirstNameField() {

        firstnamefield.click();
    }

    public void clickLastNameField() {

        lastnamefield.click();
    }

    public void clickPhoneField() {

        phonefield.click();
    }

    public String getRequiredMailField() {

        return requiredfield.getText();
    }

    public String getRequiredPassField() {

        return requiredfield.getText();
    }

    public String getRequiredFirstnameField() {

        return requiredfield.getText();
    }

    public String getRequiredLastnameField() {

        return requiredfield.getText();
    }

    public String getRequiredPhoneField() {

        return requiredfield.getText();
    }


}
