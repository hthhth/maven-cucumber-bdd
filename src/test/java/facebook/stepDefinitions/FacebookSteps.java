package facebook.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FacebookSteps {
    WebDriver driver;

    @Before("@parameter_feature")
    public void openFacebookApplication() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After("@parameter_feature")
    public void closeApplication() {
        driver.quit();
    }

    @When("Input to Username textbox")
    public void inputToUsernameTextbox() {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("auto@gmail.com");
    }
    @When("Input to Password textbox")
    public void inputToPasswordTextbox() {
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123456");
    }

    @When("Input to Username textbox with {string}")
    public void inputToUsernameTextboxWith(String email) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
    }
    @When("Input to Password textbox with {string}")
    public void inputToPasswordTextboxWith(String password) {
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @When("Input to Username textbox with {string} and Password textbox with {string}")
    public void inputToUsernameTextboxWithAndPasswordTextboxWith(String email, String password) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }
    @When("Input to Username and Password")
    public void inputToUsernameAndPassword(DataTable dataTable) {
//        List<Map<String, String>> customer = dataTable.asMaps(String.class, String.class);
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys(customer.get(0).get("Username"));
//        driver.findElement(By.id("pass")).clear();
//        driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("Password"));

        for (Map<String, String> customer : dataTable.asMaps(String.class, String.class)) {
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(customer.get("Username"));
            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys(customer.get("Password"));
        }

    }
    @When("Click to Submit button")
    public void clickToSubmitButton() {
        driver.findElement(By.name("login")).click();
    }

}