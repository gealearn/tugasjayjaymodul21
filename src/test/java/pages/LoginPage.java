package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    By usernameInputText = By.cssSelector("#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By textError = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void  seeErrorMessage(String errorMessage){
        WebElement txtError =  wait.until(ExpectedConditions.visibilityOfElementLocated(textError));
        System.out.println(txtError.getText());
        Assertions.assertTrue(txtError.getText().contains(errorMessage));
    }
}
