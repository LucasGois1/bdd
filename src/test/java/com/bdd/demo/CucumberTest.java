package com.bdd.demo;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

/**
 * To run cucumber test.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, summary, html:build/cucumber/report.html,json:build/cucumber/cucumber.json,junit:build/cucumber/cucumber.xml"
)
public class CucumberTest{
}