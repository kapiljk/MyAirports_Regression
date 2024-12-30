package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.pageLocators.EssentialServicesPageLoc;
import utils.MobileUtils;

public class EssentialServicePage extends MobileUtils implements EssentialServicesPageLoc {
    private AndroidDriver _driver;

    public EssentialServicePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public void verifyEssentialServicesPage() {
        try {
            Thread.sleep(3000);
            isElementVisible(lblHeading, "Stores page");
        } catch (InterruptedException ignored) {
        }
    }
    public void clickOnBackIcon() {
        waitForElementPresence(allServices,"Allservices");
        click(btnBack, "Back button in Stores");
    }
    public void verifyBackIcon() {
        isElementVisible(btnBack, "Back Icon");
    }
    public void clickOnAnyOneOfStore(){
        waitForElementPresence(allServices,"All services");
        click(link1stService,"First Service in the list");
    }
    public void waitForAllServiceVisible() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allServices);
        } catch (Exception e) {

        }
    }
    public String getTextFromAnyOneOfService() {
        waitForElementPresence(allServices,"All Services");
        return getElements(allServices).stream().findFirst().get().getText();
    }
    public void clickOnTerminalDropDown() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allServices);
            click(ddTerminal, "Drop Down");
        } catch (Exception e) {

        }
    }
    public void clickOnTerminal1(){
        waitForElementPresence(allServices,"All Services");
        click(ddTermina1,"Terminal 1");
    }
    public void clickOnTerminal2(){click(ddTermina2,"Terminal 2");}
    public void clickOnTerminalKCH(){click(ddKCH,"KCH");}
    public void clickOnTerminalBKI(){click(ddBKI,"BKI");}
    public void clickOnTerminalPEN(){click(ddPEN,"PEN");}
    public void verifyServicePageTitle(String actualTxt){
        waitForElementPresence(serviceTitle,"Title in service page");
        String text = _driver.findElement(serviceTitle).getText();
        Assert.assertTrue(text.contains(actualTxt),"Change language Label displayed in English Language");
    }
    public void clickOnBackIconService() {
       waitForElementPresence(btnBackService,"Back Icon in Service page");
        click(btnBackService, "Back Icon in Service page");
    }
    public void verifyOnBackIconService(){isElementVisible(btnBackService,"Back Icon in Service page");}
    public void verifyTakeMeThereLbl() {
        isElementVisible(lblTakeMeThere, "Take Me There Label");
    }

    public void verifyRatingReviewLbl() {
        isElementVisible(lblRatingReview, "RATING REVIEW Label");
    }
    public void clickOnFavourite(){click(btnFavouriteService,"Favourite button");}

}
