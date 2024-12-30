package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class PreLoginPageSteps {

    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@pre-login", order = 0)
    public void launchApplication() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After
    public void closeApplication() {
        BaseSteps.closeDriver();
    }

    @When("the user clicks on BAHASA MALAYSIA in the Prelogin Page")
    public void the_user_clicks_on_bahasa_malaysia_in_the_prelogin_page() throws InterruptedException {
    pm.preLoginPage().changeLanguageToMalay();
    }
    @Then("the user clicks on CHINESE in the Prelogin Page")
    public void the_user_clicks_on_chinese_in_the_prelogin_page() throws InterruptedException {
       pm.preLoginPage().changeLanguageToChina();
    }
    @Then("the user clicks on ENGLISH in the Prelogin Page")
    public void the_user_clicks_on_english_in_the_prelogin_page() throws InterruptedException {
    pm.preLoginPage().changeLanguageToEng();
    }
    @When("verifies that the app language changes in malasia language")
    public void verifies_that_the_app_language_changes_in_malasia_language() {
        //pm.preLoginPage().changeLanguageToMalay();
        pm.preLoginPage().verifyLangChangeToMalasia();
    }
    @Then("verifies that the app language changes in chinese language")
    public void verifies_that_the_app_language_changes_in_chinese_language() {
     // pm.preLoginPage().changeLanguageToChina();
      pm.preLoginPage().verifyLangChangeToChina();
    }
    @Then("verifies that the app language changes in english language")
    public void verifies_that_the_app_language_changes_in_english_language() throws InterruptedException {
//        pm.preLoginPage().changeLanguageToEng();
        pm.preLoginPage().verifyLangChangeToEnglish();
    }

    @When("the user clicks on select terminal dropdown and choose KCH-Kutching in the Prelogin Page")
    public void the_user_clicks_on_select_terminal_dropdown_and_choose_kch_kutching_in_the_prelogin_page() throws InterruptedException {
        Thread.sleep(2000);
        pm.preLoginPage().changeTerminalToKCH();
    }

    @Then("the user clicks on Submit button on the Prelogin Page")
    public void the_user_clicks_on_submit_button_on_the_prelogin_page() {
        pm.preLoginPage().clickOnSubmitButton();
    }

    @When("the user select the BKI-Kota Kinabalu from the dropdown in Prelogin Page")
    public void the_user_select_the_bki_kota_kinabalu_from_the_dropdown_in_prelogin_page() {
      pm.preLoginPage().changeTerminalToBKI();
    }
    @When("Verify terminal selected as BKI")
    public void verify_terminal_selected_as_bki() {
    pm.preLoginPage().verifyTerminalBKI();
    }
    @Then("the user select the KCH-Kuching from the dropdown in Prelogin Page")
    public void the_user_select_the_kch_kuching_from_the_dropdown_in_prelogin_page() {
        pm.preLoginPage().changeTerminalToKCH();
    }
    @Then("Verify terminal selected as KCH")
    public void verify_terminal_selected_as_kch() {
        pm.preLoginPage().verifyTerminalKCH();
    }
    @Then("the user select the PEN-Penang from the dropdown in Prelogin Page")
    public void the_user_select_the_pen_penang_from_the_dropdown_in_prelogin_page() {
        pm.preLoginPage().changeTerminalToPEN();
    }
    @Then("Verify terminal selected as PEN")
    public void verify_terminal_selected_as_pen() {
        pm.preLoginPage().verifyTerminalPEN();
    }
    @Then("the user select the Terminal2 from the dropdown in Prelogin Page")
    public void the_user_select_the_terminal2_from_the_dropdown_in_prelogin_page() {
        pm.preLoginPage().changeTerminalToTwo();
    }
    @Then("Verify terminal selected as Terminal2")
    public void verify_terminal_selected_as_terminal2() {
        pm.preLoginPage().verifyTerminalTwo();
    }
    @Then("the user select the Terminal1 from the dropdown in Prelogin Page")
    public void the_user_select_the_terminal1_from_the_dropdown_in_prelogin_page() {
        pm.preLoginPage().changeTerminalToOne();
    }
    @Then("Verify terminal selected as Terminal1")
    public void verify_terminal_selected_as_terminal1() {
        pm.preLoginPage().verifyTerminalOne();
    }
    @Then("clicks on the Submit button in Prelogin Page")
    public void clicks_on_the_submit_button_in_prelogin_page() {
        pm.preLoginPage().clickOnSubmitButton();
    }


}
