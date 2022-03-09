package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class LoginPageObject extends BasePage {

    private WebDriver driver;

    public LoginPageObject(WebDriver driver){
        this.driver = driver;
    }

    public String getLoginPageUrl() {
        return getPageURL(driver);
    }

    public RegisterPageObject clickToHereLink() {
        waitForElementClickable(driver, LoginPageUI.HERE_LINK);
        clickToElement(driver, LoginPageUI.HERE_LINK);
        return PageGeneratorManager.getRegisterPage(driver);
    }

    public void inputToUserIDTextbox(String userIDValue) {
        waitForAllElementsVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, userIDValue);
    }

    public void inputToPasswordTextbox(String passwordValue) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
    }

    public HomePageObject clickToLoginButton() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return PageGeneratorManager.getHomePage(driver);
    }

    public String getDriver(){
        return driver.toString();
    }

}
