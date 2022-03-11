package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.RegisterPageUI;

public class NewCustomerPageObject extends BasePage {

    private WebDriver driver;

    public NewCustomerPageObject(WebDriver driver){
        this.driver = driver;
    }


}
