package com.wagwalking;

import com.wagwalking.page.BecomePage;
import com.wagwalking.page.HomePage;
import org.junit.Test;

public class FillBecomeTest extends BaseTest {

    private HomePage homePage;
    private BecomePage becomePage;

    @Test
    public void testFillBecomeTest() throws InterruptedException {

        homePage = new HomePage(driver);
        becomePage = homePage.clickBecomeButton();
        becomePage.clickFirstNameField();
        becomePage.inputFirstname("Oleg");
        becomePage.inputLastname("Lastname");
        becomePage.inputEmail("worstmeme@mail.com");
        becomePage.inputPhone("2067717171");
        becomePage.inputAddress("5728 29th Ave NE");
        becomePage.inputApt("-");
        //  becomePage.clickApplyButton();


    }
}
