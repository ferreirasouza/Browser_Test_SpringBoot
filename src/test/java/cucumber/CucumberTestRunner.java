package cucumber;

import com.ghetler.caloriesqa.config.AppConfig;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.ghetler.caloriesqa", "AssertionUtils"},
        plugin = {"pretty"}
)

@SuppressWarnings("java:S5786")
@ContextConfiguration(classes = {AppConfig.class})
public class CucumberTestRunner {

    @Before
    public void setupCucumberSpringContext() {
        // Dummy method to start Spring context before Cucumber tests
    }
}
