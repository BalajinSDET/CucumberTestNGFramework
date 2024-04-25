package TestRunner;



import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import static TestBase.Selenium_Base_Hooks.getDriver;
import static TestBase.Selenium_Base_Hooks.launchApp;

@CucumberOptions(features = {"src/test/resources/Features/TC001_Post a Job.feature",
        "src/test/resources/Features/TC002_Search and Apply a Job.feature"},
        glue = "StepDefinition",
        dryRun = false,
        monochrome = true,
        publish = true,
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:failed_scenarios/failed_scenarios.txt",
                "pretty",
                "html:target/cucumber-reports/report.html"
        },
        tags = "@SmokeTest"
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
        @DataProvider(parallel = false)

        public Object[][] scenarios() {

                return super.scenarios();

        }

        @Parameters("browser")
        @BeforeTest
        public void setup(String browser) {
                launchApp(browser);
        }

        @AfterTest
        public void tearDown(Scenario scenario) {
                getDriver().quit();
        }

}
