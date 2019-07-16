package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWFPage;
import org.junit.Assert;
import org.junit.Test;

public class MailExistsTest extends  BaseTest {

    private HomePage homePage;
    private PromotionWFPage promoPage;

    @Test
    public void testMailExists() throws InterruptedException {

        homePage = new HomePage(driver);
        promoPage = homePage.clickWalkFreeButton();
        promoPage.inputEmail("alex@gmail.com");
        promoPage.inputPass("Qwerty123456");
        promoPage.inputFirstName("Alex");
        promoPage.inputLastName("Alex");
        promoPage.inputPhone("2062062062");
        promoPage.clickNextButton();
        Thread.sleep(5000);
        String existMailNote = promoPage.getExistMailField();
        Assert.assertEquals("Email address already registered",existMailNote);





    }
}
