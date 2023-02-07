package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(id="keywords")
    WebElement jobTitle;
    //By jobTitle= By.id("keywords");

    @FindBy(id="location")
    WebElement location;
    //By location=By.id("location");

    @FindBy(id="distance")
    WebElement distanceDropDown;
    //By distanceDropDown =By.id("distance");

    @FindBy(id="toggle-hp-search")
    WebElement moreSearchOptionsLink;
    //By moreSearchOptionsLink=By.id("toggle-hp-search");


    @FindBy(id="salarymin")
    WebElement salaryMin;
    //By salaryMin=By.id("salarymin");

    @FindBy(id="salarymax")
    WebElement salaryMax;
    //By salaryMax=By.id("salarymax");

    @FindBy(id="salarytype")
    WebElement salaryTypeDropDown;
    //By salaryTypeDropDown=By.id("salarytype");

    @FindBy(id="tempperm")
    WebElement jobTypeDropDown;
    //By jobTypeDropDown=By.id("tempperm");

    @FindBy(id="hp-search-btn")
    WebElement findJobsBtn;
   // By findJobsBtn=By.id("hp-search-btn");


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void EnterJobTitle(String job) {
        this.sendTextToElement(this.jobTitle, job);
    }

    public void EnterLocation(String location){
        this.sendTextToElement(this.location,location);
    }
    public void selectDistance(String distance){
        sendTextToElement(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void EnterMinSalary(String min){
        sendTextToElement(salaryMin,min);
    }
    public void EnterMaxSalary(String max){
        sendTextToElement(salaryMax,max);
    }
    public void selectSalaryType(String salary){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,salary);
    }
    public void selectJobType(String job){
        selectByVisibleTextFromDropDown(jobTypeDropDown,job);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }
    By cookiesButton= By.xpath("//button[@id='save']//span[contains(text(),'Accept All')]");

    public void acceptcookies() {
        //switch to frame
        driver.switchTo().frame("gdpr-consent-notice");
        // find the element inside the frame and send keys
        clickOnElement(cookiesButton);
        // switch back to default content
        driver.switchTo().defaultContent();

    }

    public void SearchJob(String jobTitle, String location, String distance){
        EnterJobTitle(jobTitle);
        EnterLocation(location);
        selectDistance(distance);


    }
    public void Entersalary(String salaryMin, String salaryMax, String salaryType, String jobType){
        EnterMinSalary(salaryMin);
        EnterMaxSalary(salaryMax);
        selectSalaryType(salaryType);
        selectJobType(jobType);
    }


}
