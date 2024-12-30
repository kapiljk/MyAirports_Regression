package baseTestSteps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import utils.PageObjectManager;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

/**
If you are starting the appium server programmatically/cmd then the URL should be "http://127.0.0.1:4723"
If you are starting the appium server manually through Desktop then the URL should be "http://127.0.0.1:4723/wd/hub"
 */

public class BaseSteps {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;
    public final static int time_out = 200;
    public static PageObjectManager pm;
    private static String dir;

    public static AndroidDriver getDriver() throws MalformedURLException {
        dir = System.getProperty("user.dir");

        service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start(); //Last 3 lines need to un comment for CICD




        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("Pixel 6 pro API 30");
        options.setApp(dir + "//src//main//ApkFile//Prod.apk");
        options.setUdid("emulator-5554");
        options.setPlatformName("Android");
        options.setPlatformVersion("Android 11");

//        URL url = new URL("http://127.0.0.1:4723/wd/hub");//uncomment for Appium server

        URL url = new URL("http://127.0.0.1:4723"); //uncomment for cmd
        driver = new AndroidDriver(url, options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time_out));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
//        if (service != null) // CICD
//            service.stop(); //CICD
    }

    public static void loginApplication() {
        try {
            FileInputStream fis = new FileInputStream(dir + "//src//test//resources//config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            String email = prop.getProperty("email");
            String password = prop.getProperty("password");
            pm = new PageObjectManager(driver);
            pm.preLoginPage().clickOnSubmitButton();
            pm.welcomePage().verifyWelcomePage();
            pm.welcomePage().clickOnLoginOrSignup();
            pm.welcomePage().loginPage().verifyLoginPage();
            pm.welcomePage().loginPage().enterEmailID(email);
            pm.welcomePage().loginPage().enterPassword(password);
            pm.welcomePage().loginPage().clickOnSubmitButton();
            pm.welcomePage().loginPage().locationPopup().verifyLocationPopupHeading();
        } catch (Exception ignored) {

        }
    }

    public static void prelogins() {
        try {
            pm = new PageObjectManager(driver);
            pm.preLoginPage().clickOnSubmitButton();
        } catch (Exception ignored) {
        }
    }
}
