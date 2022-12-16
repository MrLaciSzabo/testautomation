package pages;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class ConfirmPage {
    public MainPage setConfirmReg() {
        return null;
    }

    public void confirmReg() {
        assertTrue($("#utility-header-orders-link").isDisplayed());
    }
}
