package bank.stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager;

public class HomePageSteps {

    WebDriver driver;
    HomePageObject homePage;

    public HomePageSteps() {
        driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePage(driver);
    }

    @Then("Home page displayed")
    public void homePageDisplayed() {
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed());

    }
}
