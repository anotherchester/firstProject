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
        promoPage.clickFirstNameField();
        promoPage.clickLastNameField();
        promoPage.clickPhoneField();
        promoPage.clickPassField();
        String passNote1 = promoPage.getPassField1();
        Assert.assertTrue(passNote1.contains("8 Characters"));
        String passNote2 = promoPage.getPassField2();
        Assert.assertTrue(passNote2.contains("1 Letter"));
        String passNote3 = promoPage.getPassField3();
        Assert.assertTrue(passNote3.contains("1 Number"));
        String mailNote = promoPage.getRequiredMailField()  ;
        Assert.assertEquals("required",mailNote);
        String firstnameNote = promoPage.getRequiredFirstnameField();
        Assert.assertEquals("required",firstnameNote);
        String lastnameNote = promoPage.getRequiredLastnameField();
        Assert.assertEquals("required",lastnameNote);
        String phoneNote = promoPage.getRequiredPhoneField();
        Assert.assertEquals("required",phoneNote);








    }

}
