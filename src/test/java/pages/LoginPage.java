package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage {
       // constructor for the web driver
        WebDriver driver;


        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        // web element locators
        By usernameField = By.id("user-name");
        By passwordField = By.id("password");
        By loginButton = By.id("login-button");
        By errorMessage = By.cssSelector(".error-message-container");

        // actions
        public void enterUsername(String username) {
            driver.findElement(usernameField).sendKeys(username);
        }

        public void enterPassword(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }

        public void clickLogin() {
            driver.findElement(loginButton).click();
        }

        public String getErrorMessage() {
            return driver.findElement(errorMessage).getText();
        }
    }

