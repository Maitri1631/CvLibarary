package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.testbase.TestBase;

public class HomePageTest extends TestBase {

    HomePage homepage;
    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();

    }

    @Test(dataProvider = "jobDescription", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result){
       // homepage.acceptcookies();

        homepage.SearchJob(jobTitle, location, distance);
        homepage.clickOnMoreSearchOptionLink();
        homepage.Entersalary(salaryMin,salaryMax,salaryType,jobType);
        homepage.clickOnFindJobsButton();
    }
}
