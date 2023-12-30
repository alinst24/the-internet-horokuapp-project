package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigestAuthenticationPage {

    public WebDriver driver;

    public DigestAuthenticationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Digest Authentication']")
    public WebElement digestAuthentication;

    public void clickDigestAuthentication(){
        digestAuthentication.click();
    }
}
