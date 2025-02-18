package pages.pageLocators;

import org.openqa.selenium.By;

public interface SpecialAssistancePageLoc {
    //By btnSpecialOnHome = By.xpath("//*[contains(@text,'Special')]/preceding-sibling::*[1]");
    By lblHeading = By.xpath("//*[@text='SPECIAL ASSISTANCE ']");
    //By btnBack = By.xpath("//*[@text='SPECIAL ASSISTANCE ']/preceding-sibling::*[3]/*");
    By btnBack = By.xpath("//*[@text='SPECIAL ASSISTANCE ']/preceding-sibling::*[1]");
    By btnTravellingWithChildren = By.xpath("//*[contains(@text,'Travelling')]");
    By btnAssistance = By.xpath("//*[contains(@text,'Assistance for a person')]");
    By btnOthers = By.xpath("//*[@text='Others']");
    By btnChildBabyCare=By.xpath("//*[@text='Baby Care Room']");
    By btnChildMinorService = By.xpath("//*[@text='Unaccompanied Minor Service']");
    By lblChildHeading = By.xpath("//*[@text='Travelling with children']");
    By btnChildBack = By.xpath("//*[@text='Travelling with children']/preceding-sibling::*[1]");
    By ddChildTerminals = By.xpath("//*[@text='Travelling with children']/following-sibling::*[1]");
    By ddChildT1 = By.xpath("//*[@text='KUL - Terminal 1']");
    By ddChildT2 = By.xpath("//*[@text='KUL - Terminal 2']");
    By ddChildTKin = By.xpath("//*[@text='BKI - Kota Kinabalu']");
    By ddChildTKuc = By.xpath("//*[@text='KCH - Kuching']");
    By ddChildTPen = By.xpath("//*[@text='PEN - Penang']");
    By txtChildSeeMore1 = By.xpath("(//*[@text='See more'])[1]");
    By txtChildSeeMore2 = By.xpath("(//*[@text='See more'])[2]");
    By lblAssistanceHeading = By.xpath("//*[@text='Assistance for a person with reduced mobility and hidden disabilities']");
    By btnBackAssistance = By.xpath("//*[@text='Assistance for a person with reduced mobility and hidden disabilities']/preceding-sibling::*[1]");
    By btnAssHiddenDisable = By.xpath("//*[@text='Hidden Disabilities']");
    By lblOtherHeading = By.xpath("//*[@text='Others']");
    By btnBackOthers = By.xpath("//*[@text='Others']/preceding-sibling::*[1]");
    By btnOthersMedical = By.xpath("//*[@text='Medical Services']");
    By btnOthersAirline = By.xpath("//*[@text='Airlines Assistance']");





}
