package pages;

import com.codeborne.selenide.SelenideElement;

import javax.security.auth.callback.ConfirmationCallback;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class RegPage3 {
        public ConfirmPage setRegProcess3() {

        SelenideElement firstName = $("#firstName");
        SelenideElement lastName = $("#lastName");
        SelenideElement primaryPhone = $("#primaryPhone");
        SelenideElement consentCheckBox = $(byXpath("//*[@id=\"personalDetails\"]/ul[4]/li/div/label"));
        SelenideElement regFinalizeBtn = $(byText("Yes, register me"));

        firstName.setValue("Teszt");
        lastName.click();
        lastName.sendKeys("User");
        primaryPhone.setValue("06123456789");

        consentCheckBox.click();
        regFinalizeBtn.click();
        return new ConfirmPage() {
            @Override
            public MainPage setRegConfirm() {
                return null;
            }
        };
    }
}
