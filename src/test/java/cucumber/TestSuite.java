package cucumber;

import com.ghetler.caloriesqa.demo.CalorieCalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CucumberTestRunner.class,
        CalorieCalculatorTest.class,
        // Add more test classes if needed
        // OtherTestClass1.class,
        // OtherTestClass2.class,
})
public class TestSuite {
    // This class doesn't need any code implementation
    // It serves as a container for running multiple test classes together
}
