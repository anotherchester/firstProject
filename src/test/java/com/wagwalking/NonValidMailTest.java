package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWFPage;
import org.junit.Assert;
import org.junit.Test;

public class NonValidMailTest extends BaseTest {

    private HomePage homePage;
    private PromotionWFPage promoPage;

    @Test
    public void testNonValidMail() throws InterruptedException {

        homePage = new HomePage(driver);
        promoPage = homePage.clickWalkFreeButton();
        promoPage.inputEmail("aaabbb");
        promoPage.clickPassField();
        Thread.sleep(2000);
        String invalidMailFieldNote = promoPage.getInvalidMailText();
        Assert.assertTrue(invalidMailFieldNote.equals("please provide a valid email"));


    }
}
