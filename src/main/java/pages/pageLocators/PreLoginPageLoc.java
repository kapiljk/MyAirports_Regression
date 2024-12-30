package pages.pageLocators;

import org.openqa.selenium.By;

public interface PreLoginPageLoc {
    By lblPreLogin = By.xpath("(//*)[21]");
    By ddLanguage = By.xpath("(//*)[27]");
    By btnEnglish = By.xpath("(//*[@text='English'])");
    By btnMalaysia = By.xpath("//*[@text='Bahasa Malaysia']");
    By btnChina = By.xpath("//*[@text='中文']");
    By ddAirport = By.xpath("(//*)[24]");
    By ddSelAir1 = By.xpath("(//*[@text='KUL - Terminal 1'])");
    By ddSelAir2 = By.xpath("(//*[@text='KUL - Terminal 2'])");
    By ddSelAirBKI = By.xpath("(//*[@text='BKI - Kota Kinabalu'])");
    By ddSelAirKCH = By.xpath("(//*[@text='KCH - Kuching'])");
    By ddSelAirPEN = By.xpath("(//*[@text='PEN - Penang'])");
    By btnSubmit = By.xpath("//*[@text='LOGIN / SIGN UP   | ']");
    By btnSubmitMalayLang = By.xpath("//*[@text='LOG MASUK / DAFTAR |']");
    By btnSubmitChinaLang = By.xpath("//*[@text='登录 / 注册 |']");

}
