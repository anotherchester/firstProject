package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BecomePage extends BasePage {

    public BecomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn.form-components-loader-button.none.become-walker-application__btn.btn.btn-brand.btn--brand-color")
    WebElement applyButton;

    @FindBy(css = ".error-message-container")
    private List<WebElement> errorfields;

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






}
