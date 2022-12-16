package uk.co.library.testsuite;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;
@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;


    @BeforeMethod(alwaysRun = true)
    public void inInt() {
        homePage = new HomePage();
        resultPage = new ResultPage();

    }

   @Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                        String result)throws InterruptedException{
        Thread.sleep(1000);
       driver.switchTo().frame(4);
             homePage.acceptAllCookies();
       driver.switchTo().defaultContent();
       homePage.enterJobTitle(jobTitle);
       Thread.sleep(500);
             homePage.enterLocation(location);
             homePage.selectDistance(distance);
             Thread.sleep(500);
             homePage.clickOnMoreSearchOptionLink();
       Thread.sleep(500);
             homePage.enterMinSalary(salaryMin);
             homePage.enterMaxSalary(salaryMax);
       Thread.sleep(500);
             homePage.selectSalaryType(salaryType);
       Thread.sleep(500);
             homePage.selectJobType(jobType);
             homePage.clickOnFindJobsButton();
       Thread.sleep(500);
             resultPage.verifyTheResults(result);





    }
}