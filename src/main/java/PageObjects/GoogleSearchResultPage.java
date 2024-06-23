package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GoogleSearchResultPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public GoogleSearchResultPage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "News")
    private WebElement newsLink;

    public boolean isDisplayed(){
        this.wait.until(ExpectedConditions.visibilityOf(newsLink));
        return true;
    }

}
