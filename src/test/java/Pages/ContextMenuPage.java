package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContextMenuPage {

    public WebDriver driver;

    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Context Menu']")
    public WebElement contextmenu;

    @FindBy(id = "hot-spot")
    public WebElement alertBox;

    public void interractContextMenu(){
        contextmenu.click();
    }

    public void interractAlertBox(){
        Actions action = new Actions(driver);
        action.contextClick(alertBox).perform();
    }

    public void interractAlert(String alertText){
        Alert alert=driver.switchTo().alert();
        String expectedAlertText = alert.getText() ;
        Assert.assertEquals(alertText,expectedAlertText);
        alert.accept();


// Nu functioneaza sa elimin click dreapta persistent :


//        WebElement outsideElement = driver.findElement(By.tagName("body"));
//        outsideElement.click();
//
//        Actions action = new Actions(driver);
//        action.moveToElement(alertBox).click().perform();


//        Actions action = new Actions(driver);                       // Aici nu functioneaza asta, dar aceasta actiune face un click pe anumite coordonate ale paginii: 0,0 = margine
//        action.moveByOffset(0,0).click().perform();
    }
}
