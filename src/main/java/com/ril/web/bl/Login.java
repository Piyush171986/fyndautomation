package com.ril.web.bl;

import com.ril.web.screens.DashboardPage;
import com.ril.web.screens.LandingPage;
import com.ril.web.screens.LoginPage;
import org.testng.Assert;

public class Login {

    public Login loginWithMerchant() throws InterruptedException {
        new LandingPage().clickOnLoginRegisterButton().clickOnSegment().clickOnContinueButton();
        new LoginPage().clickOnPasswordTab().enterUserName("9833612140").enterPassword("Test@1357").clickOnSignInButton();
        return this;
    }
    public Login validateSucessfulLogin() {
        Assert.assertEquals(true,new DashboardPage().isPincodeFieldVisible());
        return this;
    }

}
