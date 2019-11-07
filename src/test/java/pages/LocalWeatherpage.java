package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LocalWeatherpage {

    public SelenideElement title = $(By.className("asdasdsasdads"));

    @Step
    public void checkTitleVisibility() {
        title.shouldBe(Condition.visible);
    }
}
