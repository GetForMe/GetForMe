package Forgot;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class ForgotPageTests extends BaseTests {

    @Test
    public void testSuccessfulForgotPassword(){
        ForgotPage forgotPage = homePage.clickForgotPage();
        forgotPage.setEmailField("carrier@zone.com");
        //forgotPage.clickRetrievePassword();
        SecureAreaPage secureArea = forgotPage.clickRetrievePassword();
        assertEquals(secureArea.toString(),"pages.SecureAreaPage",
                "Alert text is incorrect");
    }
}
