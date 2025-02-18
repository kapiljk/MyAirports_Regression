package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.PreLoginPageLoc;
import utils.MobileUtils;

public class PreLoginPage extends MobileUtils implements PreLoginPageLoc {

    private final AndroidDriver _driver;

    public PreLoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPreLoginPage(){
        isElementVisible(lblPreLogin,"Pre Login Page");
    }

    public void changeLanguageToEng() {
        System.out.println("English clicking in Pre Login Page");
        click(ddLanguage, "Language Dropdown");
        click(btnEnglish, "Selecting English");
    }

    public void changeLanguageToMalay() {
        waitForElementPresence(ddLanguage,"Language Dropdown");
        click(ddLanguage, "Language Dropdown");
        click(btnMalaysia, "Selecting Malayasia");
    }

    public void changeLanguageToChina(){
        waitForElementPresence(ddLanguage,"Language Dropdown");
        click(ddLanguage, "Language Dropdown");
        click(btnChina, "Selecting China");
    }

    public void changeTerminalToKCH() {
        System.out.println("Selecting KCH Terminal in Pre Login Page");
        click(ddAirport, "Termainal Dropdown");
        waitForElementPresence(ddSelAirKCH, "KCH Terminal");
        click(ddSelAirKCH, "KCH Terminal");
    }
    public void verifyTerminalKCH(){
        waitForElementPresence(lblPreLogin,"Prelogin Page loaded");
       try{
        String text = getText(ddSelAirKCH);
        Assert.assertTrue(text.contains("KCH - Kuching"));}
       catch (Exception ignored){

       }
    }

    public void changeTerminalToBKI() {
        System.out.println("Selecting KCH Terminal in Pre Login Page");
        click(ddAirport, "Termainal Dropdown");
        waitForElementPresence(ddSelAirBKI, "BKI Terminal");
        click(ddSelAirBKI, "BKI Terminal");
    }
    public void verifyTerminalBKI(){
        waitForElementPresence(lblPreLogin,"Prelogin Page loaded");
        try{
        String text = getText(ddSelAirBKI);
        Assert.assertTrue(text.contains("BKI - Kota Kinabalu"));}
        catch (Exception ignored){

        }
    }

    public void changeTerminalToPEN() {
        System.out.println("Selecting KCH Terminal in Pre Login Page");
        click(ddAirport, "Termainal Dropdown");
        waitForElementPresence(ddSelAirPEN, "PEN Terminal");
        click(ddSelAirPEN, "PEN Terminal");
    }
    public void verifyTerminalPEN(){
        waitForElementPresence(lblPreLogin,"Prelogin Page loaded");
        try{
        String text = getText(ddSelAirPEN);
        Assert.assertTrue(text.contains("PEN - Penang"));}
        catch (Exception ignored){

        }
    }


    public void changeTerminalToOne(){
        waitForElementPresence(ddAirport,"Airport Dropdown");
        click(ddAirport,"Terminal Dropdown");
        waitForElementPresence(ddSelAir1,"Terminal One");
        click(ddSelAir1,"Terminal One");
    }
    public void verifyTerminalOne(){
        waitForElementPresence(lblPreLogin,"Prelogin Page loaded");
        try{
        String text = getText(ddSelAir1);
        Assert.assertTrue(text.contains("KUL - Terminal 1"));}
        catch (Exception ignored){

        }
    }
    public void changeTerminalToTwo(){
        waitForElementPresence(ddAirport,"Airport Dropdown");
        click(ddAirport,"Terminal Dropdown");
        waitForElementPresence(ddSelAir2,"Terminal One");
        click(ddSelAir2,"Terminal One");
    }
    public void verifyTerminalTwo(){
        waitForElementPresence(lblPreLogin,"Prelogin Page loaded");
        try{
        String text = getText(ddSelAir2);
        Assert.assertTrue(text.contains("KUL - Terminal 2"));}
        catch (Exception ignored){

        }
    }

    public void verifyLangChangeToEnglish() {
        System.out.println("Verifying English language");
        String text = _driver.findElement(btnSubmit).getText();
        Assert.assertTrue(text.contains("LOGIN / SIGN UP   | "), "Submit button in English Language in pre login page");
    }

    public void verifyLangChangeToMalasia() {
        System.out.println("Verifying Malaysia language");
        String text = _driver.findElement(btnSubmitMalayLang).getText();
        Assert.assertTrue(text.contains("LOG MASUK / DAFTAR |"), "Submit button in Malasia Language in pre login page");

    }

    public void verifyLangChangeToChina() {
        System.out.println("Verifying Chinese language");
        String text = _driver.findElement(btnSubmitChinaLang).getText();
        Assert.assertTrue(text.contains("登录 / 注册 |"), "Submit button in Chines Language in pre login page");
    }

    public void clickOnSubmitButton() {
        System.out.println("Clicking on submit button in Pre Login page");
        click(btnSubmit, "Submit button");
    }
    public void verifyReadMore(){
        isElementVisible(lnkReadMore,"Read more link visible");
    }
    public void clickOnReadMore(){
        click(lnkReadMore,"Clicking on ReadMore link");
    }
    public void verifyNewsPage(){
        isElementVisible(btnBackNews,"Backbutton visible in news page");
    }
    public void clickOnBackInNews(){
        click(btnBackNews,"Clicking on Back button in News Page");
    }
}
