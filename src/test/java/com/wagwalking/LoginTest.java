package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

   private HomePage homePage;
   private LoginPage loginPage;

   @Test
    public void testLogin () throws InterruptedException {

       homePage = new HomePage(driver);
       loginPage = homePage.clickLoginButton();
       loginPage.inputEmail("ocherniaev@gmail.com");
       loginPage.inputPass("Qwerty123");
       loginPage.clickLogButton();
       Thread.sleep(3000);
       String ErrorAlertNote = loginPage.getErrorAlert();
       Assert.assertEquals("Invalid credentials",ErrorAlertNote);

   }
}
