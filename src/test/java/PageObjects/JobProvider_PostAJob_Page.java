package PageObjects;

import ReusableMethods.ReusableActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import sun.jvm.hotspot.debugger.cdbg.BaseClass;

import java.util.Random;

public class JobProvider_PostAJob_Page extends ReusableActions {

    @FindBy(xpath = "//div[contains(text(),'Post a New Job')]")
    WebElement postAJobCard;

    @FindBy(xpath = "//h5[contains(text(),'Post a Job')]")
    WebElement postAJobText;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div/div/form/div[1]/div[1]/div[1]/div/div/div[1]/div/div")
    WebElement jobIdTextBox;

    @FindBy(xpath = "//input[@placeholder=\"Job Id \"]")
    WebElement jobIdPlaceholder;

    @FindBy(xpath = "//input[@placeholder=\"Responsibilities \"]")
    WebElement responsibilitiesTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div/div/form/div[1]/div[1]/div[1]/div/div/div[4]/div/div/input")
    WebElement jobTitleTextBox;

    @FindBy(xpath = "//textarea[@placeholder=\"Preferred Skills\"]")
    WebElement prefferedSkillsTxtBox;

    @FindBy(xpath = "//textarea[@placeholder=\"About This Job\"]")
    WebElement aboutThisJobTextBox;

    @FindBy(xpath = "//input[@placeholder=\"Job Keywords\"]")
    WebElement jobKeywordsTxtBox;

    @FindBy(xpath = "//input[@placeholder=\"Full Address\"]")
    WebElement fullAddressTxtBox;

    @FindBy(xpath = "//select[@placeholder=\"job_category*\"]")
    WebElement jobCategoryDropDown;

    @FindBy(xpath = "//div[contains(text(),'Posted Jobs')]")
    WebElement postedJobsCard;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div/div/form/div[1]/div[1]/div[1]/div/div/div[5]/div/div/select")
    WebElement selectHourDropDown;

    @FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div/form/div/div/div/form/div[1]/div[1]/div[1]/div/div/div[6]/div/div/select")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//select[@placeholder=\"Select Experience \"]")
    WebElement experienceDropDown;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div/div/form/div[1]/div[1]/div[1]/div/div/div[8]/div/div/select")
    WebElement salaryDropDown;

    @FindBy(xpath = "//select[@placeholder=\"Minimum Qualifications\"]")
    WebElement minimumQualificationDropDown;

    @FindBy(xpath = "//select[@placeholder=\"Select Education\"]")
    WebElement selectEducationDropDown;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div/div/form/div[1]/div[1]/div[1]/div/div/div[9]/div/div/select")
    WebElement workShceduleDropDown;

    @FindBy(xpath = "//select[@placeholder=\"country\"]")
    WebElement countryDropDown;

    @FindBy(xpath = "//select[@placeholder=\"state\"]")
    WebElement stateDropDown;

    @FindBy(xpath = "//select[@placeholder=\"city\"]")
    WebElement cityDropDown;

    @FindBy(xpath = "//select[@placeholder=\"contact_option\"]")
    WebElement contactOption;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div/div/form/button")
    WebElement submitBtn;

    @FindBy(xpath = "//div[contains(text(),'Your Job is Successfully Posted')]")
    WebElement jobPostedSuccessfullytxt;

    @FindBy(xpath = "(//div[@class='text-center marg']/following-sibling::div)[1]")
    public WebElement JobIDText;

    @FindBy(xpath = "//button[normalize-space()='View Job']")
    public WebElement viewjobbutton;

    @FindBy(xpath = "//h5[normalize-space()='Job Overview']")
    public WebElement JobOverviewPage;

    public String getRandomString() {
        String jobId = "1234567890";
        StringBuilder job_Id = new StringBuilder();
        Random rnd = new Random();
        while (job_Id.length() < 18) { // length of the random string.
            int index = 5;
            job_Id.append(jobId.charAt(index));
        }
        String jobIdStr = job_Id.toString();
        return jobIdStr;
    }

    public void clickOnPostaJobCard() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(postAJobCard);
        postAJobCard.click();
    }

    public boolean verifyPostAJobPage() {
        ReusableActions.HighlightingElement(postAJobText);
        if (postAJobText.isDisplayed()) {

        }
        return true;
    }

    public void enterJobId(String jobID) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(jobIdTextBox);
        jobIdTextBox.click();
        jobIdPlaceholder.sendKeys(jobID);
    }

    public void enterjobTitle(String jobTitle) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(jobTitleTextBox);
        jobTitleTextBox.sendKeys(jobTitle);
    }

    public void enterpreferedSkills(String preferedSkills) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(prefferedSkillsTxtBox);
        prefferedSkillsTxtBox.sendKeys(preferedSkills);
    }

    public void enterjobKeywords(String jobKeywords) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(jobKeywordsTxtBox);
        jobKeywordsTxtBox.sendKeys(jobKeywords);
    }

    public void enterAddress(String address) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(fullAddressTxtBox);
        fullAddressTxtBox.sendKeys(address);
    }

    public void enterResponsibilities(String responsibilities) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(responsibilitiesTextBox);
        responsibilitiesTextBox.sendKeys(responsibilities);
    }

    public void enterAboutTheJob(String aboutTheJob) throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(aboutThisJobTextBox);
        aboutThisJobTextBox.sendKeys(aboutTheJob);
    }

    public void clickOnWorkinghourDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(selectHourDropDown);
        dropDownByText(selectHourDropDown, "3");
    }

    public void dropDownByText(WebElement dropdown, String text) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    public void clickOnJobTypeDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(jobTypeDropDown);
        dropDownByText(jobTypeDropDown, "Full Time");
    }

    public void clickOnExperienceDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(experienceDropDown);
        dropDownByText(experienceDropDown, "1-3 years Experience");
    }

    public void clickOnAnnualSalaryDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(salaryDropDown);
        dropDownByText(salaryDropDown, "2L-5 L");
    }

    public void clickOnWorkSheduleDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(workShceduleDropDown);
        dropDownByText(workShceduleDropDown, "Monday to Friday");
    }

    public void clickOnmMinimumQualificationDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(minimumQualificationDropDown);
        dropDownByText(minimumQualificationDropDown, "B.E/B.Tech");
    }

    public void educationDropDown() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(selectEducationDropDown);
        dropDownByText(selectEducationDropDown, "B.E/B.Tech");
    }

    public void selectState() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(stateDropDown);
        dropDownByText(stateDropDown, "Tamil Nadu---TN");
    }

    public void selectCountry() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(countryDropDown);
        dropDownByText(countryDropDown, "India---IN");
    }

    public void selectCity() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(cityDropDown);
        dropDownByText(cityDropDown, "Coimbatore");
    }

    public void selectContactOption() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(contactOption);
        dropDownByText(contactOption, "Email/Call");
    }

    public void clickOnSubmitButton() throws InterruptedException {
        Thread.sleep(500);
        ReusableActions.HighlightingElement(submitBtn);
        submitBtn.isDisplayed();
        Thread.sleep(500);
        submitBtn.click();
    }

    public boolean jobPostedSuccessfullyPopupVisible() throws InterruptedException {
        Thread.sleep(3000);
      //  BaseClass.windowHandle();
        ReusableActions.HighlightingElement(jobPostedSuccessfullytxt);
        jobPostedSuccessfullytxt.isDisplayed();
        String jobPosted = jobPostedSuccessfullytxt.getText();
        String jobidtext = JobIDText.getText();
        System.out.println(jobidtext);
        ReusableActions.click(viewjobbutton);
        getDriver().manage().window().maximize();
        String verifypage = JobOverviewPage.getText();
        System.out.println(verifypage);
        return true;
    }

    public void clickOnJobCategoryDropDown() throws InterruptedException {
        Thread.sleep(1000);
        ReusableActions.HighlightingElement(jobCategoryDropDown);
        dropDownByText(jobCategoryDropDown, "Information Technology");
    }

    public void clickOnPostedJobCard() {
        postedJobsCard.click();
    }

}
