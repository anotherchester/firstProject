package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    WebElement walkfreebutton;

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    WebElement becomebutton;

    @FindBy(css = ".sc-bdVaJa.sc-bwzfXH.cnQLyv")
    List<WebElement> topbuttons;

    public PromotionWFPage clickWalkFreeButton() {

        walkfreebutton.click();

        return new PromotionWFPage(driver);
    }

    public BecomePage clickBecomeButton() {

        becomebutton.click();

        return new BecomePage(driver);
    }

    public LoginPage clickLoginButton() {

        topbuttons.get(4).click();

        return new LoginPage(driver);
    }


}
