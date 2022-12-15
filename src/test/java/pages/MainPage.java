package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class MainPage {
    SelenideElement acceptCookiesButton = $(".beans-cookies-notification__form:nth-child(1)");
    SelenideElement languageSelector = $("#utility-header-language-switch-link>span>span");

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

        SelenideElement registerButton = null;
        registerButton.click();
        return new RegPage1();
    }

}
