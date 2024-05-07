package com.ghetler.caloriesqa.webDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class WebDriverManager {

    private final WebDriver driver;

    @Autowired
    public WebDriverManager() {
        String os = System.getProperty("os.name").toLowerCase();
        String driverPath;

        if (os.contains("win")) {
            driverPath = "src\\test\\resources\\chromedriver.exe"; // Path for Windows
        } else if (os.contains("linux")) {
            driverPath = "src/test/resources/chromedriver-linux64/chromedriver"; // Path for Linux
        } else {
            throw new IllegalStateException("Unsupported operating system");
        }

        System.setProperty("webdriver.chrome.driver", driverPath);
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
