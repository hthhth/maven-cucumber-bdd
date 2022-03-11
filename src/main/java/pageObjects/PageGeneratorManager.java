package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    private static HomePageObject homePage;
    private static LoginPageObject loginPage;
    private static RegisterPageObject registerPage;
    private static NewCustomerPageObject newCustomerPage;
    private static EditCustomerPageObject editCustomerPage;
    private static CommonPageObject commonPage;

//    private static SearchPageObject searchPage;
//    private static MyAccountPageObject myAccountPage;
//    private static OrderPageObject orderPage;

    private PageGeneratorManager(){
    }
    public static HomePageObject getHomePage(WebDriver driver){
        if (homePage == null){
            homePage = new HomePageObject(driver);
        }
        return homePage;
//        return new HomePageObject(driver);
    }

    public static LoginPageObject getLoginPage(WebDriver driver){
        if (loginPage == null){
            loginPage = new LoginPageObject(driver);
        }
//        return new LoginPageObject(driver);
        return loginPage;
    }
    public static RegisterPageObject getRegisterPage(WebDriver driver){
        if (registerPage == null){
            registerPage = new RegisterPageObject(driver);
        }
//        return new RegisterPageObject(driver);
        return registerPage;
    }

    public static NewCustomerPageObject getNewCustomerPage(WebDriver driver){
        if (newCustomerPage == null){
            newCustomerPage = new NewCustomerPageObject(driver);
        }
        return newCustomerPage;
    }

    public static EditCustomerPageObject getEditCustomerPage(WebDriver driver){
        if (editCustomerPage == null){
            editCustomerPage = new EditCustomerPageObject(driver);
        }
        return editCustomerPage;
    }

    public static CommonPageObject getCommonPage(WebDriver driver){
        if (commonPage == null){
            commonPage = new CommonPageObject(driver);
        }
        return commonPage;
    }



//    public static SearchPageObject getSearchPage(WebDriver driver){
//        if (searchPage == null){
//            searchPage = new SearchPageObject(driver);
//        }
//        return new SearchPageObject(driver);
////        return searchPage;
//    }
//    public static MyAccountPageObject getMyAccountPage(WebDriver driver){
//        if (myAccountPage == null){
//            myAccountPage = new MyAccountPageObject(driver);
//        }
//        return new MyAccountPageObject(driver);
////        return myAccountPage;
//    }
//    public static OrderPageObject getOrderPage(WebDriver driver){
//        if (orderPage == null){
//            orderPage = new OrderPageObject(driver);
//        }
//        return new OrderPageObject(driver);
////        return orderPage;
//    }

}
