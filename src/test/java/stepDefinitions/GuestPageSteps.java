package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class GuestPageSteps {

    public AndroidDriver _driver;
    private PageObjectManager pm;


    @Before(value = "@guest", order = 0)
    public void launchApplication() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }
    @Before(value = "@guest", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.guestLogin();
    }

    @After
    public void closeApplication() {
        BaseSteps.closeDriver();
    }

    @Given("the user clicks on the Guest button on the PreLogin page")
    public void theUserClicksOnTheGuestButtonOnThePreLoginPage() {pm.guestPage().clickOnGuestButton();}
    @Then("the guest successfully navigates to the Home page")
    public void the_guest_successfully_navigates_to_the_home_page() {pm.guestPage().verifyHome();}
    @Then("the guest clicks on the Special Assistance on the home page")
    public void the_guest_clicks_on_the_special_assistance_on_the_home_page() {pm.guestPage().clickSpecialAssistance();}
    @Then("verify the Special Assistance page")
    public void verify_the_special_assistance_page() {pm.guestPage().verifySpecialAssistance();}
    @Then("clicks on Back in Special Assistacne page")
    public void clicks_on_back_in_special_assistacne_page() {pm.guestPage().clickBackSpecialAssistance();}
    @Then("Verify that the guest is redirected to the home page")
    public void verify_that_the_guest_is_redirected_to_the_home_page() {pm.guestPage().verifyHome();}
    @When("the guest is on the Home Page")
    public void the_guest_is_on_the_home_page() {pm.guestPage().verifyHome();}

    @Then("all the buttons should be displayed in the Menu for guest")
    public void all_the_buttons_should_be_displayed_in_the_menu_for_guest() {
        pm.menuPopup().verifySpecialAssistanceButton();
        pm.menuPopup().verifyFlightsButton();
        pm.menuPopup().verifyPromotionsButton();
    }
    @When("the guest clicks on the SPECIAL ASSISTANCE feature in the Menu")
    public void the_guest_clicks_on_the_special_assistance_feature_in_the_menu() {
        pm.menuPopup().clickOnSpecialAssistanceButton();
    }
    @Then("the guest should be navigated to the SPECIAL ASSISTANCE Page")
    public void the_guest_should_be_navigated_to_the_special_assistance_page() {
        pm.menuPopup().specialAssistancePage().verifySpecialAssistancePage();
    }
    @When("the guest clicks on the Back button on the SPECIAL ASSISTANCE Page")
    public void the_guest_clicks_on_the_back_button_on_the_special_assistance_page() {
        pm.menuPopup().specialAssistancePage().clickOnBackButton();
    }
    @Then("the guest should be navigated back to the Home Page")
    public void the_guest_should_be_navigated_back_to_the_home_page() {
        pm.homePage().verifyHomePage();
    }
    @When("the guest clicks on the Menu button from the Home Page")
    public void the_guest_clicks_on_the_menu_button_from_the_home_page() {
        pm.homePage().clickOnMenuButton();
    }
    @When("the guest selects the FLIGHTS feature in the Menu")
    public void the_guest_selects_the_flights_feature_in_the_menu() {
        pm.menuPopup().clickOnFlightsButton();
    }
    @Then("the guest should be navigated to the FLIGHTS Information Page")
    public void the_guest_should_be_navigated_to_the_flights_information_page() {
        pm.menuPopup().flightPage().verifyFlightsInformationPage();
    }
    @When("the guest clicks on the Back button on the FLIGHTS Information Page")
    public void the_guest_clicks_on_the_back_button_on_the_flights_information_page() {
        pm.menuPopup().flightPage().clickOnBackButton();
    }
    @When("the guest selects the PROMOTIONS feature in the Menu")
    public void the_guest_selects_the_promotions_feature_in_the_menu() {
        pm.menuPopup().clickOnPromotionsButton();
    }
    @Then("the guest should be navigated to the PROMOTIONS Page")
    public void the_guest_should_be_navigated_to_the_promotions_page() {
        pm.menuPopup().promotionsPage().verifyPromotionsPage();
    }
    @When("the guest clicks on the Back button on the PROMOTIONS Page")
    public void the_guest_clicks_on_the_back_button_on_the_promotions_page() {
        pm.menuPopup().promotionsPage().clickOnBackButton();
    }
    @When("the guest selects the GENERAL feature in the Menu")
    public void the_guest_selects_the_general_feature_in_the_menu() {
        pm.menuPopup().clickOnGeneralButton();
    }
    @Then("the guest should be navigated to the GENERAL Page")
    public void the_guest_should_be_navigated_to_the_general_page() {
        pm.menuPopup().generalPage().verifyGeneralPage();
}
    @When("the guest clicks on the Back button on the GENERAL Page")
    public void the_guest_clicks_on_the_back_button_on_the_general_page() {
        pm.menuPopup().generalPage().clickOnBackButton();
    }
    @When("the guest selects the KEY INFO feature in the Menu")
    public void the_guest_selects_the_key_info_feature_in_the_menu() {
        pm.menuPopup().clickOnKeyInfoButton();
    }
    @Then("the guest should be navigated to the KEY INFO Page")
    public void the_guest_should_be_navigated_to_the_key_info_page() {
        pm.menuPopup().keyInfoPage().verifyKeyInfoPage();
    }
    @When("the guest clicks on the Back button on the KEY INFO Page")
    public void the_guest_clicks_on_the_back_button_on_the_key_info_page() {
        pm.menuPopup().keyInfoPage().clickOnBackButton();
    }
    @When("the guest clicks on the User Profile button on the homepage")
    public void the_guest_clicks_on_the_user_profile_button_on_the_homepage() {
       pm.homePage().clickOnUserAccount();
    }
    @Then("the guest navigates to the Login page")
    public void the_guest_navigates_to_the_login_page() {
        pm.loginPage().verifyLoginPage();
    }



}
