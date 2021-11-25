package org.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Workspace\\CucumberOne\\src\\test\\resources\\LoginFb.feature", glue ="org.StepDef")
public class TestRunner {
	
	
}
