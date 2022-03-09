package bank.stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class LoginPageSteps {

    WebDriver driver;
    static String loginPageUrl;
    LoginPageObject loginPage;

    public LoginPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getLoginPage(driver);
    }

    @Given("Get login page url")
    public void getLoginPageUrl() {
        loginPageUrl = loginPage.getLoginPageUrl();
    }

    @When("Open Register page")
    public void openRegisterPage() {
        loginPage.clickToHereLink();

    }
    @When("Submit valid infor to login form")
    public void submitValidInforToLoginForm() {
        loginPage.inputToUserIDTextbox(RegisterPageSteps.username);;
        loginPage.inputToPasswordTextbox(RegisterPageSteps.password);
        loginPage.clickToLoginButton();

    }
}
