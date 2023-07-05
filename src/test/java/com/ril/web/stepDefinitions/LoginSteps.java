package com.ril.web.stepDefinitions;

import com.ril.web.bl.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("Login with a Merchant")
    public void loginWithAMerchant() {
        new Login().loginWithMerchant();   // step defination will alwys call BL calls and not screens
    }
    @Then("Merchant should be looged in")
    public void merchantShouldBeLoggedIn() {
        new Login().validateSucessfulLogin();
    }
}
