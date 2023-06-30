package com.ril.ui.web.screens;

import com.ril.ui.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    public LoginPage() {
        driver = Driver.driverWrapper.getDriver();
    }



    public LoginPage clickOnPasswordTab() {
        this.driver.findElement(By.xpath("//div[contains(text(),'Password')]")).click();
        return this;
    }

    public LoginPage enterUserName(String username ) {
        this.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password ) {
        this.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;
    }
    public LoginPage clickOnSignInButton( ) {
        this.driver.findElement(By.xpath("//button//span[text()='Sign in']")).click();
        return this;
    }

}
