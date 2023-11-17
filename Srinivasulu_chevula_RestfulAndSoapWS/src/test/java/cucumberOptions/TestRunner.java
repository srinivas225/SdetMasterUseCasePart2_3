package cucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources", // Specify the path to your feature files
    glue = "stepdefinitions",         // Specify the package where your step definitions are
    plugin = {"pretty", "html:target/cucumberReport.html", "json:target/cucumberjson-report.json"}
)
public class TestRunner {
}
 