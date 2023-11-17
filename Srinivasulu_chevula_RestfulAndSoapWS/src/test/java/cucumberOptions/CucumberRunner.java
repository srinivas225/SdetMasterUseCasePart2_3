package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    // tags = "@all",
    plugin = {"pretty", "html:target/cucumberReport.html", "json:target/cucumberjson-report.json"}
)
public class CucumberRunner {
    // No need for a main method or extending any class
}
