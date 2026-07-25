package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    By backPackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void userInHomePage(){
        WebElement productElement = driver.findElement(backPackItem);
        Assertions.assertTrue(productElement.isDisplayed());
        Assertions.assertEquals("Sauce Labs Backpack",productElement.getText());
    }
}
