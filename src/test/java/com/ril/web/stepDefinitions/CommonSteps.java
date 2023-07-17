package com.ril.web.stepDefinitions;

import com.ril.web.common.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps extends Page {
    @Before
    public void setUp() {
        driver.startBrowser();
    }
    @After
    public void cleanUp() throws InterruptedException {
        Thread.sleep(10000);
        driver.closeBrowser();
    }
}
