package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareData {

    public WebDriver driver;

    @BeforeMethod
    public void setupBeforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void setupAfterMethod(){
//        driver.quit();
//    }
}
