package com.ril.ui.web.screens;

import com.ril.ui.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    private WebDriver driver;
    public LandingPage() {
        driver = Driver.driverWrapper.getDriver();
    }

    public LandingPage clickOnLoginRegisterButton() {
        this.driver.findElement(By.xpath("(//span[contains(text(),'Login / Register')])[1]")).click(); //this for golbal variable
        return this;
    }
    public LandingPage clickOnSegment(String segment) {
        this.driver.findElement(By.xpath("//h3[contains(text(),\""+segment.toLowerCase()+"\")]")).click();
        return this;
    }
    public LandingPage clickOnContinueButton() {
        this.driver.findElement(By.xpath("//button[@type='button']")).click();
        return this;
    }

}
