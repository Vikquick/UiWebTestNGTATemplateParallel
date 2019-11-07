package utilities;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        makeScreenshot();
    }

    /**
     * Taking of screenshots for Allure report.
     * https://docs.qameta.io/allure/latest/#_attachments_3
     */
    private void makeScreenshot() {
        byte[] screenShot = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        Allure.getLifecycle().addAttachment("Page screenshot", "image/png", "png", screenShot);
    }

}
