package tests;

import helpers.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginTests {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-blink-features=AutomationControlled");

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingPort(9515)
                .build();

        driver = new ChromeDriver(service, options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
    }


    @Test(priority = 1)
    public void validLogin() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
    }

    @Test(priority = 2)
    public void invalidLogin() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("wrong_password");
        loginPage.clickLogin();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test(priority = 3)
    public void blankUsername() {
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Epic sadface: Username is required");
    }

    @Test(priority = 4)
    public void blankPassword() {
        loginPage.enterUsername("standard_user");
        loginPage.clickLogin();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Epic sadface: Password is required");
    }

    @Test(priority = 5)
    public void lockedOutUser() {
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Epic sadface: Sorry, this user has been locked out.");
    }
    @Test(priority = 6)
    public void problemUser() {
        loginPage.enterUsername("problem_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
        String imageUrl = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
        int responseCode = HelperClass.getStatusCodeForUrl(imageUrl);

        Assert.assertEquals(responseCode, 200, "The image that made the problem is loaded");

    }
    @Test(priority = 7)
    public void errorUser() {
        loginPage.enterUsername("error_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
        String imageUrl = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
        int responseCode = HelperClass.getStatusCodeForUrl(imageUrl);

        Assert.assertEquals(responseCode, 200, "The image that made the problem is loaded");
    }
    @Test(priority = 8)
    public void performanceGlitchUser() {
        loginPage.enterUsername("performance_glitch_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        boolean isPageLoadedWithinTime = HelperClass.isPageLoadedWithinTime(driver, 3);
        Assert.assertTrue(isPageLoadedWithinTime, "Page load took longer than 3 seconds");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
