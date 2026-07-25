package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public PageObjectManager() {
        this.driver = BaseTest.getDriver();
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }
}