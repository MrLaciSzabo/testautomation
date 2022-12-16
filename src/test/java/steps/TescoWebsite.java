package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TescoWebsite {


    private WebDriver driver;
    private WebDriverWait wait;
    private final static String MAIN_PAGE_URL = "https://bevasarlas.tesco.hu";
    private final static String TESCO_TITLE = "Tesco Bevasarlas";

    @Before
    //kikerülöm a automaták tiltását
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriverManager.chromedriver().setup();
        Configuration.browserCapabilities = options;

        System.out.println("setup code");
    }

    @After
    public void cleanup() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.quit();
    }

    @Given("Main page open")
    public void openMainPage() {
        MainPage mainPage = open(MAIN_PAGE_URL, MainPage.class);
        mainPage.validateMainPage(TESCO_TITLE);
    }

    @And("language is set to english")
    public void languageIsSetTo() {
        MainPage homePage = new MainPage();
        homePage.isSetToEnglish();
    }
    @When("Accepting cookies")
    public void MainPage() {
        MainPage mainPage = new MainPage();
        mainPage.acceptCookies();
    }
    @Then("The cookie panel closes")
    public void theCookiePanelCloses() {
        MainPage homePage = new MainPage();
        homePage.cookiePanelHidden();
    }
    @When("Signing up process")
    public void user_registers() {
        MainPage mainPage = new MainPage();
        RegPage1 regPage1 = mainPage.clickOnRegisterButton();
        RegPage2 regPage2 = regPage1.setRegProcess1();
        RegPage3 regPage3 = regPage2.setRegProcess2();
        ConfirmPage confirmPage = regPage3.setRegProcess3();
    }
    @Then("The user registered")
    public void theUserWillHaveAProfile() {
        assertTrue($("#utility-header-orders-link").isDisplayed());
    }

}
