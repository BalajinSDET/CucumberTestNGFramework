package PageObjects;

import ReusableMethods.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JobProvider_SignIn_Page extends ReusableActions {

    @FindBy(xpath = "//h4[contains(text(),'Sign in')]")
    public WebElement SignInText;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement EmailId;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInBtn;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement KeepmeSignInCheckBox;

    @FindBy(xpath = "(//img[@class='marg25 margleftRight10'])[1]")
    public WebElement googleIcon;

    @FindBy(xpath = "(//img[@class='marg25 margleftRight10'])[2])")
    public WebElement linkedInIcon;

    @FindBy(xpath = "(//img[@class='marg25 margleftRight10'])[3]")
    public WebElement MobileIcon;

    @FindBy(xpath = "//div[text()='Forget Your Password']")
    public WebElement forgotpassword;

    @FindBy(xpath = "(//span[@class='text-danger'][normalize-space()='Required'])[1]")
    public WebElement EmailValidationMessage;

    @FindBy(xpath = "//span[@class='text-danger']")
    public WebElement EmailwithoutAtSymbolValidation;

    @FindBy(xpath = "(//span[@class='text-danger'][normalize-space()='Required'])[1]")
    public WebElement PasswordValidationMessage;

    public void VerifyEmailvalidationMessage() {
        while (EmailValidationMessage.isDisplayed()) {
            ReusableActions.HighlightingElement(EmailValidationMessage);
            String ActualEmailValidationMessage = EmailValidationMessage.getText();
            String Expected = "Required";
            boolean Result = ActualEmailValidationMessage.equalsIgnoreCase(Expected);
            Assert.assertEquals(ActualEmailValidationMessage, Expected);
            System.out.println("Displayed validation message status is " + Result);
            break;
        }
    }

    public boolean VerifyInvalidEmailValidationMessage() {
        while (EmailwithoutAtSymbolValidation.isDisplayed()) {
            ReusableActions.HighlightingElement(EmailwithoutAtSymbolValidation);
            String ActualEmailValidationMessage = EmailwithoutAtSymbolValidation.getText();
            String Expected = "Invalid email address";
            boolean Result = ActualEmailValidationMessage.equalsIgnoreCase(Expected);
            Assert.assertEquals(ActualEmailValidationMessage, Expected);
            System.out.println("Displayed validation message status is " + Result);
            break;
        }
        return true;
    }


    public void VerifyPasswordValidationMessage() {

        while (PasswordValidationMessage.isDisplayed()) {
            ReusableActions.HighlightingElement(PasswordValidationMessage);
            String ActualPasswordValidationMessage = PasswordValidationMessage.getText();
            String Expected = "Required";
            boolean Result = ActualPasswordValidationMessage.equalsIgnoreCase(Expected);
            Assert.assertEquals(ActualPasswordValidationMessage, Expected);
            System.out.println("Displayed validation message Status is " + Result);
            break;
        }
    }

    public void VerifySignInHeading() throws InterruptedException {
        Thread.sleep(1000);
        String ActualHeading = SignInText.getText();
        String ExpectedHeading = "Sign in";
        Assert.assertEquals(ExpectedHeading, ActualHeading);
    }

    public void EnterEmail(String email) {
        ReusableActions.HighlightingElement(EmailId);
        EmailId.sendKeys(email);
    }

    public void EnterPassword(String password) {
        ReusableActions.HighlightingElement(Password);
        Password.sendKeys(password);
    }

    public void ClickSignInBtn() {
        ReusableActions.HighlightingElement(SignInBtn);
        SignInBtn.click();
    }

    public void VerifyCheckBoxIsSelected() {
        boolean checkbox = KeepmeSignInCheckBox.isSelected();
        System.out.println("The status of checkbox is " + checkbox);
    }

    public void ClickCheckBoxToKeepMeSignIn() {
        ReusableActions.click(KeepmeSignInCheckBox);
    }

    public void ClickGoogleIcon() throws InterruptedException, AWTException {
        ReusableActions.click(googleIcon);
        Thread.sleep(3000);
        Set<String> windowId = getDriver().getWindowHandles();
        List<String> WindowsList = new ArrayList<>(windowId); // convert Set into List
        String Parent_Window = WindowsList.get(0);
        String Child_Window = WindowsList.get(1);

        // Switch to child window
        getDriver().switchTo().window(Child_Window);
        Thread.sleep(1000);
        getDriver().manage().window().maximize();
        Thread.sleep(1000);
        WebElement EmailField = getDriver().findElement(By.xpath("//input[@id='identifierId']"));
        EmailField.sendKeys("lgstester50@gmail.com");
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement NextButton = getDriver().findElement(By.xpath("//span[contains(text(),'Next')]"));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(NextButton));
        element.click();

        Thread.sleep(5000);

        WebElement PasswordField = getDriver().findElement(By.xpath("//input[@name='Passwd']"));
        PasswordField.sendKeys("Test@123");
        Thread.sleep(2000);

        element.click();

        //BaseClass.getDriver().findElement(By.xpath("//span[contains(text(),'Next')]"))
        //       .click();
        Thread.sleep(2000);
        getDriver().switchTo().window(Parent_Window);
        Thread.sleep(3000);

    }

    public void ClickLinkedInIcon() {
        ReusableActions.click(linkedInIcon);
    }

    public void ClickMobileIcon() {
        ReusableActions.click(MobileIcon);
    }

    public void ClickForgotPassword() {
        ReusableActions.click(forgotpassword);
    }

}
