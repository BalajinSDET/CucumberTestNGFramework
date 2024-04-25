package PageObjects;

import ReusableMethods.ReusableActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSeeker_InterviewInvites_Page extends ReusableActions {

    @FindBy(xpath = "//h5[@class='text-center profCompTxt marg activeWhite']")
    public WebElement interviewinvitesHeading;

    @FindBy(xpath = "(//p[@class='margBottom10 margTopMinus5 margLeft10'])[1]")
    public WebElement invitedondate;

    @FindBy(xpath = "//button[normalize-space()='View Invites']")
    public WebElement viewInvites;

    @FindBy(xpath = "//h5[normalize-space()='Scheduled Interview']")
    public WebElement scheduledInterviewpage;

    @FindBy(xpath = "(//div[@class='fontWeight400 font16 marg5 '])[1]")
    public WebElement interviewlocationtext;

    @FindBy(xpath = "//div[contains(@class,'forSameRow onlyBlackWeight600 font17 marg5')]//div[1]")
    public WebElement DOInterviewtext;

    @FindBy(xpath = "//button[normalize-space()='View Job']")
    public WebElement viewjob;

    @FindBy(xpath = "//h5[normalize-space()='Job Overview']")
    public WebElement joboverview;

    public void VerifyInterviewInvitePage() {
        interviewinvitesHeading.isDisplayed();
        ReusableActions.HighlightingElement(interviewinvitesHeading);
    }

    public void VerifyInvitedDate() {
        String InvitedDate = invitedondate.getText();
        System.out.println("The scheduled interview " + InvitedDate);
    }

    public void ClickViewInvites() {
        ReusableActions.click(viewInvites);
    }

    public void VerifyScheduledInterviewPage() throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.HighlightingElement(scheduledInterviewpage);
        scheduledInterviewpage.isDisplayed();
    }

    public void VerifyInterviewLocation() {
        String InterviewLocation = interviewlocationtext.getText();
        System.out.println("The Interview location " + InterviewLocation);
    }

    public void VerifyDateOfInterview() {
        String DateOfInterview = DOInterviewtext.getText();
        System.out.println("Date of Interview " + DateOfInterview);
    }

    public void ClickViewJob() {
        ReusableActions.click(viewjob);
    }

    public void VerifyjobOverviewPage() {
        joboverview.isDisplayed();
        ReusableActions.HighlightingElement(joboverview);
    }
}
