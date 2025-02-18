package pages.pageLocators;

import org.openqa.selenium.By;

public interface HomePageLoc {

    By btnSpecialOnHome = By.xpath("//*[contains(@text,'Special')]/preceding-sibling::*[1]");
    By imgHome = By.xpath("//*[contains(@text,'Special')]/../preceding-sibling::*/*");
    By btnSpecialAssistance = By.xpath("//*[contains(@text,'Special')]");
    By lblUser = By.xpath("//*[contains(@text,'Special')]/../following-sibling::*/*[3]");
    By lblLocation = By.xpath("//*[contains(@text,'Special')]/../../following-sibling::*[1]/*[1]/*[1]");
    By ddTerminals = By.xpath("//*[contains(@class,'HorizontalScrollView')][1]/preceding-sibling::*[1]/*[1]");
    By ddTerminal1 = By.xpath("//*[@text='KUL - Terminal 1']");
    By ddTerminal2 = By.xpath("//*[@text='KUL - Terminal 2']");
    By ddBKI = By.xpath("//*[@text='BKI - Kota Kinabalu']");
    By ddKCH = By.xpath("//*[@text='KCH - Kuching']");
    By ddPEN = By.xpath("//*[@text='PEN - Penang']");
    default By getTabs(String txt) {
        return By.xpath(String.format("//*[@text='%s']/..", txt));
    }

    By txtSearch = By.xpath("//*[contains(@text,'Search')]");//not valid

    By btnForward = By.xpath("//*[contains(@class,'HorizontalScrollView')][1]/following-sibling::*[1]/*");
    By btnBackward = By.xpath("//*[contains(@class,'HorizontalScrollView')][1]/preceding-sibling::*[1]/*");//not valid
    By btnUserAccount = By.xpath("//*[contains(@text,'Special')]/../following-sibling::*/*[1]");
    By btnChatBoat = By.xpath("//*[@text='HOME']/../../preceding-sibling::*/*/*/*/*/*/*/*/*/*/*/*/*[2]/*");
    By btnCards = By.xpath("(//*[contains(@class,'HorizontalScrollView')][2]//*[contains(@class,'ImageView')])[1]");
    By btnMenu = By.xpath("//*[@text='KEY INFO']/../following-sibling::*[1]/*/*[2]");
    By btnHome = By.xpath("//*[@text='HOME']");
    By btnKeyInfo = By.xpath("//*[@text='KEY INFO']");
    By btnEzpaz = By.xpath("//*[@text='EZPaz']");
    By btnMaps = By.xpath("//*[@text='MAPS']");
    By btnCloseMenu = By.xpath("//*[@text='KEY INFO']/../following-sibling::*[1]/*/*[2]");
    By btnOk = By.xpath("//*[@text='OK']");
    By lnkExciting = By.xpath("//*[@text='Exciting News!                ']");
    By bckInExciting = By.xpath("(//*[contains(@text,'1 May 2024')])[1]/preceding-sibling::*[1]");
    By searchGlobal = By.xpath("//*[contains(@class,'HorizontalScrollView')][1]/preceding-sibling::*[2]/*");
    By lblGlobal = By.xpath("//*[@text='SEARCH']");
    By backInGlobalSearch = By.xpath("//*[@text='SEARCH']/preceding-sibling::*[1]/*");
    By searchInGlobal = By.xpath("//*[@text='Search for Flights, Shops, Dining etc']");
    By crossInGlobal = By.xpath("(//*[@text='ATM']/following-sibling::*[1])[1]");
    By resultATM = By.xpath("(//*[@text='ATM']/following-sibling::*[1])[2]");
    By lblATM = By.xpath("//*[@text='ATM']");
    By backInATMPage = By.xpath("//*[@text='ATM']/preceding-sibling::*[1]");





}
