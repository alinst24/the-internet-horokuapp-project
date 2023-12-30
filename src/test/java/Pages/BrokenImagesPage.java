package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrokenImagesPage {

    public WebDriver driver;

    public BrokenImagesPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Broken Images']")
    public WebElement brokenImages;

    @FindBy(xpath = "//div[@class='example']//img")
    public List<WebElement> images;

    public void interractBrokenImages(){
        brokenImages.click();
    }

    public void brokenOrLoadedImages(){
        Integer brokenImagesCount = 0;
        Integer loadedImagesCount = 0;

        for (WebElement image : images) {                 // Declaram un webelement care sa itereze(= sa parcurga) prin lista "images"
            String src = image.getAttribute("src");               // Extragem textul atributului src
            if (src.contains("img/")) {                           // Daca src imaginilor contin "img/" , acelea ar trebui sa fie corecte.
                System.out.println("Imaginea cu src-ul: " + src + " s-a incarcat corect.");
                loadedImagesCount++;                    //Si astfel daca merge pe acest if, loadedimagescount va creste cu 1, altfel va merge pe else
            } else {
                System.out.println("Imaginea cu src-ul: " + src + " nu s-a incarcat corect.");
                brokenImagesCount++;
            }
        }
        // Sa vedem numarul total in consola:
        System.out.println("Numarul total de imagini incarcate corect: " + loadedImagesCount);
        System.out.println("Numarul total de imagini defecte: " + brokenImagesCount);
    }
}
