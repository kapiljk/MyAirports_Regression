package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class SpecialAssistancePageSteps {


    private AndroidDriver _driver;
    public PageObjectManager pm;

    @Before(value = "@specialAssistance", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@specialAssistance")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@specialAssistance", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.prelogins();
    }

    @Before(value = "@specialAssistance", order = 2)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Given("the user clicks on the Special Assistance on the home page")
    public void the_user_clicks_on_the_special_assistance_on_the_home_page() {
        pm.homePage().clickOnSpecialAssistance();
    }
    @Given("Verify the Special Assistance page")
    public void verify_the_special_assistance_page() {
      pm.specialAssistancePage().verifySpecialAssistancePage();
    }
    @Then("Clicks on the Travel with children")
    public void clicks_on_the_travel_with_children() {
       pm.specialAssistancePage().clickOnTravellingWithChildrenButton();
    }
    @Then("Verify the Travel with children page")
    public void verify_the_travel_with_children_page() {
       pm.specialAssistancePage().verifytravelWithChild();
    }
    @Then("Clicks on the Baby Care Room")
    public void clicks_on_the_baby_care_room() {
       pm.specialAssistancePage().clickOnbabyCareroom();
    }
    @Then("Verify Baby Care Room expanded")
    public void verify_baby_care_room_expanded() {
        pm.specialAssistancePage().verifyBabyCareRoom();
    }
    @Then("Clicks on the Unaccompanied Minor Service")
    public void clicks_on_the_unaccompanied_minor_service() {
       pm.specialAssistancePage().clickOnMinorService();
    }
    @Then("Verify Unaccompanied Minor Service expanded")
    public void verify_unaccompanied_minor_service_expanded() {
        pm.specialAssistancePage().verifyMinorService();
    }
    @Then("Clicks on Back in travel with children page")
    public void clicks_on_back_in_travel_with_children_page() {
       pm.specialAssistancePage().clickOnBackInChild();
    }
    @Then("Clicks on the Assistance for a person")
    public void clicks_on_the_assistance_for_a_person() {
       pm.specialAssistancePage().clickOnAssistanceButton();
    }
    @Then("Verify Assistance for a person page")
    public void verify_assistance_for_a_person_page() {
        pm.specialAssistancePage().verifyAssistanceForAPerson();
    }
    @Then("Clicks on the Hidden Disabilities")
    public void clicks_on_the_hidden_disabilities() {
        pm.specialAssistancePage().clickOnHiddenDisability();
    }
    @Then("Clicks on Back in the Assiatnce for a person page")
    public void clicks_on_back_in_the_assiatnce_for_a_person_page() {
        pm.specialAssistancePage().clickBackinAssiatnce();
    }
    @Then("Clicks on Others in Special Assiatnce page")
    public void clicks_on_others_in_special_assiatnce_page() {
        pm.specialAssistancePage().clickOnOtherButton();
    }
    @Then("Verify Others page")
    public void verify_others_page() {
pm.specialAssistancePage().verifyOthersPage();
    }
    @Then("CLicks on the Medical Services in Others page")
    public void c_licks_on_the_medical_services_in_others_page() {
pm.specialAssistancePage().clickOnMedical();
    }
    @Then("Clicks on the Airlines Assistance in Others page")
    public void clicks_on_the_airlines_assistance_in_others_page() {
       pm.specialAssistancePage().clickAirlineService();
    }
    @Then("Clicks on Back in Others page")
    public void clicks_on_back_in_others_page() {
pm.specialAssistancePage().clickBackInOtherPage();
    }
    @Then("Clicks on Back in Special Assistacne page")
    public void clicks_on_back_in_special_assistacne_page() {
      pm.specialAssistancePage().clickOnBackButton();
    }
    @Then("Verify that the user is redirected to the home page")
    public void Verify_that_the_user_is_redirected_to_the_home_page() {
        pm.homePage().verifyHomePage();
    }

}
