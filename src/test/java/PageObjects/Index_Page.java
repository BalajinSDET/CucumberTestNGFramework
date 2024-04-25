package PageObjects;

import ReusableMethods.ReusableActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Index_Page extends ReusableActions {
    @FindBy(xpath = "//*[contains(@class, \"marginSearch80 \")]")
    WebElement indexPageTittlelabel;

    @FindBy(xpath = "//input[@placeholder=\"Job title, keywords..\"]")
    WebElement indexPageTittle;

    @FindBy(xpath = "//div[@class='forSameRow marginSearch80 col-12 col-sm-12 col-md-12 col-lg-12']//form//*[name()='svg']")
    WebElement searchIcorn;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement searchbutton;

    @FindBy(xpath = "//p[@class=\"forMobTxtCenter font12 white Cand10K\"]")
    List<WebElement> uploadYourCV;

    @FindBy(xpath = "//div[contains(text(),'Popular Job Categories')]")
    WebElement ThePopularJobCategories;

    @FindBy(xpath = "//div[@class=\"margLeft10 fontRes forHomeHover\"]")
    WebElement AccountingorFinancebutton;

    @FindBy(xpath = "//div[contains(text(),'Marketing')]")
    WebElement Marketingbutton;

    @FindBy(xpath = "//div[contains(text(),'Design')]")
    WebElement designbutton;

    @FindBy(xpath = "//div[contains(text(),'Development')]")
    WebElement Developmentbutton;

    @FindBy(xpath = "//div[contains(text(),'Customer Service')]")
    WebElement CustomerServicebutton;

    @FindBy(xpath = "//div[contains(text(),'Automative Jobs')]")
    WebElement AutomativeJobsbutton;

    @FindBy(xpath = "//div[contains(text(),'Register an account to start')]")
    WebElement registerAnAccountToStartCard;

    @FindBy(xpath = "//div[contains(text(),'Explore over thousand of resumes')]")
    WebElement ExploreOverThousandOfResumesCard;

    @FindBy(xpath = "//div[contains(text(),'Find the most suitable candidate')]")
    WebElement FindTheMostSuitableCandidateText;

    @FindBy(xpath = "//button[contains(text(),'Post Resume')]")
    WebElement postResumeButton;

    @FindBy(xpath = "//div[contains(@class,'pb-xl-11 pb-lg-11 pb-md-11 pb-sm-11 pb-0')]//p[@class='forMobTxtCenter colorPink marginTopMinus10'][normalize-space()='Browse All >']")
    WebElement browseAllbutton;

    @FindBy(xpath = "//div[contains(text(),'Latest Jobs')]")
    WebElement latestJobs;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    List<WebElement> latestJobsApplyButton;

    @FindBy(xpath = "//img[@src=\"/static/media/img.3290a76e.png\"]")
    WebElement employerRegisterAnAccount;

    @FindBy(xpath = "//img[@src=\"/static/media/cand.41bc2985.jpg\"]")
    WebElement candidateRegisterAnAccount;

    @FindBy(xpath = "//input[@placeholder=\"Keyword e.g. (Job Title, Description, Tags)\"]")
    WebElement appliedJobPage;

    @FindBy(xpath = "//a[@class]//*[@src='/static/media/humanLogo.98dd5966.png']")
    public WebElement IHPLOGO;

    @FindBy(xpath = "//h4[contains(text(),'LOGIN AS JOB PROVIDER')]")
    public WebElement loginAsJobProvider;


    public void clickindexPageTittlelabel() {
        ReusableActions.HighlightingElement(indexPageTittlelabel);
        indexPageTittlelabel.click();
    }


    public void clickOnSearchBox() throws InterruptedException {
        ReusableActions.HighlightingElement(indexPageTittle);
        indexPageTittle.click();
        indexPageTittle.sendKeys("developer");
        Thread.sleep(4000);

    }

    public void clickOnssearchIcorn() {
        ReusableActions.HighlightingElement(searchIcorn);
        searchIcorn.click();

    }

    public void clickOnssearchbutton() {
        ReusableActions.HighlightingElement(searchbutton);
        searchbutton.click();
    }

    public void clickOnuploadYourCV() throws InterruptedException {
        ReusableActions.HighlightingElement(uploadYourCV.get(1));
        Thread.sleep(2000);
        uploadYourCV.get(0).isDisplayed();
        uploadYourCV.get(1).click();
    }

    public void VerifyThePopularJobCategoriesSection() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(ThePopularJobCategories);
        ThePopularJobCategories.isDisplayed();
    }


    public void clickOnAccountingorFinance() {
        ReusableActions.HighlightingElement(AccountingorFinancebutton);
        AccountingorFinancebutton.click();
    }

    public void clickOnMarketingbutton() {
        ReusableActions.HighlightingElement(Marketingbutton);
        Marketingbutton.click();
    }

    public void clickOndesignbutton() {
        ReusableActions.HighlightingElement(designbutton);
        designbutton.click();
    }

    public void clickOnDevelopmentbutton() {
        ReusableActions.HighlightingElement(Developmentbutton);
        Developmentbutton.click();
    }

    public void clickOnCustomerServicebutton() {
        ReusableActions.HighlightingElement(CustomerServicebutton);
        CustomerServicebutton.click();
    }

    public void clickOnAutomativeJobsbutton() {
        ReusableActions.HighlightingElement(AutomativeJobsbutton);
        AutomativeJobsbutton.click();
    }

    public void clickOnRegisterAnAccountToStartCard() throws InterruptedException {
        ReusableActions.HighlightingElement(registerAnAccountToStartCard);
        registerAnAccountToStartCard.click();
        Thread.sleep(2000);
    }


    public void clickOnExploreOverThousandOfResumesCard() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(ExploreOverThousandOfResumesCard);
        ExploreOverThousandOfResumesCard.click();
    }

    public void clickOnFindTheMostSuitableCandidateCard() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(FindTheMostSuitableCandidateText);
        FindTheMostSuitableCandidateText.click();
    }

    public void clickOnFindTheMostSuitableCandidateText() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(FindTheMostSuitableCandidateText);
        FindTheMostSuitableCandidateText.click();
    }

    public void postResumeButton() {
        ReusableActions.HighlightingElement(postResumeButton);
        postResumeButton.click();
    }

    public void browseAllbutton() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(browseAllbutton);
        browseAllbutton.click();
    }

    public void clickOnlatestJobs() {
        ReusableActions.HighlightingElement(latestJobs);
        latestJobs.click();
    }

    public void clickOnlatestJobsApplyButton() throws InterruptedException {
        getDriver().navigate().back();
        Thread.sleep(5000);
        ReusableActions.HighlightingElement(latestJobsApplyButton.get(0));
        latestJobsApplyButton.get(0).click();
    }

    public void clickOnemployerRegisterAnAccount() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(employerRegisterAnAccount);
        employerRegisterAnAccount.click();
    }

    public void clickOncandidateRegisterAnAccount() {
        getDriver().navigate().back();
        ReusableActions.HighlightingElement(candidateRegisterAnAccount);
        candidateRegisterAnAccount.click();
    }

    public boolean VerifyAppliedJobPagee() {
        appliedJobPage.isDisplayed();
        getDriver().navigate().back();
        return true;
    }

    public void ClickLoginAsJobProvider() {
        ReusableActions.click(loginAsJobProvider);
    }

    public void VerifyIHPLOGO() {
        ReusableActions.HighlightingElement(IHPLOGO);
        IHPLOGO.isDisplayed();
    }

    public void verifyLoginAsJobSeekerButton() {
        loginAsJobProvider.isDisplayed();
    }
}
