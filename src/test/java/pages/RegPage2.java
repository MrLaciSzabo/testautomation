package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
public class RegPage2 {
    public RegPage3 setRegProcess2() {
        SelenideElement regSubBtn = $(byText("Next"));

        SelenideElement countyDrop = $("#county");
        SelenideElement municipality = $("#municipality");
        SelenideElement postalCode = $("#postcode");
        SelenideElement street = $("#street");
        SelenideElement houseNumber = $("#housenumber");
        SelenideElement flatNumber = $("#flatnumber");
        SelenideElement addressName = $("#nickname");


        countyDrop.click();
        countyDrop.sendKeys("Cs");
        countyDrop.sendKeys(Keys.TAB);

        municipality.click();
        municipality.sendKeys("Szeged");
        municipality.sendKeys(Keys.TAB);

        postalCode.shouldBe(enabled, Duration.ofSeconds(10));
        postalCode.sendKeys("6710");
        postalCode.sendKeys(Keys.TAB);

        street.shouldBe(enabled, Duration.ofSeconds(30));
        street.sendKeys("Tisza");
        street.sendKeys(Keys.TAB);

        houseNumber.shouldBe(enabled, Duration.ofSeconds(10));
        postalCode.sendKeys("10");
        houseNumber.sendKeys(Keys.TAB);

        flatNumber.shouldBe(enabled, Duration.ofSeconds(10));
        postalCode.sendKeys("Teszt");
        houseNumber.sendKeys(Keys.TAB);

        addressName.shouldBe(enabled, Duration.ofSeconds(10)).click();
        addressName.sendKeys("Keco");
        regSubBtn.click();
        return new RegPage3();
    }


}
