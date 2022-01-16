package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featureFiles/GoogleFeature.feature" , glue="stepDefinitions")
public class RunnerClass extends AbstractTestNGCucumberTests{

}
