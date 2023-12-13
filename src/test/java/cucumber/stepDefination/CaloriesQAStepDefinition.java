package cucumber.stepDefination;

import com.ghetler.caloriesqa.config.AppConfig;
import com.ghetler.caloriesqa.demo.CalorieCalculatorTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = AppConfig.class)
@CucumberContextConfiguration
public class CaloriesQAStepDefinition {

    private final CalorieCalculatorTest calorieCalculatorTest;

    @Autowired
    public CaloriesQAStepDefinition(CalorieCalculatorTest calorieCalculatorTest) {
        this.calorieCalculatorTest = calorieCalculatorTest;
    }

    @Given("I am on the calorie calculator website")
    public void iAmOnTheCalorieCalculatorWebsite() {
        calorieCalculatorTest.launchCalculatorWebsite();
    }

    @When("I input my age as {int}")
    public void iInputMyAgeAs(int age) {
        calorieCalculatorTest.inputValidAge(age);
    }

    @Given("I select gender as {string}")
    public void iSelectGenderAs(String gender) {
        calorieCalculatorTest.selectGender(gender);
    }

    @And("I click the Calculate button")
    public void iClickTheCalculateButton() {
        calorieCalculatorTest.clickCalculateButton();
    }

    @Then("The calculator should accept the age within the valid range")
    public void theCalculatorShouldAcceptTheAgeWithinTheValidRange() {
        calorieCalculatorTest.verifyAgeAcceptance();
    }

    @Then("An error message for invalid age range should be displayed")
    public void anErrorMessageForInvalidAgeRangeShouldBeDisplayed() {
        calorieCalculatorTest.verifyInvalidAgeErrorMessageDisplayed();
    }
}
