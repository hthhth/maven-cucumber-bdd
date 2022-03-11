package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.CommonPageUI;

public class CommonPageObject extends BasePage {
    WebDriver driver;

    public CommonPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToDynamicTextbox(WebDriver driver, String labelName, String inputValue){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, labelName);
        if (labelName.equals("Date of Birth")) {
            removeAttributeInDOM(driver, CommonPageUI.DYNAMIC_TEXTBOX, "type", labelName);
            sleepInSeconds(1);
        }
        sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, inputValue, labelName);
    }

    public void inputToDynamicTextarea(WebDriver driver, String labelName, String inputValue){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA, labelName);
        sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA, inputValue, labelName);
    }

    public void clickToDynamicButton(WebDriver driver, String buttonLabel) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON, buttonLabel);
        clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON, buttonLabel);
    }

    public void clickToDynamicRadioButton(WebDriver driver, String radioButtonValue) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
        clickToElement(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
    }

    public void clickToDynamicLink(WebDriver driver, String linkPageName) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_LINK, linkPageName);
        clickToElement(driver, CommonPageUI.DYNAMIC_LINK, linkPageName);
    }

    public boolean isDynamicMessageDisplayed(WebDriver driver, String messageText){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, messageText);
        return isElementDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE, messageText);
    }

    public String getDynamicValueByRowLabel(WebDriver driver, String rowLabel){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_VALUE_BY_ROW_NAME, rowLabel);
        return getElementText(driver, CommonPageUI.DYNAMIC_VALUE_BY_ROW_NAME, rowLabel);
    }
}
