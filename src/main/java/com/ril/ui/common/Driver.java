package com.ril.ui.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    private WebDriver driver;
    private Driver() {
        driver = new ChromeDriver();
        driver.get("https://institutions.jmpx2.de/sections/landing-page");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    public static Driver driverWrapper = new Driver();
    public  WebDriver getDriver() {

        return this.driverWrapper.driver;
    }



}
