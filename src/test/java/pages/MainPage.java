package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class MainPage {
    SelenideElement signInButton = $("#utility-header-login-link");
    //SelenideElement acceptCookiesButton = $(Selectors.byXpath("//form[@class='beans-cookies-notification__form'][1]//button"));
    SelenideElement acceptCookiesButton = $(".beans-cookies-notification__form:nth-child(1)");

    SelenideElement languageSelector = $("#utility-header-language-switch-link>span>span");

    SelenideElement searchBox = $("#search-input");

    SelenideElement welcomeHeader = $("#utility-header-greetings");

    SelenideElement signOutButton = $("#utility-header-logout-link");

    SelenideElement searchButton = $("#search-form>button");

    public void acceptCookies(){
        acceptCookiesButton.click();
    }

    public void setDesiredLanguage(String lang){
        languageSelector.shouldBe(visible).shouldBe(enabled);
        if (lang.equals(languageSelector.getText())){
            languageSelector.click();
        }
        assertNotEquals(lang,languageSelector.getText());
    }

    public void validateMainPage(String title){
        assertEquals(title,Selenide.title());
    }

    public RegPage1 clickOnRegisterButton(String registerText){
        validateRegisterInButton(RegisterText);
        signInButton.click();
        return new RegPage1();
    }

}
