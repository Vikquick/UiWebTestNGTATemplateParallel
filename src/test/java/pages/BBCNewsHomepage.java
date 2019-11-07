package pages;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BBCNewsHomepage {

    public SelenideElement more = $(By.linkText("More"));
    public  SelenideElement weather = $(By.linkText("Weather"));

    @Step
    public void clickMore(){
        more.click();
    }

    @Step
    public void clickWeather(){
        weather.click();
    }

    @Step
    public void openSite(){
        open("https://www.bbc.com/news");
    }
}
