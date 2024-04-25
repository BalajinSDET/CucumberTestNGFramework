package PageObjects;

import ReusableMethods.ReusableActions;
import Utilities.OtpReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OTP_Verification_Page extends ReusableActions {

    @FindBy(xpath = " //div[contains(text(),'OTP Verification')]")
    public WebElement verifyHeading;

    @FindBy(xpath = "//input[@value='email']")
    public WebElement emailRBtn;

    @FindBy(xpath = "//button[contains (text(),'Submit')]")
    public WebElement submitBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[1]")
    public WebElement ClickOTPfield;

    @FindBy(xpath = "//input[@placeholder='Enter OTP']")
    public WebElement enterOTP;

    @FindBy(xpath = "//h5[contains(text(),'Submit ')]")
    public WebElement VerifyOTPSubmitBtn;


    public void VerifyOTPHeading() {
        try {
            Thread.sleep(500);
            ReusableActions.HighlightingElement(verifyHeading);
            String ActualHeading = verifyHeading.getText();
            String ExpectedHeading = "OTP Verification";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void ClickEmailRadioBtn() {
        ReusableActions.HighlightingElement(emailRBtn);
        ReusableActions.explicitWait(emailRBtn);
        emailRBtn.click();
    }

    public void ClickSubmitBtn() {
        ReusableActions.HighlightingElement(submitBtn);
        ReusableActions.explicitWait(submitBtn);
        submitBtn.click();
    }

    public void EnterOTP() {
        ReusableActions.HighlightingElement(enterOTP);
        String otp = OtpReader.getOtp();
        enterOTP.sendKeys(otp);
    }

    public void ClickVerifiedOtpSubmitBtn() {
        ReusableActions.HighlightingElement(VerifyOTPSubmitBtn);
        VerifyOTPSubmitBtn.click();
    }

}
