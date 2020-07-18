package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\18173\\Documents\\AutomationTest\\Q7_8bgcolor\\src\\main\\java\\Features\\login.feature",
glue = {"step"},
dryRun=false,
monochrome=true,
plugin= {"pretty","html:test-output"}
)
public class loginRunner {

}
