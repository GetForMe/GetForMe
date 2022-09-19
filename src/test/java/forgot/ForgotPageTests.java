package forgot;

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
        SecureAreaPage secureArea = forgotPage.clickRetrievePassword();
        assertEquals(secureArea.getHeaderText(),"Internal Server Error",
                "Alert text is incorrect");
    }
}
