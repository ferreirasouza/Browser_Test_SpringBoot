package com.ghetler.caloriesqa.webDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class WebDriverManager {

    private final WebDriver driver;

    @Autowired
    public WebDriverManager() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
