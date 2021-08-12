package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/features/UpdateIncident.feature",
glue="stepdefinitionHooks",
monochrome=true,
publish=true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
