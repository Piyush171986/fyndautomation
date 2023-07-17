package com.ril.web.screens;

import com.ril.web.common.Page;

public class LoginPage extends Page {
    public LoginPage clickOnPasswordTab() {
        driver.findElement("//div[contains(text(),'Password')]").click();
        return this;
    }

    public LoginPage enterUserName(String username) {
        username = merchant.get("mobileNumber");
        driver.findElement("//input[@id='username']").sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password ) {
        password = merchant.get("password");
        driver.findElement("//input[@id='password']").sendKeys(password);
        return this;
    }
    public LoginPage clickOnSignInButton( ) {
        driver.findElement("//button//span[text()='Sign in']").click();
        return this;
    }

}
