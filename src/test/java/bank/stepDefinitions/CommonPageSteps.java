package bank.stepDefinitions;

import commons.DataHelper;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.CommonPageObject;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager;

public class CommonPageSteps {

    WebDriver driver;
    CommonPageObject commonPage;
    DataHelper dataTest;
    String email;

    public CommonPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        commonPage = PageGeneratorManager.getCommonPage(driver);
        dataTest = DataHelper.getData();
        email = dataTest.getEmail();
    }

    @Given("Open {string} page")
    public void openPage(String pageName) {
        commonPage.clickToDynamicLink(driver, pageName);
        
    }
    @When("Input to {string} textbox with value {string}")
    public void inputToTextboxWithValue(String labelName, String inputValue) {
        if (labelName.equals("E-mail")) {
            inputValue = email;
        }
        commonPage.inputToDynamicTextbox(driver, labelName, inputValue);
    }
    @When("Click to {string} radio button")
    public void clickToRadioButton(String radioButtonValue) {
        commonPage.clickToDynamicRadioButton(driver, radioButtonValue);
        
    }
    @When("Input to {string} textarea with value {string}")
    public void inputToTextareaWithValue(String textAreaLabelName, String inputValue) {
        commonPage.inputToDynamicTextarea(driver, textAreaLabelName, inputValue);
        
    }
    @When("Click to {string} button")
    public void clickToButton(String buttonLabel) {
        commonPage.clickToDynamicButton(driver, buttonLabel);
        
    }
    @Then("Success message displays with {string}")
    public void successMessageDisplaysWith(String expectedSuccessMessage) {
        Assert.assertTrue(commonPage.isDynamicMessageDisplayed(driver, expectedSuccessMessage));
        
    }
    @Then("the valid value displays at {string} with {string}")
    public void theValidValueDisplaysAtWith(String labelName, String expectedValue) {
        if (labelName.equals("Email")) {
            expectedValue = email;
        }
        Assert.assertEquals(expectedValue, commonPage.getDynamicValueByRowLabel(driver, labelName));
    }

}
