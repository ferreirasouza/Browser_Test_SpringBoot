package com.ghetler.caloriesqa.config;

import com.ghetler.caloriesqa.pages.CalculatorPage;
import com.ghetler.caloriesqa.webDriver.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ghetler.caloriesqa.demo", "AssertionUtils"})
public class AppConfig {
    @SuppressWarnings("unused")
    @Bean
    public WebDriverManager webDriverManager() {
        return new WebDriverManager();
    }

    @SuppressWarnings("unused")
    @Bean
    public CalculatorPage calculatorPage(WebDriverManager webDriverManager) {
        return new CalculatorPage(webDriverManager.getDriver());
    }

    @SuppressWarnings("unused")
    @Bean
    public WebDriver webDriver(WebDriverManager webDriverManager) {
        return webDriverManager.getDriver();
    }

}
