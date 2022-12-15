package pages;

import com.codeborne.selenide.SelenideElement;

import java.util.UUID;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;
public class RegPage1 {

    // UI mezők
    //SelenideElement email = ${};
    SelenideElement stageNumber = $(".progress-bar__stage-number");
    SelenideElement regSubBtn = $(byText("Next"));

    public RegPage2 setRegProcess1() {
        SelenideElement inputEmail = $("#email");
        SelenideElement inputPass = $("#password");
        SelenideElement inputPassConf = $("#confirm-password");

        assertEquals("1", stageNumber.getText());
        UUID emailUUID = UUID.randomUUID();
        String randMail = emailUUID + "@test.it";

        inputEmail.setValue(randMail);
        inputPass.setValue("Q1w2e3r4");
        inputPassConf.setValue("Q1w2e3r4");
        regSubBtn.click();
        return new RegPage2();




    }

}
