package pages.popupLocators;

import org.openqa.selenium.By;

public interface YouAreNowTrackingPopupLoc {
    By lblHeading = By.xpath("//*[contains(@text,'You are now tracking')]");
    By txtEmail = By.xpath("//*[contains(@text,'Enter email of your friends and family ...')]");
    By chckbxTerms = By.xpath("//*[contains(@text,'Enter email of your friends and family ...')]/following-sibling::*[1]");
    By btnSkip = By.xpath("//*[@text='SKIP']");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
}
