package PageObjects;

import ReusableMethods.ReusableActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobProvider_Schedule_Interview_Page extends ReusableActions {
    @FindBy(xpath = "//h3[contains(text(),'Featured Candidates')]//following::button")
    List<WebElement> viewDetailsBtn;

    @FindBy(xpath = "//button[contains(text(),'Schedule Interview')]")
    WebElement scheduleInterviewBtn;

    @FindBy(xpath = "//button[@class=\"react-calendar__tile react-calendar__month-view__days__day\"]")
    List<WebElement> daysInCalendar;

    @FindBy(xpath = "//label[contains(text(),'Start Time:')]//following::select")
    List<WebElement> selectFromTimeDropDown;

    @FindBy(xpath = "(//*[name()='svg'][@class='svg-inline--fa fa-plus-square fa-w-14 text-danger marg32 marginMinusLeft10 font26'])[1]")
    WebElement addIcon;

    @FindBy(xpath = "//select[@id='job_type' or @name='job_type']")
    WebElement interviewTypeDropDown;

    @FindBy(xpath = "//label[contains(text(),'Interview Location')]//following::div[4]")
    WebElement interviewLocationTextBox;

    @FindBy(xpath = "//input[@id='job_type']")
    WebElement consernedPersonDetails;

    @FindBy(xpath = "//h5[contains(text(),'Schedule')]")
    WebElement scheduleBtn;

    @FindBy(xpath = "//div[@class='paddLeft20 jobListTitle']")
    WebElement jobseekerName;

    @FindBy(xpath = "//div[contains(text(),'Total Experience :')]")
    WebElement totalExperienceLbl;

    @FindBy(xpath = "//div[contains(text(),'Current Salary :')]")
    WebElement currentSalaryLbl;

    @FindBy(xpath = "//div[contains(text(),'Mobile Number :')]")
    WebElement mobileNumberLbl;

    @FindBy(xpath = "//div[contains(text(),'Current Company :')]")
    WebElement currentCompanyLbl;

    @FindBy(xpath = "//div[contains(text(),'Previous Company :')]")
    WebElement previousCompanyLbl;

    @FindBy(xpath = "//div[contains(text(),'Highest Education :')]")
    WebElement highestEducationLbl;

    @FindBy(xpath = "//div[contains(text(),'Key Skills :')]")
    WebElement keyskillsLbl;

    @FindBy(xpath = "//div[contains(text(),'Notice Period :')]")
    WebElement noticePeriodLbl;

    @FindBy(xpath = "//div[contains(text(),'Preferred Location :')]")
    WebElement preferredLocationLbl;

    @FindBy(xpath = "//div[contains(text(),'Current Salary :')]//following::div[3]")
    WebElement locationLbl;

    @FindBy(xpath = "//button[@class=\"downloadResumeBtn forSameRow btn1 btn btn-outline-danger\"]")
    WebElement downloadResumeBtn;

    @FindBy(xpath = "//button[@class=\"downloadResumeBtn1 forSameRow btn1 btn btn-danger\"]")
    List<WebElement> makeAChatBtn;

    @FindBy(xpath = "//div[contains(text(),\"Personal Details :\")]")
    WebElement personelDetainsSection;

    @FindBy(xpath = "//h5[contains(text(),\"Keywords\")]")
    WebElement keywordBtn;

    @FindBy(xpath = "//h5[contains(text(),\"Experience\")]")
    WebElement experienceTab;

    @FindBy(xpath = "//h5[contains(text(),\"Education\")]")
    WebElement educationTab;

    @FindBy(xpath = "//h5[contains(text(),\"Preferred Job\")]")
    WebElement preferredJobTab;

    @FindBy(xpath = "//h5[contains(text(),\"Others\")]")
    WebElement othersTab;

    @FindBy(xpath = "//h5[contains(text(),\"Personal Details\")]")
    WebElement personalDetailsTab;

    @FindBy(xpath = "//div[contains(text(),\"Profile Links:\")]")
    WebElement profileLinksSection;


    public boolean verifyJobSeekerNameVisible() {
        ReusableActions.HighlightingElement(jobseekerName);
        jobseekerName.isDisplayed();
        return true;
    }

    public void clickOnViewDetailsButton() {
        for (int i = 0; i < viewDetailsBtn.size(); i++) {
            if (viewDetailsBtn.get(i).isDisplayed()) {
                viewDetailsBtn.get(i).click();
                break;
            }
        }
    }

    public void clickOnScheduleBtn() {
        scheduleInterviewBtn.click();
    }



    public void ScheduleAnInterview(String interviewMode) throws InterruptedException {
       // ReusableActions.windowHandle();
        Thread.sleep(5000);
        for (int i = 0; i < daysInCalendar.size(); i++) {
            if (daysInCalendar.get(i).isEnabled()) {
                daysInCalendar.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);
     //   post_job_page.dropDownByText(selectFromTimeDropDown.get(0), "4 : 00 AM");
     //   post_job_page.dropDownByText(selectFromTimeDropDown.get(1), "6 : 00 AM");
     //   post_job_page.dropDownByText(selectFromTimeDropDown.get(2), "15 Minutes");
        Thread.sleep(1000);
        addIcon.click();
        Thread.sleep(2000);
        switch (interviewMode) {
            case "zoom":
            //    post_job_page.dropDownByText(interviewTypeDropDown, "Zoom Interview");
                break;
            case "meet":
             //   post_job_page.dropDownByText(interviewTypeDropDown, "Meet Interview");
                break;
            case "direct":
             //   post_job_page.dropDownByText(interviewTypeDropDown, "Direct");
                Thread.sleep(4000);
//                driver.findElement(By.xpath("//div[@class=\" css-1hwfws3\"]")).click();
                //   interviewLocationTextBox.click();
                // Thread.sleep(4000);
                ReusableActions.clickAndType(interviewLocationTextBox, "Ban");
                Thread.sleep(4000);
              //  post_job_page.dropDownByText(interviewTypeDropDown, "Bangalore, Karnataka, India");
                break;
        }
        Thread.sleep(1000);
        consernedPersonDetails.sendKeys("Priya");
        scheduleBtn.click();
        Thread.sleep(2000);
        getDriver().switchTo().alert().accept();
    }

    public boolean verifyTotalExperienceLabel() {
        ReusableActions.HighlightingElement(totalExperienceLbl);
        totalExperienceLbl.isDisplayed();
        return true;
    }

    public boolean verifyProfileOverviewPage() {
        ReusableActions.HighlightingElement(currentSalaryLbl);
        currentSalaryLbl.isDisplayed();
        ReusableActions.HighlightingElement(mobileNumberLbl);
        mobileNumberLbl.isDisplayed();
        ReusableActions.HighlightingElement(currentCompanyLbl);
        currentCompanyLbl.isDisplayed();
        ReusableActions.HighlightingElement(previousCompanyLbl);
        previousCompanyLbl.isDisplayed();
        ReusableActions.HighlightingElement(highestEducationLbl);
        highestEducationLbl.isDisplayed();
        ReusableActions.HighlightingElement(keyskillsLbl);
        keyskillsLbl.isDisplayed();
        ReusableActions.HighlightingElement(noticePeriodLbl);
        noticePeriodLbl.isDisplayed();
        ReusableActions.HighlightingElement(preferredLocationLbl);
        preferredLocationLbl.isDisplayed();
        ReusableActions.HighlightingElement(locationLbl);
        locationLbl.isDisplayed();
        return true;
    }

    public boolean verifyButtonsInProfileOverviewPage() {
        ReusableActions.HighlightingElement(downloadResumeBtn);
        downloadResumeBtn.isDisplayed();
        ReusableActions.HighlightingElement(scheduleInterviewBtn);
        scheduleInterviewBtn.isDisplayed();
        ReusableActions.HighlightingElement(makeAChatBtn.get(0));
        makeAChatBtn.get(0).isDisplayed();
        ReusableActions.HighlightingElement(makeAChatBtn.get(1));
        makeAChatBtn.get(1).isDisplayed();
        return true;

    }

    public boolean verifyPersonelDetailsSection() {
        ReusableActions.HighlightingElement(personelDetainsSection);
        personelDetainsSection.isDisplayed();
        ReusableActions.HighlightingElement(keywordBtn);
        keywordBtn.isDisplayed();
        ReusableActions.HighlightingElement(experienceTab);
        experienceTab.isDisplayed();
        ReusableActions.HighlightingElement(educationTab);
        educationTab.isDisplayed();
        ReusableActions.HighlightingElement(preferredJobTab);
        preferredJobTab.isDisplayed();
        ReusableActions.HighlightingElement(othersTab);
        othersTab.isDisplayed();
        ReusableActions.HighlightingElement(personalDetailsTab);
        personalDetailsTab.isDisplayed();
        ReusableActions.HighlightingElement(profileLinksSection);
        profileLinksSection.isDisplayed();
        return true;
    }
}
