package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//it will run cucumber
@RunWith(Cucumber.class)
//while running as cucumber, it will link feature file location & step definition [package]

@CucumberOptions(features = "FeatureFiles", glue = {"stepDefinitions","hooks" }, dryRun= false, tags = "@background")


public class RunnerClass {
    //it should combine the feature file & step definition
	//Runner define[ by default cucumber will run as junit only)
	
	
}
