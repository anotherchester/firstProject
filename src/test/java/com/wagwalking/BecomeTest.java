package com.wagwalking;

import com.wagwalking.page.BecomePage;
import com.wagwalking.page.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class BecomeTest extends BaseTest {

    private HomePage homePage;
    private BecomePage becomePage;


    @Test
    public void testBecomeWalker() throws InterruptedException {

        homePage = new HomePage(driver);
        becomePage = homePage.clickBecomeButton();
        becomePage.clickApplyButton();
       // Thread.sleep(3000);
        String firstNameErrNote = becomePage.getFirstnameErrTxt();
        Assert.assertEquals("First name cannot be blank", firstNameErrNote);
        String lastNameErrNote = becomePage.getLastnameErrTxt();
        Assert.assertEquals("Last name cannot be blank",lastNameErrNote);
        String emailErrNote = becomePage.getEmailErrTxt();
        Assert.assertEquals("Enter a valid email address",emailErrNote);
        String phoneErrNote = becomePage.getPhoneErrTxt();
        Assert.assertEquals("Enter a valid phone number",phoneErrNote);




    }
}
