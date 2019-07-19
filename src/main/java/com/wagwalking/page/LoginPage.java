package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver) {

        super (driver);
    }

    @FindBy(css = ".form-control")
    List<WebElement> formFields;

    @FindBy(css = ".btn.btn-secondary.btn-block")
    WebElement logButton;

    @FindBy(css = ".LoginForm_alert__14-Lm.bootstrap_alert__3S0Lp.bootstrap_alert-warning__3q-tY")
    WebElement errorAlert;

    public void inputEmail (String email) {

        formFields.get(0).sendKeys(email);
    }

    public void inputPass (String pass) {

        formFields.get(1).sendKeys(pass);
    }

    public void clickLogButton() {

        logButton.click();
    }

    public String getErrorAlert() {

        return errorAlert.getText();
    }


}
