package PageObjects;

import ReusableMethods.ReusableActions;
import TestBase.Selenium_Base_Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSeeker_SignInPage extends ReusableActions {
    @FindBy(xpath = "//h4[contains(text(),'LOGIN AS JOBSEEKER')]")
    public WebElement JobSeekerLoginBTn;

    public void ClickLoginJobSeeker() {
        ReusableActions.HighlightingElement(JobSeekerLoginBTn);
        JobSeekerLoginBTn.click();
    }
}
