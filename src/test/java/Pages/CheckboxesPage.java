package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {

    public WebDriver driver;

    public CheckboxesPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Checkboxes']")
    public WebElement checkboxes;

    @FindBy(xpath = "//form/input[1]")             // Checkbox-urile aveau acelasi input, si a trebuit sa recurg la xPath
    public WebElement checkbox1;

    @FindBy(xpath = "//form/input[2]")
    public WebElement checkbox2;

    public void checkboxesInterract(){
        checkboxes.click();
    }

    public void checkbox1Interract(){
        checkbox1.click();
    }

    public void checkbox2Interract(){
        checkbox2.click();
    }

    public boolean isCheckbox1Checked(){              // metode care verifica daca checkbox-urile sunt bifate. Acestea folosesc metoda "isSelected()".
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Checked() {
        return checkbox2.isSelected();
    }
}
