package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.Assert;
import utils.*;

import java.net.MalformedURLException;

public class HomePageSteps {

    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@homePage or @news or @flights or @menu or @GlobalSearch", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@homePage or @news or @flights or @menu or @GlobalSearch")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@homePage or @news or @flights or @menu or @GlobalSearch", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.prelogins();
    }

    @Before(value = "@homePage or @news or @flights or @menu or @GlobalSearch", order = 2)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Given("the user select the Terminal1 from the dropdown")
    public void the_user_select_the_terminal1_from_the_dropdown() {
        pm.homePage().clickOnDDTerminal();
        pm.homePage().selectTerminal1();
    }

    @Given("the user select the Terminal2 from the dropdown")
    public void the_user_select_the_terminal2_from_the_dropdown() {
        pm.homePage().clickOnDDTerminal();
        pm.homePage().selectTerminal2();
    }
    @Then("the user is able to view flights, dining, essentials & services, stores, customer feedback and booking services in the first slide")
    public void the_user_is_able_to_view_flights_dining_essentials_services_stores_customer_feedback_and_booking_services_in_the_first_slide() {
        pm.homePage().verifyFlightsIcon();
        pm.homePage().verifyDinningIcon();
        pm.homePage().verifyEssentialAndServicesIcon();
        pm.homePage().verifyStoresIcon();
        pm.homePage().verifyCustomerFeedbackIcon();
        pm.homePage().verifyBookingServicesIcon();
    }
    @Then("the user is able to view online shopping, transportation, lounge, hotels, bureau de change and baggage reclaim in the second slide")
    public void the_user_is_able_to_view_online_shopping_transportation_lounge_hotels_bureau_de_change_and_baggage_reclaim_in_the_second_slide() {
        pm.homePage().verifyOnlineShoppingIcon();
        pm.homePage().verifyTransportIcon();
        pm.homePage().verifyLoungeIcon();
        pm.homePage().verifyHotelsIcon();
        pm.homePage().verifyBureaudeChangeIcon();
        pm.homePage().verifyBaggageReclaimIcon();
    }
    @Then("the user is able to view clinic, transfer counter, airline ticketing center, baggage locker, and information center in the last slide")
    public void the_user_is_able_to_view_clinic_transfer_counter_airline_ticketing_center_baggage_locker_and_information_center_in_the_last_slide() {
        pm.homePage().verifyClinicIcon();
        pm.homePage().verifyTransferCounterIcon();
        pm.homePage().verifyAirlineTicketingCentreIcon();
        pm.homePage().verifyBaggageLockerIcon();
        pm.homePage().verifyInformationCentreIcon();
    }

    @Given("the user select the BKI-Kota Kinabalu from the dropdown")
    public void the_user_select_the_bki_kota_kinabalu_from_the_dropdown() {
        pm.homePage().clickOnDDTerminal();
        pm.homePage().selectBKI();
    }
    @Then("the user is able to view flights, dining, essentials & services, baggage locker, airline ticketing center and customer feedback in the first slide")
    public void the_user_is_able_to_view_flights_dining_essentials_services_baggage_locker_airline_ticketing_center_and_customer_feedback_in_the_first_slide() {
        pm.homePage().verifyFlightsIcon();
        pm.homePage().verifyDinningIcon();
        pm.homePage().verifyEssentialAndServicesIcon();
        pm.homePage().verifyBaggageLockerIcon();
        pm.homePage().verifyTicketingCentreIcon();
        pm.homePage().verifyCustomerFeedbackIcon();
    }
    @Then("the user is able to view transportation, lounge, clinic, stores, bureau de change and baggage reclaim in the second slide")
    public void the_user_is_able_to_view_transportation_lounge_clinic_stores_bureau_de_change_and_baggage_reclaim_in_the_second_slide() {
        pm.homePage().verifyTransportIcon();
        pm.homePage().verifyLoungeIcon();
        pm.homePage().verifyClinicIcon();
        pm.homePage().verifyStoresIcon();
        pm.homePage().verifyBureaudeChangeIcon();
        pm.homePage().verifyBaggageReclaimIcon();
    }

    @Given("the user select the KCH-Kuching from the dropdown")
    public void the_user_select_the_kch_kuching_from_the_dropdown() {
        pm.homePage().clickOnDDTerminal();
        pm.homePage().selectKCH();
    }
    @Then("the user is able to view flights, dining, essentials & services, transfer counter, customer feedback and stores in the first slide")
    public void the_user_is_able_to_view_flights_dining_essentials_services_transfer_counter_customer_feedback_and_stores_in_the_first_slide() {
        pm.homePage().verifyFlightsIcon();
        pm.homePage().verifyDinningIcon();
        pm.homePage().verifyEssentialAndServicesIcon();
        pm.homePage().verifyTransferCounterIcon();
        pm.homePage().verifyCustomerFeedbackIcon();
        pm.homePage().verifyStoresIcon();
    }
    @Then("the user is able to view essentials & services, transportation, lounge, stores, airline ticketing center and baggage reclaim in the second slide")
    public void the_user_is_able_to_view_essentials_services_transportation_lounge_stores_airline_ticketing_center_and_baggage_reclaim_in_the_second_slide() {
        pm.homePage().verifyEssentialAndServicesIcon();
        pm.homePage().verifyTransportIcon();
        pm.homePage().verifyLoungeIcon();
        pm.homePage().verifyStoresIcon();
        pm.homePage().verifyTicketingCentreIcon();
        pm.homePage().verifyBaggageReclaimIcon();
    }
    @Given("the user select the PEN-Penang from the dropdown")
    public void the_user_select_the_pen_penang_from_the_dropdown() {
        pm.homePage().clickOnDDTerminal();
        pm.homePage().selectPEN();
    }
    @Then("the user is able to view flights, dining, essentials & services, airline ticketing center, stores and customer feedback in the first slide")
    public void the_user_is_able_to_view_flights_dining_essentials_services_airline_ticketing_center_stores_and_customer_feedback_in_the_first_slide() {
        pm.homePage().verifyFlightsIcon();
        pm.homePage().verifyDinningIcon();
        pm.homePage().verifyEssentialAndServicesIcon();
        pm.homePage().verifyTicketingCentreIcon();
        pm.homePage().verifyStoresIcon();
        pm.homePage().verifyCustomerFeedbackIcon();
    }
    @Then("the user is able to view online transportation, lounge, clinic, bureau de change and baggage reclaim in the second slide")
    public void the_user_is_able_to_view_online_transportation_lounge_clinic_bureau_de_change_and_baggage_reclaim_in_the_second_slide() {
        pm.homePage().verifyTransportIcon();
        pm.homePage().verifyLoungeIcon();
        pm.homePage().verifyClinicIcon();
        pm.homePage().verifyBureaudeChangeIcon();
        pm.homePage().verifyBaggageReclaimIcon();
    }


    @Given("the user is able to view flights, dining, essentials & services, shuttle bus, carpark, and customer feedback in the first slide")
    public void the_user_is_able_to_view_flights_dining_essentials_services_shuttle_bus_carpark_and_customer_feedback_in_the_first_slide() {
        pm.homePage().verifyFlightsIcon();
        pm.homePage().verifyDinningIcon();
        pm.homePage().verifyEssentialAndServicesIcon();
        pm.homePage().verifyKULTerminal1ShuttleBusIcon();
        pm.homePage().verifyCarparkIcon();
        pm.homePage().verifyCustomerFeedbackIcon();
    }

    @When("the user clicks on the Next arrow button for the next slide")
    public void the_user_clicks_on_the_next_arrow_button_for_the_next_slide() {
        pm.homePage().clickOnForwardButton();
    }

    @Then("the user is able to view online shopping, transportation, lounge, booking services, hotels, and stores in the second slide")
    public void the_user_is_able_to_view_online_shopping_transportation_lounge_booking_services_hotels_and_stores_in_the_second_slide() {
        pm.homePage().verifyOnlineShoppingIcon();
        pm.homePage().verifyTransportIcon();
        pm.homePage().verifyLoungeIcon();
        pm.homePage().verifyStoresIcon();
        pm.homePage().verifyHotelsIcon();
        pm.homePage().verifyBookingServicesIcon();
    }

    @Then("the user is able to view clinic, transfer counter, airline ticketing center, baggage reclaim, baggage locker, and Bureau de Change in the last slide")
    public void the_user_is_able_to_view_clinic_transfer_counter_airline_ticketing_center_baggage_reclaim_baggage_locker_and_Bureau_de_Change_in_the_last_slide() {
        pm.homePage().verifyBureaudeChangeIcon();
        pm.homePage().verifyClinicIcon();
        pm.homePage().verifyTransferCounterIcon();
        pm.homePage().verifyAirlineTicketingCentreIcon();
        pm.homePage().verifyBaggageReclaimIcon();
        pm.homePage().verifyBaggageLockerIcon();

    }


    @Given("the user is on the Home Page")
    public void the_user_is_on_the_home_page() {
        pm.homePage().verifyHomePage();
    }

    @When("the user clicks on the Menu button from the Home Page")
    public void the_user_clicks_on_the_menu_button_from_the_home_page() {
        pm.homePage().clickOnMenuButton();
    }

    @Then("the user should see the Menu popup appear over the Home Page")
    public void the_user_should_see_the_menu_popup_appear_over_the_home_page() {
        pm.menuPopup().verifyMenuPopup();
    }

    @Then("the user selects the Flights feature from the menu")
    public void the_user_selects_the_flights_feature_from_the_menu() {
        pm.menuPopup().clickOnFlightsButton();
    }

    @Then("the user should land on the Flights Information Page")
    public void the_user_should_land_on_the_flights_information_page() {
        pm.flightsInformationPage().verifyFlightsInformationPage();
    }

    @Then("the user navigates between the Departure and Arrival toggle buttons")
    public void the_user_navigates_between_the_departure_and_arrival_toggle_buttons() {
        pm.flightsInformationPage().clickOnArrivalToggle();
        pm.flightsInformationPage().clickOnDepartureToggle();
    }

    @Then("verifies that flights are loading according to the toggle buttons")
    public void verifies_that_flights_are_loading_according_to_the_toggle_buttons() throws InterruptedException {
        try {
            pm.flightsInformationPage().selectFlightFromDeparture();
            pm.flightsInformationPage().departurePage().verifyDeparturePage();
            pm.flightsInformationPage().departurePage().clickOnBackButton();
            pm.flightsInformationPage().clickOnArrivalToggle();
            pm.flightsInformationPage().selectFlightFromArrival();
            pm.flightsInformationPage().arrivalPage().verifyArrivalPage();
            pm.flightsInformationPage().arrivalPage().clickOnBackButton();
        } catch (InterruptedException ignored) {

        }
    }

    @Then("the user clicks on the dropdown to change the Terminals")
    public void the_user_clicks_on_the_dropdown_to_change_the_terminals() {
        pm.flightsInformationPage().clickOnDropDownChooseAirport();
    }

    @Then("^verifies that (.*) and (.*) are displayed in the dropdown$")
    public void verifies_that_terminal_one_and_terminal_two_are_displayed_in_the_dropdown(String terminalOne, String terminalTwo) {
        pm.flightsInformationPage().chooseAirportPopup().verifyAirportNameFromList(terminalOne);
        pm.flightsInformationPage().chooseAirportPopup().verifyAirportNameFromList(terminalTwo);
    }

    @Then("the user selects one of the terminals from the dropdown")
    public void the_user_selects_one_of_the_terminals_from_the_dropdown() {
        pm.flightsInformationPage().chooseAirportPopup().selectAirportByText("KUL - KLIA Terminal 2");
    }

    @Then("verifies that flights are displaying according to the selected terminal")
    public void verifies_that_flights_are_displaying_according_to_the_selected_terminal() throws InterruptedException {
        try {
            pm.flightsInformationPage().selectFlightFromArrival();
            pm.flightsInformationPage().verifyArrivalTerminal();
            pm.flightsInformationPage().arrivalPage().clickOnBackButton();
            pm.flightsInformationPage().clickOnDepartureToggle();
            pm.flightsInformationPage().selectFlightFromDeparture();
            pm.flightsInformationPage().verifyDepartureTerminal();
            pm.flightsInformationPage().departurePage().clickOnBackButton();
        } catch (InterruptedException ignored) {

        }
    }

    @Then("the user searches for a flight based on the Flight Number")
    public void the_user_searches_for_a_flight_based_on_the_flight_number() throws InterruptedException {
        try {
            pm.flightsInformationPage().selectFlightFromDeparture();
            String flightNumber = pm.flightsInformationPage().departurePage().getFlightNumber();
            pm.flightsInformationPage().departurePage().clickOnBackButton();
            pm.flightsInformationPage().searchFlightByNumber(flightNumber);
            displayedFlightNumber = pm.flightsInformationPage().getDisplayedFlightNumber();
            pm.flightsInformationPage().clickOnDisplayedFlightNumber();
        } catch (InterruptedException ignored) {

        }
    }

    private String displayedFlightNumber;

    @Then("verifies that the flight is displayed according to the Flight Number")
    public void verifies_that_the_flight_is_displayed_according_to_the_flight_number() throws InterruptedException {
        try {
            pm.flightsInformationPage().selectFlightFromDeparture();
            String expFlightNumber = pm.flightsInformationPage().departurePage().getFlightNumber();
            Assert.assertEquals(displayedFlightNumber, expFlightNumber);
            pm.flightsInformationPage().departurePage().clickOnBackButton();
        } catch (InterruptedException ignored) {

        }
    }

    @Then("the user searches for flights based on the Airline name")
    public void the_user_searches_for_flights_based_on_the_airline_name() throws InterruptedException {
        try {
            pm.flightsInformationPage().selectFlightFromDeparture();
            String flightName = pm.flightsInformationPage().departurePage().getAirlineName();
            pm.flightsInformationPage().departurePage().clickOnBackButton();
            pm.flightsInformationPage().searchFlightByAirline(flightName);
            displayedAirlineName = pm.flightsInformationPage().getDisplayedAirlineName();
            pm.flightsInformationPage().clickOnDisplayedAirlineName();
        } catch (InterruptedException ignored) {

        }
    }

    private String displayedAirlineName;

    @Then("verifies that flights are displayed according to the Airline names")
    public void verifies_that_flights_are_displayed_according_to_the_airline_names() throws InterruptedException {
        try {
            pm.flightsInformationPage().selectFlightFromDeparture();
            String expAirlineName = pm.flightsInformationPage().departurePage().getAirlineName();
            Assert.assertEquals(displayedAirlineName, expAirlineName);
            pm.flightsInformationPage().departurePage().clickOnBackButton();
        } catch (InterruptedException ignored) {

        }
    }

    @Then("the user clicks on the back button from the Flights Information Page")
    public void the_user_clicks_on_the_back_button_from_the_flights_information_page() {
        try {
            pm.flightsInformationPage().clickOnBackButton();
        } catch (Exception ignored) {

        }
    }

    @Then("verifies that the user lands back on the Home Page")
    public void verifies_that_the_user_lands_back_on_the_home_page() {
        try {
            pm.homePage().verifyHomePage();
        } catch (Exception ignored) {

        }
    }

    @Then("all the buttons should be displayed in the Menu")
    public void all_the_buttons_should_be_displayed_in_the_menu() {
        pm.menuPopup().verifySpecialAssistanceButton();
        pm.menuPopup().verifyFlightsButton();
        pm.menuPopup().verifyPromotionsButton();
        pm.menuPopup().verifyOnlineShoppingButton();
        pm.menuPopup().verifyGeneralButton();
        pm.menuPopup().verifyKeyInfoButton();
        pm.menuPopup().verifyFeedbackButton();
        pm.menuPopup().verifySettingsButton();
        pm.menuPopup().verifyMyProfileButton();
    }

    @When("the user clicks on the SPECIAL ASSISTANCE feature in the Menu")
    public void the_user_clicks_on_the_special_assistance_feature_in_the_menu() {
        pm.menuPopup().clickOnSpecialAssistanceButton();
    }

    @Then("the user should be navigated to the SPECIAL ASSISTANCE Page")
    public void the_user_should_be_navigated_to_the_special_assistance_page() {
        pm.menuPopup().specialAssistancePage().verifySpecialAssistancePage();
    }

    @When("the user clicks on the Back button on the SPECIAL ASSISTANCE Page")
    public void the_user_clicks_on_the_back_button_on_the_special_assistance_page() {
        pm.menuPopup().specialAssistancePage().clickOnBackButton();
    }

    @Then("the user should be navigated back to the Home Page")
    public void the_user_should_be_navigated_back_to_the_home_page() {
        pm.homePage().verifyHomePage();
    }

    @When("the user clicks on the Menu button again")
    public void the_user_clicks_on_the_menu_button_again() {
        pm.homePage().clickOnMenuButton();
    }

    @And("the user selects the FLIGHTS feature in the Menu")
    public void the_user_selects_the_flights_feature_in_the_menu() {
        pm.menuPopup().clickOnFlightsButton();
    }

    @Then("the user should be navigated to the FLIGHTS Information Page")
    public void the_user_should_be_navigated_to_the_flights_information_page() {
        pm.menuPopup().flightPage().verifyFlightsInformationPage();
    }

    @When("the user clicks on the Back button on the FLIGHTS Information Page")
    public void the_user_clicks_on_the_back_button_on_the_flights_information_page() {
        pm.menuPopup().flightPage().clickOnBackButton();
    }

    @And("the user selects the PROMOTIONS feature in the Menu")
    public void the_user_selects_the_promotions_feature_in_the_menu() {
        pm.menuPopup().clickOnPromotionsButton();
    }

    @Then("the user should be navigated to the PROMOTIONS Page")
    public void the_user_should_be_navigated_to_the_promotions_page() {
        pm.menuPopup().promotionsPage().verifyPromotionsPage();
    }

    @When("the user clicks on the Back button on the PROMOTIONS Page")
    public void the_user_clicks_on_the_back_button_on_the_promotions_page() {
        pm.menuPopup().promotionsPage().clickOnBackButton();
    }

    @And("the user selects the GENERAL feature in the Menu")
    public void the_user_selects_the_general_feature_in_the_menu() {
        pm.menuPopup().clickOnGeneralButton();
    }

    @Then("the user should be navigated to the GENERAL Page")
    public void the_user_should_be_navigated_to_the_general_page() {
        pm.menuPopup().generalPage().verifyGeneralPage();
    }

    @When("the user clicks on the Back button on the GENERAL Page")
    public void the_user_clicks_on_the_back_button_on_the_general_page() {
        pm.menuPopup().generalPage().clickOnBackButton();
    }

    @And("the user selects the KEY INFO feature in the Menu")
    public void the_user_selects_the_key_info_feature_in_the_menu() {
        pm.menuPopup().clickOnKeyInfoButton();
    }

    @Then("the user should be navigated to the KEY INFO Page")
    public void the_user_should_be_navigated_to_the_key_info_page() {
        pm.menuPopup().keyInfoPage().verifyKeyInfoPage();
    }

    @When("the user clicks on the Back button on the KEY INFO Page")
    public void the_user_clicks_on_the_back_button_on_the_key_info_page() {
        pm.menuPopup().keyInfoPage().clickOnBackButton();
    }

    @And("the user selects the FEEDBACK feature in the Menu")
    public void the_user_selects_the_feedback_feature_in_the_menu() {
        pm.menuPopup().clickOnFeedbackButton();
    }

    @Then("the user should be navigated to the FEEDBACK Page")
    public void the_user_should_be_navigated_to_the_feedback_page() {
        pm.menuPopup().customerFeedbackPage().verifyCustomerFeedbackPage();
    }

    @When("the user clicks on the Back button on the FEEDBACK Page")
    public void the_user_clicks_on_the_back_button_on_the_feedback_page() {
        pm.menuPopup().customerFeedbackPage().clickOnCloseIcon();
    }
    @And("the user selects the SETTINGS feature in the Menu")
    public void the_user_selects_the_settings_feature_in_the_menu() {
        pm.menuPopup().clickOnSettingsButton();
    }

    @Then("the user should be navigated to the SETTINGS Page")
    public void the_user_should_be_navigated_to_the_settings_page() {
        pm.menuPopup().settingsPage().verifySettingsPage();
    }
    @When("the user clicks on the Back button on the SETTINGS Page")
    public void the_user_clicks_on_the_back_button_on_the_settings_page() {
        pm.menuPopup().settingsPage().clickOnBackIcon();
    }
    @And("the user selects the MY PROFILE feature in the Menu")
    public void the_user_selects_the_my_profile_feature_in_the_menu() {
        pm.menuPopup().clickOnMyProfileButton();
    }
    @Then("the user should be navigated to the MY PROFILE Page")
    public void the_user_should_be_navigated_to_the_my_profile_page() {
        pm.menuPopup().userProfilePage().verifyUserProfilePage();
    }
    @When("the user clicks on the Back button on the MY PROFILE Page")
    public void the_user_clicks_on_the_back_button_on_the_my_profile_page() {
        pm.menuPopup().userProfilePage().clickOnBackButton();
    }
    @Then("the user successfully navigates to the Home page page")
    public void the_user_successfully_navigates_to_the_home_page_page() {
        pm.homePage().verifyHomePage();
    }

    @When("the user clicks on the Exciting News on the home page")
    public void the_user_clicks_on_the_exciting_news_on_the_home_page() {
    pm.homePage().clickOnLinkExcitingNews();
    }
    @Then("verify the user navigates to the exciting news Page")
    public void verify_the_user_navigates_to_the_exciting_news_page() {
    pm.homePage().verifyExcitingNewsPage();
    }
    @Then("clicks on the back arrow icon in the exciting news Page")
    public void clicks_on_the_back_arrow_icon_in_the_exciting_news_page() {
    pm.homePage().clickBackInExcitingNews();
    }
    @When("the user clicks on the Global Search icon on the home page")
    public void the_user_clicks_on_the_global_search_icon_on_the_home_page() {
        pm.homePage().clickOnGlobalSearch();
    }
    @Then("verify the user navigates to the Global Search Page")
    public void verify_the_user_navigates_to_the_global_search_page() {
        pm.homePage().verifyGlobalPage();
    }
    @Then("the user is able to search with keys")
    public void the_user_is_able_to_search_with_keys() {
        pm.homePage().sendKeysOnSearchInGlobal();
    }
    @Then("the user can able to click on the results")
    public void the_user_can_able_to_click_on_the_results() {
       pm.homePage().clickOnATM1();
    }
    @Then("verifies that the user navigated to result page.")
    public void verifies_that_the_user_navigated_to_result_page() {
        pm.homePage().verifyATM();
    }
    @Then("the user click on back button in the result page")
    public void the_user_click_on_back_button_in_the_result_page() {
    pm.homePage().clickBackOnATMPage();
    }
    @Then("the user navigates to the global search page")
    public void the_user_navigates_to_the_global_search_page() {
    pm.homePage().verifyGlobalPage();
    }
    @Then("click on back button on the search page")
    public void click_on_back_button_on_the_search_page() {
    pm.homePage().clickBackInGlobal();
    }
}
