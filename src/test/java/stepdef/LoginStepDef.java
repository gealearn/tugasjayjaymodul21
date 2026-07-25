package stepdef;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PageObjectManager;

public class LoginStepDef extends BaseTest {

    private PageObjectManager pageManager = new PageObjectManager();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        pageManager.getLoginPage().goToLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        pageManager.getLoginPage().inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        pageManager.getLoginPage().inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        pageManager.getLoginPage().clickLoginButton();
    }

    @And("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
        pageManager.getLoginPage().seeErrorMessage(arg0);
    }
}
