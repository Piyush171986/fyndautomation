package com.ril.ui.web.bl;

import com.ril.ui.web.screens.LandingPage;
import com.ril.ui.web.screens.LoginPage;

public class Login {
    public Login loginWithMerchant() {
        new LandingPage().clickOnLoginRegisterButton().clickOnSegment("Institution");
        //new LoginPage().
        return this;

    }


}
