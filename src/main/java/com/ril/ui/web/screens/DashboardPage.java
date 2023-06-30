package com.ril.ui.web.screens;

import com.ril.ui.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;
    public DashboardPage() {
        driver = Driver.driverWrapper.getDriver();
    }

    public DashboardPage enterPincode(String pincode) {
        this.driver.findElement(By.xpath("//input[@placeholder='Enter PIN Code']")).sendKeys(pincode); //this for golbal variable
        return this;
    }
    public DashboardPage clickOnPincodeApplyButton() {
        this.driver.findElement(By.xpath("//div[contains(text(),'Apply')]")).click(); //this for golbal variable
        return this;
    }

    public Boolean isPincodeFieldVisible() {
       if(this.driver.findElement(By.xpath("//input[@placeholder='Enter PIN Code']")).isDisplayed()) {
           return true;
       } else {
           return false;
       }



    }
}
