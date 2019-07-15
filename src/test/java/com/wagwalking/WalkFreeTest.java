package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWFPage;
import org.junit.Test;

public class WalkFreeTest extends BaseTest {

    private HomePage homePage;
    private PromotionWFPage promoPage;

    @Test
    public void testWalkFree() {

        homePage = new HomePage(driver);

        promoPage = homePage.clickWalkFreeButton();

        promoPage = new PromotionWFPage(driver);

        promoPage.inputEmail("umbasa@cinder.com");

        promoPage.inputPass("qwerty123");

        promoPage.inputFirstName("Lord");

        promoPage.inputLastName("Sorrow");

        promoPage.inputPhone("0001133");

    }
}
