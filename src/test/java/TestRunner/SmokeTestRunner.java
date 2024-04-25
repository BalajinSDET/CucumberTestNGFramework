package TestRunner;


import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/Verify Post a Job .feature",
        "src/test/resources/Features/Verify Search & Apply Job.feature"},
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

public class SmokeTestRunner {
}
