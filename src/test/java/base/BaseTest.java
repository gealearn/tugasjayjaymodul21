package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    private static WebDriver driver;

    public static void initDriver() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }
}