package com.ril.ui.web.stepDefinitions;

import com.ril.ui.web.bl.Login;
import io.cucumber.java.en.Given;

public class LoginSteps {

    @Given("Login with a Merchant")
    public void loginWithAMerchant() {
        new Login().loginWithMerchant();   // step defination will alwys call BL calls and not screens

    }
}
