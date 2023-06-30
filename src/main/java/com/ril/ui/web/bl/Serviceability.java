package com.ril.ui.web.bl;

import com.ril.ui.web.screens.DashboardPage;

public class Serviceability {

    public Serviceability enterPicodeAndApply(String pincode){

        new DashboardPage().enterPincode(pincode).clickOnPincodeApplyButton();
        return this;
    }

}
