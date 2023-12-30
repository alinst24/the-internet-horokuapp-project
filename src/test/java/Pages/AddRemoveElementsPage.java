package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveElementsPage {

    public WebDriver driver;

    public AddRemoveElementsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Add/Remove Elements']")
    public WebElement addRemoveElements;

    @FindBy(css = "button[onclick='addElement()']")
    public WebElement addElementButton;

    public void addRemoveElementsClick(){
        addRemoveElements.click();
    }

    public void performInterractions(Integer numberOfInterractions) {                    // metoda de test pentru a apasa de un anumit numar de ori pe AddElement
        for (Integer index = 0; index < numberOfInterractions; index++) {
            addElementButton.click();
        }
    }

    public void deleteActions(Integer buttonNr1, Integer buttonNr2, Integer buttonNr3){
        List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));         // metoda de test care contine o lista de webElemente identificate dupa clasa, pentru a face click(=delete) pe un anumit buton declarat in clasa de test
        deleteButtons.get(buttonNr1).click();
        deleteButtons.get(buttonNr2).click();
        deleteButtons.get(buttonNr3).click();

    }

}
