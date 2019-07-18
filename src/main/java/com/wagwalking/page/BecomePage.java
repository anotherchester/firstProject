package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BecomePage extends BasePage {

    public BecomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button-text")
    WebElement applyButton;

    @FindBy(css = ".error-message-container")
    private List<WebElement> errorfields;

    @FindBy(css = ".form-utils-input")
    private List<WebElement> applicationfields;

    @FindBy(css = ".autocomplete-result")
    private List<WebElement> addressResults;

    public void clickApplyButton() {

        applyButton.click();
    }

    public String getFirstnameErrTxt() {

        return errorfields.get(0).getText();
    }

    public String getLastnameErrTxt() {

        return errorfields.get(1).getText();
    }

    public String getEmailErrTxt() {

        return errorfields.get(2).getText();
    }

    public String getPhoneErrTxt() {

        return errorfields.get(3).getText();
    }

    public void clickFirstNameField() {

        applicationfields.get(0).click();
    }

    public void inputFirstname(String firstname) {

        applicationfields.get(0).sendKeys(firstname);
    }

    public void inputLastname(String lastname) {

        applicationfields.get(1).sendKeys(lastname);
    }

    public void inputEmail (String email) {

        applicationfields.get(2).sendKeys(email);
    }

    public void inputPhone (String phone) {

        applicationfields.get(3).sendKeys(phone);
    }

    public void inputAddress(String address) {
        applicationfields.get(4).sendKeys(address);
        addressResults.get(0).click();
    }

    public void inputApt(String apt) {

        applicationfields.get(5).sendKeys(apt);
    }

    public void inputCity (String city)
    { applicationfields.get(6).sendKeys(city);}

    public void inputZip (String zip) {

        applicationfields.get(7).sendKeys(zip);
    }






}
