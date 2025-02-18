package pages.pageLocators;

import org.openqa.selenium.By;

public interface LoginPageLoc {
    By lblLogin = By.xpath("//*[@text=' LOGIN']");
    By txtEmail = By.xpath("//*[@text='Email ID']");
    By txtPass = By.xpath("//*[@text='Enter Password']");
    By btnSignup = By.xpath("//*[contains(@text,'SIGN UP')]");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
    By btnGoogle = By.xpath("//*[@text='LOGIN WITH GOOGLE']");
    By txtUserNameGoogle = By.xpath("//*[@resource-id='yDmH0d']/*[4]/*/*[1]/*[3]");
    By btnNextGoogle = By.xpath("//*[@text='Next']");
    By txtPasswordGoogle = By.xpath("//*[@resource-id='password']/*/*[2]/*");
    By errorMessageGoogle = By.xpath("//*[@text='Wrong password. Try again or click Forgot password to reset it.']");





}
