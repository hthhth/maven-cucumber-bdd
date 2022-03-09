package bank.stepDefinitions;

import commons.DataHelper;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;

public class RegisterPageSteps {

    WebDriver driver;
    RegisterPageObject registerPage;
    static String username, password;
    DataHelper dataTest;

    public RegisterPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        registerPage = PageGeneratorManager.getRegisterPage(driver);
        dataTest = DataHelper.getData();
    }

    @When("Input to email textbox")
    public void inputToEmailTextbox() {
         registerPage.inputToEmailTextbox(new DataHelper().getEmail());
    }

    @When("Click to Submit")
    public void clickToSubmit() {
        registerPage.clickToSubmitButton();
    }

    @When("Get User and password infor")
    public void getUserAndPasswordInfor() {
         username = registerPage.getUserIDText();
         password = registerPage.getPasswordText();
    }
    @When("Back to Login page")
    public void backToLoginPage() {
        registerPage.openLoginPage(LoginPageSteps.loginPageUrl);
        
    }
}
