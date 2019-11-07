package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import utilities.*;

import static java.lang.Thread.sleep;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public static void beforeTestRunSetUp(String browser) {
        switch (browser) {
            case "chrome":
                Configuration.browser = SelenoidChromeWebDriverProvider.class.getName();
                break;
            case "firefox":
                Configuration.browser = SelenoidFirefoxWebDriverProvider.class.getName();
                break;
            case "opera":
                Configuration.browser = SelenoidOperaWebDriverProvider.class.getName();
                break;
            default:
                throw new WebDriverException("Define browser!");
        }
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        sleep(1000);
        WebDriverRunner.getWebDriver().quit();
    }
}
