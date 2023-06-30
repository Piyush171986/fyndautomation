package com.ril.ui.web.stepDefinitions;

import com.ril.ui.web.bl.Serviceability;
import io.cucumber.java.en.When;

public class ServiceabilitySteps {

    @When("Enter the Pincode as {string} and apply" )
    public void enterThePincode(String pincode) {
        new Serviceability().enterPicodeAndApply(pincode);

    }

}
