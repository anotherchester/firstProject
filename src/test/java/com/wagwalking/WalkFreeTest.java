package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWFPage;
import org.junit.Test;

public class WalkFreeTest extends BaseTest {

    private HomePage homePage;
    private PromotionWFPage promo;

    @Test
    public void testWalkFree() {

        homePage = new HomePage(driver);

        promo = homePage.clickWalkFreeButton();

        promo = new PromotionWFPage(driver);

        promo.inputEmail("umbasa@cinder.com");

        promo.inputPass("qwerty123");

        promo.inputFirstName("Lord");

        promo.inputLastName("Sorrow");

        promo.inputPhone("0001133");

    }
}
