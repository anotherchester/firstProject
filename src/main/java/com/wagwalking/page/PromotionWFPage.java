package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
    private List<WebElement> requiredfields;

    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement> passfields;

    @FindBy(css = ".sc-htoDjs.hdXrdX")
    private WebElement nextfield;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement existMailField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement invalidMailField;

        public String getMailValue() {

       String emailValue = emailfield.getAttribute("value");
        return emailValue;}

        public String getPassValue() {

            String passValue = passfield.getAttribute("value");
            return passValue;
            }
        public String getFirstNameValue() {

            String firstNameValue = firstnamefield.getAttribute("value");
            return firstNameValue;
    }

        public String getlastNameValue() {

            String lastNameValue = lastnamefield.getAttribute("value");
            return lastNameValue;
        }

        public String getPhoneValue() {

        String phoneValue = phonefield.getAttribute("value");
        return phoneValue;}



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

    public void clickNextButton() {

        nextfield.click();
    }

    public String getRequiredMailField() {

        return requiredfields.get(0).getText();
    }


    public String getRequiredFirstnameField() {

        return requiredfields.get(1).getText();
    }

    public String getRequiredLastnameField() {

        return requiredfields.get(2).getText();
    }

    public String getRequiredPhoneField() {

        return requiredfields.get(3).getText();
    }

    public String getExistMailField() {

        return existMailField.getText();
    }

    public String getPassField1() {

        return passfields.get(0).getText();
    }

    public String getPassField2() {

        return passfields.get(1).getText();
    }

    public String getPassField3() {

        return passfields.get(2).getText();
    }

    public String getInvalidMailText() {

        return invalidMailField.getText();
    }


}
