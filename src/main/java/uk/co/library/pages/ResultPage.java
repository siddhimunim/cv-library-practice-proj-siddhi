package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//div[@class='search-header']//h1")
    WebElement resultTest ;
    public void verifyTheResults(String expected){
        Assert.assertEquals(getTextFromElement(resultTest),expected);

    }

}
