package com.ril.web.screens;

import com.ril.web.common.Page;

public class DashboardPage extends Page {
    public DashboardPage enterPincode(String pincode) {
        driver.sendKeys("//input[@placeholder='Enter PIN Code']",pincode); //this for golbal variable
        return this;
    }
    public DashboardPage clickOnPincodeApplyButton() {
        driver.click("//div[contains(text(),'Apply')]"); //this for golbal variable
        return this;
    }
    public Boolean isPincodeFieldVisible() {
       if(driver.findElement("//input[@placeholder='Enter PIN Code']").isDisplayed()) {
           return true;
       } else {
           return false;
       }
    }
    public Boolean isInvalidPincode() {
        return driver.findElement("//span[normalize-space()='Pincode is not Serviceable']").isDisplayed();

    }

}
