package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWFPage;
import org.junit.Assert;
import org.junit.Test;


public class TextFieldsVerificationTest extends BaseTest {

    private HomePage homePage;
    private PromotionWFPage promoPage;

    @Test
    public void testTextFieldsVerification() {


        homePage = new HomePage(driver);

        promoPage = homePage.clickWalkFreeButton();

        promoPage = new PromotionWFPage(driver);

        promoPage.inputEmail("umbasa@cinder.com");

        promoPage.inputPass("qwerty123");

        promoPage.inputFirstName("Lord");

        promoPage.inputLastName("Sorrow");

        promoPage.inputPhone("2060001133");

        String x1 = promoPage.getMailValue();

        Assert.assertEquals("umbasa@cinder.com",x1 );

        String x2 = promoPage.getPassValue();

        Assert.assertEquals("qwerty123",x2);

        String x3 = promoPage.getFirstNameValue();

        Assert.assertEquals("Lord",x3);

        String x4 = promoPage.getlastNameValue();

        Assert.assertEquals("Sorrow",x4);

        String x5 = promoPage.getPhoneValue();

        Assert.assertEquals("(206) 000-1133",x5);









    }
}
