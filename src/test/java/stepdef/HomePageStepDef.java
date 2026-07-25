package stepdef;

import base.BaseTest;
import io.cucumber.java.en.Then;
import pages.PageObjectManager;

public class HomePageStepDef extends BaseTest {

    private PageObjectManager pageManager = new PageObjectManager();

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        pageManager.getHomePage().userInHomePage();
    }
}
