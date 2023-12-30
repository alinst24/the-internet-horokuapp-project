package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ABTestingPage {

    public WebDriver driver;

    public ABTestingPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//a[text()='A/B Testing']")
    public WebElement abTesting;

    @FindBy (xpath = "//h3[1]")                                  // identificare dupa pozitie (pentru ca este un text dinamic)
    public WebElement mesajTopHeader;

    @FindBy (xpath = "//p[contains(text(), 'simultaneously')]")
    public WebElement mesajContinut;

    public void abTestingClick(){
        abTesting.click();
    }
    public void validareMesaje(String mesaj1, String mesaj2, String expectedmessageContinut){
        String expectedMessageTopHeaderVariant1 = mesaj1;
        String expectedmessagetopheaderVariant2 = mesaj2;
        String actualMessageTopHeader=mesajTopHeader.getText();
        Assert.assertTrue(actualMessageTopHeader.equals(expectedMessageTopHeaderVariant1) || actualMessageTopHeader.equals(expectedmessagetopheaderVariant2));                   //Conditie booleana, daca mesajulActual este varianta1 sau varianta2

        String expectedMessageContinut = expectedmessageContinut;
        String actualMessageContinut= mesajContinut.getText();
        Assert.assertEquals(actualMessageContinut,expectedMessageContinut);
    }
}
