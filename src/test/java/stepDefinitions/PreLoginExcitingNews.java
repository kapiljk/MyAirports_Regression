package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class PreLoginExcitingNews {


    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@pre-loginNews", order = 0)
    public void launchApplication() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After
    public void closeApplication() {
        BaseSteps.closeDriver();
    }


    @When("verify that exciting news present on the prelogin page")
    public void verify_that_exciting_news_present_on_the_prelogin_page() {
    pm.preLoginPage().verifyReadMore();
    }
    @When("the user clicks on the Read More link")
    public void the_user_clicks_on_the_read_more_link() {
    pm.preLoginPage().clickOnReadMore();
    }
    @Then("verify the user navigates to the exciting news page")
    public void verify_the_user_navigates_to_the_exciting_news_page() {
    pm.preLoginPage().verifyNewsPage();
    }
    @Then("clicks on the back arrow icon in the exciting news page")
    public void clicks_on_the_back_arrow_icon_in_the_exciting_news_page() {
    pm.preLoginPage().clickOnBackInNews();
    }
    @Then("verify the user navigated to preloginpage")
    public void verify_the_user_navigated_to_preloginpage() {
    pm.preLoginPage().verifyPreLoginPage();
    }



}
