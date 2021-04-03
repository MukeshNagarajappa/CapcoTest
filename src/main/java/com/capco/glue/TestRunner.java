package com.capco.glue;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = {"src/test/resources/features/Test.feature"}, 
        glue = {"com.capco.stepDefs"},
		plugin = {"pretty" ,"html:target/cucumber-htmlreport"}
		//tags ={"@Smoke"}
)		

public class TestRunner {

}
