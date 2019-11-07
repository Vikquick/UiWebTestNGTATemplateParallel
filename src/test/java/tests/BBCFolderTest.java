package tests;

import io.qameta.allure.Feature;

import org.testng.annotations.Test;
import pages.BBCNewsHomepage;
import pages.LocalWeatherpage;

@Feature("BBC News folder navigation")
public class BBCFolderTest extends TestBase {
    private BBCNewsHomepage bbcNewsHomepage = new BBCNewsHomepage();
    private LocalWeatherpage localWeatherpage = new LocalWeatherpage();

    @Test(description = "Third user on the BBC page navigates to the local weather via the topbar")
    void openSiteAndNavigateToWeatherThird() {
        bbcNewsHomepage.openSite();
        bbcNewsHomepage.clickMore();
        bbcNewsHomepage.clickWeather();
        localWeatherpage.checkTitleVisibility();
    }

    @Test(description = "Fourth user on the BBC page navigates to the local weather via the topbar")
    void openSiteAndNavigateToWeatherFourth() {
        bbcNewsHomepage.openSite();
        bbcNewsHomepage.clickMore();
        bbcNewsHomepage.clickWeather();
        localWeatherpage.checkTitleVisibility();
    }
}
