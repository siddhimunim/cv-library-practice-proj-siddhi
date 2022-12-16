package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
   // @FindBy(xpath = "//span[text()='Accept All']")
    @FindBy(xpath = "//button[@id='save']/span/div/span")
    WebElement cookies;
    @CacheLookup
    @FindBy(id="keywords")
    WebElement jobTitle1 ;
    @CacheLookup
    @FindBy(id="location")
    WebElement location1 ;
    @CacheLookup
    @FindBy(xpath="//select[@id='distance']")
    WebElement DistanceDropDown ;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink ;
    @CacheLookup
  //  @FindBy(id="salarymin")
  @FindBy(css="#salarymin")
    WebElement salaryMin ;
    @CacheLookup
    @FindBy(id="salarymax")
    WebElement salaryMax ;
    @CacheLookup
    @FindBy(xpath="//select[@id='salarytype']")
    WebElement salaryTypeDropDown ;
    @CacheLookup
    @FindBy(id ="tempperm")
    WebElement jobTypeDropDown ;
    @CacheLookup
    @FindBy(id="hp-search-btn")
    WebElement findJobsBtn1 ;
    //-----------------------------------methods------------------------------------//
    public void acceptAllCookies(){

        mouseHoverToElementAndClick(cookies);

    }
    public void  enterJobTitle(String jobTitle){
        Reporter.log("Enter Job Title"+ jobTitle1.toString());
        sendTextToElement(jobTitle1,jobTitle);
        CustomListeners.test.log(Status.PASS,"Enter Job Tiile"+ jobTitle);

    }
    public void enterLocation(String location){
        Reporter.log("Enter Location"+ location1.toString());
        sendTextToElement(location1,location);
        CustomListeners.test.log(Status.PASS,"Enter Location"+ location);

    }
    public void selectDistance(String distance){
        Reporter.log("Select Distance"+ DistanceDropDown.toString());
        selectByVisibleTextFromDropDown(DistanceDropDown,distance);
        CustomListeners.test.log(Status.PASS,"Select Distance"+ distance);

    }
    public void clickOnMoreSearchOptionLink(){
        Reporter.log("click on more search option"+ moreSearchOptionsLink.toString());
        mouseHoverToElementAndClick(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS,"click on more search option");

    }
    public void  enterMinSalary(String minSalary){
        Reporter.log("Enter Minimum Salary"+ salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
        CustomListeners.test.log(Status.PASS,"Enter Minimum Salary"+ minSalary);

    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("EnterMax salary"+ salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
        CustomListeners.test.log(Status.PASS," Max salary : "+ maxSalary);

    }
    public void selectSalaryType(String sType){
        Reporter.log("Select salary Type"+ salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        CustomListeners.test.log(Status.PASS,"Salary type :"+ sType);

    }
    public void selectJobType(String jobType){
        Reporter.log("Select Job Type"+ jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        CustomListeners.test.log(Status.PASS," Job Type"+ jobType);

    }
    public void  clickOnFindJobsButton(){
        Reporter.log("Click on find job button"+ findJobsBtn1.toString());
        mouseHoverToElementAndClick(findJobsBtn1);
        CustomListeners.test.log(Status.PASS,"click on find job ");

    }








}
