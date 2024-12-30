package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/featureFiles"},
//        features = {"src/test/featureFiles/preLoginPage.feature", "src/test/featureFiles/loginPage.feature", "src/test/featureFiles/signupPage.feature","src/test/featureFiles/userProfile.feature"},
//        features = {"src/test/featureFiles/specialAssistance.feature"},
        glue = {"stepDefinitions"},
        tags = "@MyAirportRegressionOne",
        monochrome = true,
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"}
)
public class TestRunner1 extends AbstractTestNGCucumberTests {

}
