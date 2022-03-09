package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.HomePageUI;
import org.junit.Assert;

public class HomePageObject extends BasePage {

    private WebDriver driver;

    public HomePageObject(WebDriver driver){
        this.driver = driver;
    }

    public String getDriver(){
        return driver.toString();
    }

    public boolean isWelcomeMessageDisplayed() {
        waitForAllElementsVisible(driver, HomePageUI.WELCOME_MESSAGE_TEXT);
        return isElementDisplayed(driver, HomePageUI.WELCOME_MESSAGE_TEXT);
    }
}
