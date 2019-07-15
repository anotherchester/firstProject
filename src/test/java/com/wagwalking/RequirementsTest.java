package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWFPage;
import org.junit.Assert;
import org.junit.Test;

public class RequirementsTest extends BaseTest {

    private HomePage homePage;
    private PromotionWFPage promoPage;

    @Test
    public void testRequirements() {

        homePage = new HomePage(driver);
        promoPage = homePage.clickWalkFreeButton();

        promoPage.clickEmailField();
        promoPage.clickPassField();
   //     promoPage.clickFirstNameField();
   //     promoPage.clickLastNameField();
   //     promoPage.clickPhoneField();

        String mailNote = promoPage.getRequiredField();
        Assert.assertEquals("required",mailNote);






    }

}
