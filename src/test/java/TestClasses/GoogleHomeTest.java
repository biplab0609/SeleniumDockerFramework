package TestClasses;

import PageObjects.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleHomeTest extends BaseTest {
    @Test
    @Parameters({"keyword","index"})
    public void searchText(String keyword, int index) {
        GoogleHomePage ghp = new GoogleHomePage(driver);
        ghp.launchUrl();
        System.out.println("Google Home Page launch successfully");
        System.out.println(keyword + " " + index);
//        ghp.isDisplayed();
//        Assert.assertEquals(1,1);
    }
}
