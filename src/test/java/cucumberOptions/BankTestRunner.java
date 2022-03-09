package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/bank/features",
        glue = "bank/stepDefinitions",
//        dryRun = true,
        monochrome = false,
        plugin = {"pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@register_login"
)

public class BankTestRunner {
}
