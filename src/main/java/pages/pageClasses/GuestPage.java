package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.GuestLoc;
import pages.pageLocators.HomePageLoc;
import pages.pageLocators.PreLoginPageLoc;
import pages.pageLocators.SpecialAssistancePageLoc;
import pages.pagePopups.LocationPopup;
import utils.MobileUtils;

import static pages.pageLocators.HomePageLoc.btnSpecialOnHome;

public class GuestPage  extends MobileUtils implements GuestLoc, PreLoginPageLoc, HomePageLoc, SpecialAssistancePageLoc {

    private final AndroidDriver _driver;

    public GuestPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPreloginPage(){
    isElementVisible(lblPreLogin,"Prelogin page opened");
    }
    public void clickOnGuestButton(){
        click(btnGuest,"Guest button");

    }

    public void verifyHome(){
        isElementVisible(imgHome,"Home Page visible");
    }
    public void clickSpecialAssistance(){
        click(btnSpecialOnHome,"Special Assistance");
    }
    public void verifySpecialAssistance(){
        isElementVisible(lblHeading,"Special Assiatnce page");
    }
    public void clickBackSpecialAssistance(){
        click(btnBack,"Click Back button on Special Assiatnce page");
    }

    public LocationPopup locationPopup() {
        return new LocationPopup(_driver);
    }
    public void clickSkip(){
        click(btnSkip,"Skip button");
    }
}
