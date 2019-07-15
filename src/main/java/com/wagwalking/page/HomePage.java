package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    WebElement walkfreebutton;

    public PromotionWFPage clickWalkFreeButton() {

        walkfreebutton.click();

        return new PromotionWFPage(driver);
    }


}
