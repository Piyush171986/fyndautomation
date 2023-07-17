package com.ril.web.screens;

import com.ril.web.common.Page;

public class LandingPage extends Page {
    public LandingPage clickOnLoginRegisterButton() {
        driver.findElement("//div[@class='main-popup-container']").isDisplayed();
        driver.click("//span[contains(text(),'Login / Register')]");
        return this;
    }
    public LandingPage clickOnSegment() {
        driver.click("//h3[contains(text(),\""+ segment.toLowerCase()+"\")]");
        return this;
    }
    public LandingPage clickOnContinueButton() {
        driver.click("//button[@type='button']");
        return this;
    }

}
