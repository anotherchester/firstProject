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
        String mailNote = promoPage.getRequiredMailField()  ;
        Assert.assertEquals("required",mailNote);
        promoPage.clickFirstNameField();
        String passNote = promoPage.getRequiredPassField();
        Assert.assertEquals("required",passNote);
        promoPage.clickLastNameField();
        String firstnameNote = promoPage.getRequiredFirstnameField();
        Assert.assertEquals("required",firstnameNote);
        promoPage.clickPhoneField();
        String lastnameNote = promoPage.getRequiredLastnameField();
        Assert.assertEquals("required",lastnameNote);
        promoPage.clickPassField();
        String phoneNote = promoPage.getRequiredPhoneField();
        Assert.assertEquals("required",phoneNote);







    }

}
