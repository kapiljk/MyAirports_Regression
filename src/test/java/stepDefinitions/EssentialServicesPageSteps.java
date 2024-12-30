package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class EssentialServicesPageSteps {

    private AndroidDriver _driver;
    public PageObjectManager pm;
    private String textFromAnyOneOfService;

    @Before(value = "@essentials", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@essentials")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@essentials", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.prelogins();
    }

    @Before(value = "@essentials", order = 2)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Given("the user clicks on the Essential Services button on the home page")
    public void the_user_clicks_on_the_essential_services_button_on_the_home_page() {
    pm.homePage().clickOnEssentialAndServicesIcon();
    }
    @Then("the user navigates to the Essential Services page")
    public void the_user_navigates_to_the_essential_services_page() {
        pm.essentialServicePage().verifyEssentialServicesPage();

    }
    @Then("clicks on the terminal dropdown to change the terminal in the Essential Services page")
    public void clicks_on_the_terminal_dropdown_to_change_the_terminal_in_the_essential_services_page() {
        pm.essentialServicePage().clickOnTerminalDropDown();
        pm.essentialServicePage().clickOnTerminal2();

    }
    @Then("clicks on any of the Services from the Services list")
    public void clicks_on_any_of_the_services_from_the_services_list() {
        pm.essentialServicePage().waitForAllServiceVisible();
        textFromAnyOneOfService = pm.essentialServicePage().getTextFromAnyOneOfService();
        pm.essentialServicePage().clickOnAnyOneOfStore();
    }
    @Then("verifies that the user navigates to the same Service page")
    public void verifies_that_the_user_navigates_to_the_same_service_page() {
    pm.essentialServicePage().verifyServicePageTitle(textFromAnyOneOfService);
    }
    @Then("verifies that the Essential Service page is displayed")
    public void verifies_that_the_essential_service_page_is_displayed() {
    pm.essentialServicePage().verifyEssentialServicesPage();
    }
    @Then("verifies the back arrow icon in the Essential Service page and clicks on the back arrow icon")
    public void verifies_the_back_arrow_icon_in_the_essential_service_page_and_clicks_on_the_back_arrow_icon() {
    pm.essentialServicePage().clickOnBackIcon();
    }

    @Then("clicks on the favorite to add to favorites in Service details page")
    public void clicks_on_the_favorite_to_add_to_favorites_in_service_details_page() {
    pm.essentialServicePage().clickOnFavourite();
    }
    @Then("verifies the Rating Review text in the POI Service details page")
    public void verifies_the_rating_review_text_in_the_poi_service_details_page() {
    pm.essentialServicePage().verifyRatingReviewLbl();
    }
    @Then("verifies the Take Me There text in the POI Service details page")
    public void verifies_the_take_me_there_text_in_the_poi_service_details_page() {
    pm.essentialServicePage().verifyTakeMeThereLbl();
    }
    @Then("verifies the back arrow icon in the POI Service details page")
    public void verifies_the_back_arrow_icon_in_the_poi_service_details_page() {
    pm.essentialServicePage().verifyOnBackIconService();
    }
    @Then("clicks on the back arrow icon in the POI Service details page")
    public void clicks_on_the_back_arrow_icon_in_the_poi_service_details_page() {
    pm.essentialServicePage().clickOnBackIconService();
    }
    @Then("verifies that it takes the user to the home page from Essential Service page")
    public void verifies_that_it_takes_the_user_to_the_home_page_from_essential_service_page() {
        pm.homePage().verifyHomePage();
    }

}
