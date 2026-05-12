package thefurturetesting.CoreJava_RealTimeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
In our framework, We are follow the Page Object Model where
each application page is maintained as a separate java class.

For example:
    LoginPage class
    DashboardPage class
    HomePage class

This improve:
    Maintainability
    Reusability
    Readability
    Scalability

    Whenever locator changes, we are update only in one page class instead of multiple test scripts
 */
public class LoginPage {

    WebDriver driver;


    By userName = By.id("user");
    By password = By.id("pass");
    By loginButton = By.id("login");

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

public void login(String uname,String pwd){

        driver.findElement(userName).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
}
}
