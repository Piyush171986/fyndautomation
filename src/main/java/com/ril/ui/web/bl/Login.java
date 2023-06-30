package com.ril.ui.web.bl;

import com.ril.ui.web.screens.DashboardPage;
import com.ril.ui.web.screens.LandingPage;
import com.ril.ui.web.screens.LoginPage;
import org.testng.Assert;

import java.security.PublicKey;

public class Login {
    public Login loginWithMerchant(String merchantType) {
        new LandingPage().clickOnLoginRegisterButton().clickOnSegment(merchantType).clickOnContinueButton();
        new LoginPage().clickOnPasswordTab().enterUserName("9833612140").enterPassword("Test@1357").clickOnSignInButton();
        return this;
    }
    public Login validateSucessfulLogin() {
        Assert.assertEquals(true,new DashboardPage().isPincodeFieldVisible());
        return this;
    }

}
