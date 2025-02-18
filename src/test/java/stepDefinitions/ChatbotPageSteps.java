package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class ChatbotPageSteps {


    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@Chatbot", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@Chatbot")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@Chatbot", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.prelogins();
    }

    @Before(value = "@Chatbot", order = 2)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Then("click on the chatbot icon in the landing page")
    public void click_on_the_chatbot_icon_in_the_landing_page() {
       pm.homePage().clickOnChatBot();
    }

}
