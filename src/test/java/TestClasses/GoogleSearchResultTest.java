package TestClasses;

import PageObjects.GoogleHomePage;
import PageObjects.GoogleSearchResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchResultTest extends BaseTest {

    @Test(dataProvider = "getData")
    public void searchPageText(String keyword, int index) {
        GoogleHomePage ghp = new GoogleHomePage(driver);
        GoogleSearchResultPage gsrp = new GoogleSearchResultPage(driver);
        ghp.launchUrl();
        System.out.println("Google Search Result Page launch successfully");
        System.out.println(keyword + " " + index);
//        ghp.isDisplayed();
//        ghp.searchText("Docker");
//        ghp.clickSuggestionByindex(3);
//        gsrp.isDisplayed();
//        Assert.assertEquals("Pass","Pass");

    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"Docker", 3}
        };
    }

}
