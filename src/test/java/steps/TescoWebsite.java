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

    
    @Given("open main page")
    public void openMainPage() {

    }

    @And("accept cookies")
    public void acceptCookies() {
    }

    @Given("language is set to hungarian")
    public void languageIsSetToHungarian() {
    }

    @When("change the language to english")
    public void changeTheLanguageToEnglish() {
    }

    @Then("it shows elements in english language")
    public void itShowsElementsInEnglishLanguage() {
    }


    @And("cookies are set")
    public void cookiesAreSet() {
    }
}
