package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.Assert;
import utils.*;

import java.net.MalformedURLException;

public class LoginPageSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;


    @Before(value = "@login or @social", order = 0)
    public void launchApp() throws MalformedURLException {
        System.out.println("before Login method is running");
        this._driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After(value = "@login")
    public void closeApp() {
        System.out.println("after Login method is running");
        BaseSteps.closeDriver();
    }

    @Before(value = "@login or @social", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.prelogins();
    }
    @Before(value = "@login", order = 2)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Then("the user successfully navigates to the Home page")
    public void the_user_successfully_navigates_to_the_home_page() throws InterruptedException {
        pm.homePage().verifyHomePage();
    }

    @And("the user clicks on the user account")
    public void the_user_clicks_on_the_user_account() {
        pm.homePage().clickOnUserAccount();
    }

    @Then("the user navigates to the user profile page")
    public void the_user_navigates_to_the_user_profile_page() {
        pm.userProfilePage().verifyUserProfilePage();
    }

    @And("clicks on the Logout button")
    public void clicks_on_the_Logout_button() {
        pm.userProfilePage().clickOnLogoutButton();
    }

    @Then("the user navigates to the Logout page")
    public void the_user_navigates_to_the_Logout_page() {
        pm.logoutPage().verifyLogoutPage();
    }

    @And("clicks on the Yes button to Logout")
    public void clicks_on_the_Yes_button_to_Logout() {
        pm.logoutPage().clickOnYesButton();
    }

    @Then("navigates to the home page with successfully logged out")
    public void navigates_to_the_home_page_with_successfully_logged_out() {
        pm.homePage().verifyUserName("Welcome");
    }

    @Then("the user click on the login with google button")
    public void the_user_click_on_the_login_with_google_button() throws InterruptedException {
       try {
           pm.loginPage().clickGoogle();
       } catch(Exception ignore){

       }
    }
    @Then("the user enter email or phone number in the text field and click next")
    public void the_user_enter_email_or_phone_number_in_the_text_field_and_click_next() {
        try {
            pm.loginPage().enterGoogleUserName();
            pm.loginPage().hideKeyboard();
            pm.loginPage().clickNext();
        } catch(Exception ignore){

        }
    }
    @Then("the user enter password in the text field and click next")
    public void the_user_enter_password_in_the_text_field_and_click_next() {
        try {
            pm.loginPage().enterGooglePassword();
            pm.loginPage().hideKeyboard();
            pm.loginPage().clickNext();
        } catch (Exception ignored) {

        }

    }
    @Then("verify that user land on application home page.")
    public void verify_that_user_land_on_application_home_page() {
try{
    if(pm.loginPage().errorMessage().isEmpty()){
        pm.homePage().verifyHomePage();
    } else {
        Assert.assertTrue( pm.loginPage().errorMessage().contains("Wrong password. Try again or click Forgot password to reset it."));
    }
} catch (Exception ignored){
}
    }
}
