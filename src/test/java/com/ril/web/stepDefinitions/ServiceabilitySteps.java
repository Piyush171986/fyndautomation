package com.ril.web.stepDefinitions;

import com.ril.web.bl.Serviceability;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceabilitySteps {

    @When("Enter the Pincode as {string} and apply" )
    public void enterThePincode(String pincode) {
        new Serviceability().enterPicodeAndApply(pincode);

    }

    @Then("Non Serviceable Error should come")
    public void isInvalidPincode() {
        new Serviceability().isInvalidPincode();
    }
    @Then("Non Serviceable Error should not come")
    public void isValidPincode() {
        new Serviceability().isValidPincode();
    }

}
