package com.ril.web.screens;

import com.ril.common.Driver;
import com.ril.common.Environment;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private JSONObject env = Environment.envVariables.getEnvData().getJSONObject("sit").getJSONObject("merchant");
    private String segment = System.getProperty("segment");
    public LoginPage() {
        driver = Driver.driverWrapper.getDriver();
    }



    public LoginPage clickOnPasswordTab() {
        this.driver.findElement(By.xpath("//div[contains(text(),'Password')]")).click();
        return this;
    }

    public LoginPage enterUserName(String username ) {
        username = env.getJSONObject(segment).getString("mobileNumber");
        this.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password ) {
        password = env.getJSONObject(segment).getString("password");
        this.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;
    }
    public LoginPage clickOnSignInButton( ) {
        this.driver.findElement(By.xpath("//button//span[text()='Sign in']")).click();
        return this;
    }

}
