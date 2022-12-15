package steps;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class TescoWebsite {


    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void user_registers() {
        RegPage1 regPage1 = open(...);
        RegPage2 regPage2 = regPage1.register();
        regPage2.register();
    }


}
