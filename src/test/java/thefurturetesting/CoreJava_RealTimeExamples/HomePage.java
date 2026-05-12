package thefurturetesting.CoreJava_RealTimeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

/*
Class is a Blueprint or template is used to create a Objects.
In java, Contains
Variables
Methods
Constructor

In our Hybrid POM Framework, every page is designed as a separate class

In Our framework, We are follow POM design pattern where each application page is maintained as separate java clss

For examples,
Loginpage class
HomePage class
DashboardPage Class

what is the improvement by using class

Maintainability
reusability
Readability
scalability

Whenever locators change, It will update obly one page instead of mutliple test scripts

In Framework like advance
Utils
Waitutils
Excelutils
ScreenshotsUtils
APUUtils

 */
    WebDriver driver;

    By userName = By.name("user");
    By passwod = By.name("pass");
    By homePageButton = By.name("home");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void homepageloginTest(String uname,String pwd){
        driver.findElement(userName).sendKeys(uname);
        driver.findElement(passwod).sendKeys(pwd);
        driver.findElement(homePageButton).click();
    }
}
