package com.ril.web.bl;

import com.ril.web.screens.DashboardPage;
import org.testng.Assert;

public class Serviceability {

    public Serviceability enterPicodeAndApply(String pincode){

        new DashboardPage().enterPincode(pincode).clickOnPincodeApplyButton();
        return this;
    }

    public Serviceability isInvalidPincode() {
        Assert.assertEquals(true,new DashboardPage().isInvalidPincode());
        return this;
    }
    public Serviceability isValidPincode() {
        Assert.assertEquals(false,new DashboardPage().isInvalidPincode());
        return this;
    }

}
