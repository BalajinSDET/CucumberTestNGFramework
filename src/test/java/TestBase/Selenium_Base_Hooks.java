package TestBase;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Selenium_Base_Hooks {
    public static Properties prop;

    // Declare ThreadLocal Driver
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    //loadConfig method is to load the config properties file

    public static Properties getProp() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static WebDriver getDriver() {
        // Get Driver from threadLocalmap
        return driver.get();
    }

    public static void launchApp(String browserName) {
        // String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            // Set Browser to ThreadLocalMap
            driver.set(new ChromeDriver());
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        } else if (browserName.equalsIgnoreCase("EDGE")) {
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
        }
        //Maximize the screen
        getDriver().manage().window().maximize();
        //Delete all the cookies
        getDriver().manage().deleteAllCookies();
        //Implicit TimeOuts
        getDriver().manage().timeouts().implicitlyWait
                (Duration.ofSeconds(30));
        //PageLoad TimeOuts
        getDriver().manage().timeouts().pageLoadTimeout
                (Duration.ofSeconds(30));
        //Launching the URL
        getDriver().get(getProp().getProperty("appURL"));
    }




    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

}
