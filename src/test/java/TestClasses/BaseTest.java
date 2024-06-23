package TestClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseTest {
    protected WebDriver driver;
//    RemoteWebDriver driver = null;

    @BeforeTest
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        ChromeOptions options = new ChromeOptions();
//        String hubURL = "http://localhost:4444/wd/hub";
//        try {
//            driver = new RemoteWebDriver(new URL(hubURL), options);
//            // Example: Run a test using the RemoteWebDriver
//            //driver.get("https://www.google.com");
//            //System.out.println("Page title: " + driver.getTitle());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @AfterTest
    public void quiteDrive() {
        this.driver.quit();
    }

}
