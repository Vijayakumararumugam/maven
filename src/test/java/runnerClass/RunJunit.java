package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, 
glue = {"pages","runnerClass"},plugin= {"pretty","html:target/report"},strict=true,tags= {"@smoke or @sanity"}, monochrome= true) 
public class RunJunit {

	
}
