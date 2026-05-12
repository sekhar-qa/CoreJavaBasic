package thefurturetesting.CoreJava_RealTimeExamples;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        launchBrowser();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin","admin123");

        closeBrowser();
    }

}
