package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.RegisterPageUI;

public class RegisterPageObject extends BasePage {

    private WebDriver driver;

    public RegisterPageObject(WebDriver driver){
        this.driver = driver;
    }

    public String getUserIDText() {
        waitForElementVisible(driver, RegisterPageUI.USER_ID_TEXT);
        return getElementText(driver, RegisterPageUI.USER_ID_TEXT);
    }

    public String getPasswordText() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
        return getElementText(driver, RegisterPageUI.PASSWORD_TEXT);
    }

    public String getDriver(){
        return driver.toString();
    }


    public void inputToEmailTextbox(String email) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void clickToSubmitButton() {
        waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
    }

    public void openLoginPage(String loginPageUrl) {
        openPageURL(driver, loginPageUrl);
    }
}
