package com.ril.web.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private WebDriver webDriver;
    private WebDriverWait wait;
    public static final int DEFAULT_EXPLICIT_WAIT=60;
    public static final int DEFAULT_IMPLICIT_WAIT=30;
    public static Driver driver=new Driver();
    public void startBrowser() {
        webDriver=new ChromeDriver();
        this.webDriver.get("https://institutions.jmpx2.de/sections/landing-page");
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_IMPLICIT_WAIT));
        wait=new WebDriverWait(this.webDriver,Duration.ofSeconds(DEFAULT_EXPLICIT_WAIT));
    }
    public void closeBrowser() {
        this.webDriver.quit();
    }
    public void setWaits(int explicitWaitInSeconds,int implicitWaitInSeconds) {
        wait=new WebDriverWait(this.webDriver,Duration.ofSeconds(explicitWaitInSeconds));
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitInSeconds));
    }
    public void click(String xpath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }
    public void sendKeys(String xpath,String keys) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).sendKeys(keys);
    }
    public WebElement findElement(String xpath) {
        return this.webDriver.findElement(By.xpath(xpath));
    }
}
