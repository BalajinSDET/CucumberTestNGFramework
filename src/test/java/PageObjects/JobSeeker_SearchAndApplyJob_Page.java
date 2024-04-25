package PageObjects;

import ReusableMethods.ReusableActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobSeeker_SearchAndApplyJob_Page extends ReusableActions {

    @FindBy(xpath = "//div[contains(text(),'Search Jobs')]")
    public WebElement SearchJobPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/div/form/div/div/div[2]/div/input")
    public WebElement SearchBar;

    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div[1]/div/div/div[1]/div/div[2]//div[@class='jobBoxTitle']")
    public WebElement SearchJobTitle;

    @FindBy(xpath="//button[contains(text(),'Apply')]")
    public List<WebElement> ApplyBtn;

    @FindBy(xpath = "//button[contains(text(),'Applied')]")
    List<WebElement> listOfAppliedBtn;

    public void VerifySearchJobPage(){
        String PageHeader =   SearchJobPage.getText();
        ReusableActions.HighlightingElement(SearchJobPage);
        System.out.println("The displayed page is "+PageHeader);
    }

    public void ClickAndTypeSearch(String searchedJob){
        ReusableActions.HighlightingElement(SearchBar);
        SearchBar.click();
        SearchBar.sendKeys(searchedJob + Keys.ENTER);
    }

    public void JobTitle (){
        boolean Jobtitle =  SearchJobTitle.isDisplayed();
        ReusableActions.HighlightingElement(SearchJobTitle);
        System.out.println(Jobtitle);
    }


    public void ClickApplyBtn(){

        if(listOfAppliedBtn.get(0).isDisplayed()){
            ApplyBtn.get(0).click();
        }
        else{
            ApplyBtn.get(0).click();
        }
    }

}
