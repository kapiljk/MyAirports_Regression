package pages.pageLocators;

import org.openqa.selenium.By;

public interface WelcomePage2Loc {
    By btn3LoginOrSignup = By.xpath("//*[@text='LOGIN / SIGN UP  ']");
    By btn3Guest = By.xpath("//*[@text='Continue as Guest']");
    By btn3Back = By.xpath("//*[@text='Continue as Guest']/preceding-sibling::*[2]");
    By logo = By.xpath("//*[@text='Continue as Guest']/preceding-sibling::*[3]");
    By dd3Language = By.xpath("//*[@text='Continue as Guest']/preceding-sibling::*[4]");
    By dd3English = By.xpath("(//*[@text='English'])[1]");
    By dd3Malay = By.xpath("(//*[@text='Bahasa Malaysia'])[1]");
    By dd3Chinees = By.xpath("(//*[@text='中文'])[1]");
    By btn3MalayLoginOrSignup = By.xpath("//*[@text='LOG MASUK / DAFTAR']");
    By btn3ChineesLoginOrSignup = By.xpath("//*[@text='登录 / 注册']");


}
