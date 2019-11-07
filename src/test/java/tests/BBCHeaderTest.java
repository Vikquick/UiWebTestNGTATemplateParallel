package tests;

import io.qameta.allure.Feature;

import org.testng.annotations.Test;
import pages.BBCNewsHomepage;
import pages.LocalWeatherpage;

@Feature("BBC News header navigation")
public class BBCHeaderTest extends TestBase{
    private BBCNewsHomepage bbcNewsHomepage = new BBCNewsHomepage();
    private LocalWeatherpage localWeatherpage = new LocalWeatherpage();

    @Test(description = "First user on the BBC page navigates to the local weather via the topbar")
    void openSiteAndNavigateToWeatherFirst() {
        bbcNewsHomepage.openSite();
        bbcNewsHomepage.clickMore();
        bbcNewsHomepage.clickWeather();
        localWeatherpage.checkTitleVisibility();
    }

    @Test(description = "Second user on the BBC page navigates to the local weather via the topbar")
    void openSiteAndNavigateToWeatherSecond() {
        bbcNewsHomepage.openSite();
        bbcNewsHomepage.clickMore();
        bbcNewsHomepage.clickWeather();
        localWeatherpage.checkTitleVisibility();
    }
}