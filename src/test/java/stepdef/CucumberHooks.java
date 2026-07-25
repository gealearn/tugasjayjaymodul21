package stepdef;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setup(){
        BaseTest.initDriver();
    }

    @After
    public void after(){
        BaseTest.quitDriver();
    }
}
