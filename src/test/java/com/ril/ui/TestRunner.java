package com.ril.ui;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@current", features = {"src/test/java/com/ril/ui/web/features"}, glue = {"com.ril.ui.web.stepDefinitions"},
        plugin = {})

public class TestRunner extends AbstractTestNGCucumberTests {

}