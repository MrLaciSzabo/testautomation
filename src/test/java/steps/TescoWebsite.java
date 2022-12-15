package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.RegPage1;
import pages.RegPage2;

import static org.junit.Assert.assertEquals;

public class TescoWebsite {


    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    //kikerülöm a automaták tiltását
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriverManager.chromedriver().setup();
        Configuration.browserCapabilities = options;

        System.out.println("setup code");
    }

    @Given("Main page openeing")
    public void openMainPage() {
        MainPage mainPage = open(MainPageUrl, MainPage.class);
        String title = TescoTitle;
        mainPage.validateMainPage(title);
    }
    @And("Accepting cookies")
    public void MainPage() {
        MainPage mainPage = new MainPage();
        mainPage.acceptCookies();


    }
    @And("Clicking the Reigster button")
    public void user_registers() {
        RegPage1 regPage1 = open(...);
        RegPage2 regPage2 = regPage1.register();
        regPage2.register();
    }


}
