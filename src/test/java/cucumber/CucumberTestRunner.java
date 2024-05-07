package cucumber;

import com.ghetler.caloriesqa.config.AppConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.ghetler.caloriesqa", "cucumber.stepDefinition"},
        plugin = {"pretty", "html:target/cucumber"}
)
@ContextConfiguration(classes = {AppConfig.class})
public class CucumberTestRunner {
    // No methods should be here
}
