package StepDefinition;

import PageObjects.Index_Page;
import PageObjects.JobProvider_SignIn_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInAs_JobProvider_Steps {

    Index_Page IP = new Index_Page();
    JobProvider_SignIn_Page JPSIP = new JobProvider_SignIn_Page();
    @Given("User is enter the Ihp website URL")
    public void userIsEnterTheIhpWebsiteURL() {
    }

    @When("The user should able to click on the Login as Job provider button in the HomePage")
    public void theUserShouldAbleToClickOnTheLoginAsJobProviderButtonInTheHomePage() {
        IP.ClickLoginAsJobProvider();
    }

    @Then("User should navigated to the sign in page")
    public void userShouldNavigatedToTheSignInPage() throws InterruptedException {
        JPSIP.VerifySignInHeading();
    }

    @And("The user enter their Email Id as {string} and Password as {string}")
    public void theUserEnterTheirEmailIdAsAndPasswordAs(String email, String password) {
        JPSIP.EnterEmail(email);
        JPSIP.EnterPassword(password);
    }

    @When("User clicks on the sign in button")
    public void userClicksOnTheSignInButton() {
        JPSIP.ClickSignInBtn();
    }

    @And("User should navigated to the KYC Verification")
    public void userShouldNavigatedToTheKYCVerification() {
    }

    @And("User clicks the email verification radio button and then user clicks the submit button")
    public void userClicksTheEmailVerificationRadioButtonAndThenUserClicksTheSubmitButton() {
    }

    @Then("User navigates to the dashboard page of the Ihp project successfully")
    public void userNavigatesToTheDashboardPageOfTheIhpProjectSuccessfully() {
    }

    @And("User clicks on post a job card in home page")
    public void userClicksOnPostAJobCardInHomePage() {
    }

    @Then("Verify job provider is redirected to post a job page")
    public void verifyJobProviderIsRedirectedToPostAJobPage() {
    }

    @And("user enters the below details for post a job")
    public void userEntersTheBelowDetailsForPostAJob() {
    }

    @And("user enter about the job in the about the job text field")
    public void userEnterAboutTheJobInTheAboutTheJobTextField() {
    }

    @And("user select value from the dropbox for working hour,job type,salary,minimum qualification,work schedule,experience")
    public void userSelectValueFromTheDropboxForWorkingHourJobTypeSalaryMinimumQualificationWorkScheduleExperience() {
    }

    @And("user choose value from the drop box for country,state and city")
    public void userChooseValueFromTheDropBoxForCountryStateAndCity() {
    }

    @And("user clicks on submit button in post a job page")
    public void userClicksOnSubmitButtonInPostAJobPage() {
    }

    @Then("verify job posted successfully pop up is visible")
    public void verifyJobPostedSuccessfullyPopUpIsVisible() {
    }
}
