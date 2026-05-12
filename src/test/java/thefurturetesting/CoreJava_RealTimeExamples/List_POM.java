package thefurturetesting.CoreJava_RealTimeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class List_POM {

    public WebDriver driver;

//    public List_POM(WebDriver driver){
//        this.driver = driver;
//    }

    @Test
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> listName = driver.findElements(By.tagName("a"));

        System.out.println(listName.size());
    }

}
