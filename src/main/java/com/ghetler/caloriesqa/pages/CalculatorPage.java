package com.ghetler.caloriesqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {
    private final WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void launchCalculatorWebsite() {
        driver.get("https://www.calculator.net/carbohydrate-calculator.html");
    }

    public void inputAge(int age) {
        WebElement ageInput = driver.findElement(By.id("cage"));
        ageInput.clear();
        ageInput.sendKeys(String.valueOf(age));
    }

    public void selectGender(String gender) {
        WebElement genderRadioButton;
        if (gender.equalsIgnoreCase("male")) {
            genderRadioButton = driver.findElement(By.id("csex1"));
        } else if (gender.equalsIgnoreCase("female")) {
            genderRadioButton = driver.findElement(By.id("csex2"));
        } else {
            throw new IllegalArgumentException("Invalid gender provided.");
        }
        genderRadioButton.click();
    }

    public void clickCalculateButton() {
        WebElement calculateButton = driver.findElement(By.cssSelector("input[name='x'][value='Calculate']"));
        calculateButton.click();
    }

    public boolean isInvalidAgeErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.xpath("//div/font[contains(text(),'Please provide an age between 18 and 80.')]"));
            return errorMessage.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}