package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        publish = true,
        glue = "steps",
        plugin = {"pretty",
                "json:target/cucumber-reports.json",
                "junit:target/cucumber-reports.xml",
                "html:target/cucumber-reports.html",
                "rerun:target/cucumber-rerun.txt"})
public class TestRunner {
}
