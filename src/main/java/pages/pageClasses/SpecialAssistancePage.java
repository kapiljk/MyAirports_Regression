package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.SpecialAssistancePageLoc;
import utils.MobileUtils;

public class SpecialAssistancePage extends MobileUtils implements SpecialAssistancePageLoc {
    private AndroidDriver _driver;

    public SpecialAssistancePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySpecialAssistancePage() {
        try {
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Arrival Page");
        }catch (InterruptedException ignored){

        }
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void clickOnTravellingWithChildrenButton() {
        click(btnTravellingWithChildren, "Travelling With Children button");
    }

    public void clickOnAssistanceButton() {
        click(btnAssistance, "Assistance for a person with reduced mobility and hidden disabilities button");
    }
    public void verifyAssistanceForAPerson(){
        isElementVisible(lblAssistanceHeading,"Element visible");
    }
    public void clickOnHiddenDisability(){
        click(btnAssHiddenDisable,"Hidden Disability");
    }

    public void clickOnOtherButton() {
        click(btnOthers, "Others button");
    }
    public void verifyOthersPage(){
        isElementVisible(lblOtherHeading,"Verify Other page heading");
    }
    public void clickOnMedical(){
        click(btnOthersMedical,"Medical Service");
    }
    public void clickAirlineService(){
        click(btnOthersAirline,"Airline Service");
    }
    public void clickBackInOtherPage(){
        click(btnBackOthers,"clicks on Other page back button");

    }
    public void clickOnBackInChild(){
        click(btnChildBack,"Back button in child page");
    }
public void verifytravelWithChild() {
    String text = getText(lblChildHeading);
    try {
        Assert.assertTrue(text.contains("Travelling with children"), "Verifying the travel with child page");
    } catch (Exception ignored) {

    }
}
        public void clickOnbabyCareroom(){
            click(btnChildBabyCare,"Baby care room expand");
    }
        public void verifyBabyCareRoom() {
            String text = getText(txtChildSeeMore1);
            try {
                Assert.assertTrue(text.contains("See more"), "Verifying see more in babycareroom");
            } catch (Exception ignored) {

            }
        }
            public void clickOnMinorService(){
                click(btnChildMinorService,"Unaccompanied Minor Service");
            }
            public void verifyMinorService(){
                String text = getText(txtChildSeeMore2);
                try {
                    Assert.assertTrue(text.contains("See more"), "Verifying see more in minor service");
                } catch (Exception ignored) {

                }
            }
            public void clickBackinAssiatnce(){
        click(btnBackAssistance,"Back button in assistance for a person");
            }

    }



