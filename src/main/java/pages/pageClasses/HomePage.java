package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.GuestLoc;
import pages.pageLocators.HomePageLoc;
import utils.MobileUtils;

public class HomePage extends MobileUtils implements HomePageLoc {
    private final AndroidDriver _driver;

    public HomePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyHomePage() {
        waitForElementPresence(btnCards,"Plan my journey card");
        boolean displayed = _driver.findElement(imgHome).isDisplayed();
        Assert.assertTrue(displayed, "Home Page is not displayed");
    }

    public void verifyUser() {
        isElementVisible(lblUser, "User");
    }

    public void verifyUserName(String text) {
        String userName = getText(lblUser);
        Assert.assertEquals(userName, text);
    }

    public void clickOnFlightsIcon() {
        waitForElementPresence(btnCards,"plan my journey");
        click(getTabs("Flights"), "Flights Icon");
    }

    public void verifyFlightsIcon() {
        isElementVisible(getTabs("Flights"), "Flights Menu Icon");
    }

    public void clickOnDiningIcon() {
        click(getTabs("Dining"), "Dining Icon");
    }

    public void verifyDinningIcon() {
        isElementVisible(getTabs("Dining"), "Dining Menu Icon");
    }

    public void clickOnEssentialAndServicesIcon() {
        waitForElementPresence(btnCards,"Plan My Journey card");
        click(getTabs("Essential & Services"), "Essential & Services Icon");
    }

    public void verifyEssentialAndServicesIcon() {
        isElementVisible(getTabs("Essential & Services"), "Flights Icon");
    }

    public void clickOnKULTerminal1ShuttleBusIcon() {
        click(getTabs("KUL Terminal 1 Shuttle Bus"), "KUL Terminal 1 Shuttle Bus Icon");
    }

    public void verifyKULTerminal1ShuttleBusIcon() {
        isElementVisible(getTabs("KUL Terminal 1 Shuttle Bus"), "KUL Terminal 1 Shuttle Bus Icon");
    }
    public void clickOnCarParking(){
        click(getTabs("Car Park"), "Car Parking Icon");
    }
    public void verifyCarparkIcon() {
        isElementVisible(getTabs("Car Park"), "Car Parking Icon");
    }

    public void clickOnCustomerFeedbackIcon() {
        click(getTabs("Customer Feedback"), "Customer Feedback Icon");
    }

    public void verifyCustomerFeedbackIcon() {
        isElementVisible(getTabs("Customer Feedback"), "Customer Feedback Icon");
    }


    public void clickOnStoresIcon() {
        waitForElementPresence(btnCards,"Plan my journey");
        click(getTabs("Stores"), "Stores Icon");
    }

    public void verifyStoresIcon() {
        isElementVisible(getTabs("Stores"), "Stores Icon");
    }





    public void clickOnForwardButton() {
        waitForElementPresence(btnForward, "Forward Icon");
        click(btnForward, "Forward Icon");
    }

    public void clickOnOnlineShoppingIcon() {
        click(getTabs("Online Shopping"), "Online Shopping Icon");
    }

    public void verifyOnlineShoppingIcon() {
        isElementVisible(getTabs("Online Shopping"), "Online Shopping Icon");
    }

    public void clickOnTransportIcon() {
        click(getTabs("Transport"), "Transport Icon");
    }

    public void verifyTransportIcon() {
        isElementVisible(getTabs("Transport"), "Transport Icon");
    }

    public void clickOnLoungeIcon() {
        click(getTabs("Lounge"), "Lounge Icon");
    }

    public void verifyLoungeIcon() {
        isElementVisible(getTabs("Lounge"), "Lounge Icon");
    }

    public void clickOnBookingServicesIcon() {
        click(getTabs("Booking Services"), "Booking Services Icon");
    }

    public void verifyBookingServicesIcon() {
        isElementVisible(getTabs("Booking Services"), "Booking Services Icon");
    }

    public void clickOnHotelsIcon() {
        click(getTabs("Hotels"), "Hotels Icon");
    }

    public void verifyHotelsIcon() {
        isElementVisible(getTabs("Hotels"), "Hotels Icon");
    }

    public void clickOnBureaudeChangeIcon() {
        click(getTabs("Bureau de Change"), "Bureau de Change Icon");
    }

    public void verifyBureaudeChangeIcon() {
        isElementVisible(getTabs("Bureau de Change"), "Bureau de Change Icon");
    }

    public void clickOnBackwardIcon() {
        click(btnBackward, "Backward Icon");
    }

    public void clickOnClinicIcon() {
        click(getTabs("Clinic"), "Clinic Icon");
    }

    public void verifyClinicIcon() {
        isElementVisible(getTabs("Clinic"), "Clinic Icon");
    }

    public void clickOnTransferCounterIcon() {
        click(getTabs("Transfer Counter"), "Transfer Counter Icon");
    }

    public void verifyTransferCounterIcon() {
        isElementVisible(getTabs("Transfer Counter"), "Transfer Counter Icon");
    }

    public void clickOnAirlineTicketingCentreIcon() {
        click(getTabs("Ticketing Centre"), "Airline Ticketing Centre Icon");
    }
    public void verifyAirlineTicketingCentreIcon() {
        isElementVisible(getTabs("Airline Ticketing Centre"), "Airline Ticketing Centre Icon");
    }
    public void verifyTicketingCentreIcon() {
        isElementVisible(getTabs("Ticketing Centre"), "Airline Ticketing Centre Icon");
    }

    public void clickOnBaggageReclaimIcon() {
        click(getTabs("Baggage Reclaim"), "Baggage Reclaim Icon");
    }

    public void verifyBaggageReclaimIcon() {
        isElementVisible(getTabs("Baggage Reclaim"), "Baggage Reclaim Icon");
    }

    public void clickOnBaggageLockerIcon() {
        click(getTabs("Baggage Locker"), "Baggage Locker button");
    }

    public void verifyBaggageLockerIcon() {
        isElementVisible(getTabs("Baggage Locker"), "Baggage Locker Icon");
    }

    public void clickOnInformationCentreIcon() {
        click(getTabs("Information Centre"), "Information Centre button");
    }

    public void verifyInformationCentreIcon() {
        isElementVisible(getTabs("Information Centre"), "Information Centre Icon");
    }

    public void moveLeft() {
        scrollLeft(500);
    }

    public void clickOnUserAccount() {

        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnUserAccount, "User Account");
    }

    public void clickOnChatBot() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnChatBoat, "Chat Bot image");
    }

    public void verifyChatBot() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        isElementVisible(btnChatBoat, "Chat Bot image");
    }

    public void clickOnButterflyCarouselCard() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        try {
            this.verifyUser();
//            Thread.sleep(10000);
            for (int i = 0; i < 4; i++)
                scrollLeft(500);
            click(btnCards, "Butterfly Carousel Card");
        } catch (Exception ignored) {

        }
    }

    public void clickOnPlanMyJourneyCarouselCard() {

        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        scrollUp();
        scrollLeft(500);
        scrollLeft(500);
        click(btnCards, "Plan My Journey Carousel Card");
         click(btnOk,"Popup After clicked on PlanMyJourney");
       // new CommonFunctions(_driver).clickOnOkButton();

    }

    public void clickOnFlightsCarouselCard() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        try {
            Thread.sleep(5000);
            scrollLeft(500);
            click(btnCards, "Flights Carousel Card");
        } catch (Exception ignored) {

        }
    }

    public void clickOnPromotionsCarouselCard() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        scrollUp();
        scrollLeft(500);
        scrollLeft(500);
        scrollLeft(500);
        scrollLeft(500);
        click(btnCards, "Promotions Card");
    }


    public void verifyHomeButton() {

        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        isElementVisible(btnHome, "Home button");
    }

    public void verifyKeyInfoButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        isElementVisible(btnKeyInfo, "Key Info button");
    }

    public void verifyEzpazButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        isElementVisible(btnEzpaz, "EZpaz button");
    }

    public void verifyMapsButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        isElementVisible(btnMaps, "Maps button");
    }

    public void verifyMenuButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        isElementVisible(btnMenu, "Menu button");
    }

    public void clickOnHomeButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnHome, "Home button");
    }

    public void clickOnKeyInfoButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnKeyInfo, "Key Info button");
    }

    public void clickOnEzpazButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnEzpaz, "EZpaz button");
    }

    public void clickOnMapsButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnMaps, "Maps button");
    }

    public void clickOnMenuButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnMenu, "Menu button");
    }

    public void clickOnCloseMenuButton() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnCloseMenu, "Close Menu button");
    }

    public StoresPage storesPage() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        return new StoresPage(_driver);
    }

    public DinningPage dinningPage() {
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        return new DinningPage(_driver);
    }

    public BookingServicePage bookingServicePage() {
        return new BookingServicePage(_driver);
    }

    public void verifyLocation() {}

        public void clickOnDDTerminal(){
            waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(ddTerminals,"Terminal dropdown in homepage");}

    public void selectTerminal1(){
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(ddTerminal1,"Choose Terminal1");}
        public void selectTerminal2(){
            waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(ddTerminal2,"Choose Terminal2");}
        public void selectBKI(){
            waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(ddBKI,"Choose Kota Kinabalu");}
        public void selectKCH(){
            waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(ddKCH,"Choose Kuching");}
        public void selectPEN(){
            waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(ddPEN,"Choose Penang");}

    public void clickOnSpecialAssistance(){
        waitForElementPresence(btnCards,"PlanMyJourney in Home page");
        click(btnSpecialOnHome,"Special Assistance button on Home");
    }

public void clickOnGlobalSearch(){
    waitForElementPresence(btnCards,"PlanMyJourney in Home page");
    click(searchGlobal,"Global Search on Home Page");
}
public void clickBackInGlobal(){
        click(backInGlobalSearch,"Clicked on Back button in Global Page");
}
public void verifyGlobalPage(){
        isElementVisible(lblGlobal,"Global Page visible");
}
public void sendKeysOnSearchInGlobal(){
        enterText(searchInGlobal,"ATM","Enter Text as ATM");
}
public void clickOnCross(){
        click(crossInGlobal,"Cross button in Search Field");
}
public void clickOnATM1(){
        click(resultATM,"1st ATM Option");
}
public void verifyATM(){
        isElementVisible(lblATM,"ATM Search Result Page");
}
public void clickBackOnATMPage(){
        click(backInATMPage,"Back button in ATM Page");
}

public void clickOnLinkExcitingNews(){
    waitForElementPresence(btnCards,"PlanMyJourney in Home page");
    click(lnkExciting,"Exciting news link");
}
public void verifyExcitingNewsPage(){
        isElementVisible(bckInExciting,"Back button in Exciting news page");
}
public void clickBackInExcitingNews(){
        click(bckInExciting,"Back button in Exciting news page");
}

}
