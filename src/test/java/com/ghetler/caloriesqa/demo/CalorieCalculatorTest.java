package com.ghetler.caloriesqa.demo;

import AssertionUtils.AssertionService;
import com.ghetler.caloriesqa.pages.CalculatorPage;
import com.ghetler.caloriesqa.webDriver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalorieCalculatorTest {

    private final AssertionService assertionService;
    private final WebDriverManager webDriverManager;
    private final CalculatorPage calculatorPage;
    private WebDriver driver;


    @Autowired
    public CalorieCalculatorTest(AssertionService assertionService, WebDriverManager webDriverManager, CalculatorPage calculatorPage) {
        this.assertionService = assertionService;
        this.webDriverManager = webDriverManager;
        this.calculatorPage = calculatorPage;
        this.driver = webDriverManager.getDriver();
    }

    public void launchCalculatorWebsite() {
        if (driver == null) {
            this.driver = webDriverManager.getDriver();
        }
        calculatorPage.launchCalculatorWebsite();
    }

    public void inputValidAge(int age) {
        calculatorPage.inputAge(age);
    }

    public void selectGender(String gender) {
        calculatorPage.selectGender(gender);
    }

    public void clickCalculateButton() {
        calculatorPage.clickCalculateButton();
    }

    public void verifyAgeAcceptance() {
        boolean isErrorMessageDisplayed = calculatorPage.isInvalidAgeErrorMessageDisplayed();
        assertionService.assertErrorMessagePresence(isErrorMessageDisplayed);
    }

    public void verifyInvalidAgeErrorMessageDisplayed() {
        boolean isErrorMessageDisplayed = calculatorPage.isInvalidAgeErrorMessageDisplayed();
        assertionService.assertErrorMessagePresence(isErrorMessageDisplayed);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
