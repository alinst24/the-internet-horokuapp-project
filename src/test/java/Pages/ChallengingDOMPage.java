package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ChallengingDOMPage {

    public WebDriver driver;

    public ChallengingDOMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Challenging DOM']")
    public WebElement challengingInterract;

    @FindBy(css = "a[class='button']")
    public WebElement button1blue;

    @FindBy(css = "a[class='button alert']")
    public WebElement button2red;

    @FindBy(css = "a[class='button success']")
    public WebElement button3green;

    @FindBy(css = ".large-10>table>tbody")
    // Cand folosesc className trebuie specificat doar un cuvant sau eventual 2 LEGATE!!! Niciodata 2 cuvinte cu spatiu ca altfel considera ca sunt 2 clase separate.
    public List<WebElement> table;
    @FindBy(css = ".large-10>table>tbody>tr")
    // . folosit pentru clasa !, si am coborat astfel inca sa iau doar randurile din tabel , nu si primul rand de sus
    public List<WebElement> rows;

    public void challengingClick() {
        challengingInterract.click();
    }

    public void clickButtons() {
        button1blue.click();
        button2red.click();
        button3green.click();
    }

    public void validareRanduri(Integer numarRanduri) {
        Integer expectedrowsNumber = numarRanduri;
        Assert.assertEquals(rows.size(), expectedrowsNumber);
    }

    public void validareContinut(String[] valuesFind1, String[] valuesFind2, String[] valuesFind3, String[] valuesFind4, String[] valuesFind5, String[] valuesFind6, String[] valuesFind7, String[] valuesFind8, String[] valuesFind9,String[] valuesFind10) {
        String row1Text = rows.get(0).getText();           // Un string care ia textul de pe prima pozitie a tabelului , si asa mai departe
        String row2Text = rows.get(1).getText();
        String row3Text = rows.get(2).getText();
        String row4Text = rows.get(3).getText();
        String row5Text = rows.get(4).getText();
        String row6Text = rows.get(5).getText();
        String row7Text = rows.get(6).getText();
        String row8Text = rows.get(7).getText();
        String row9Text = rows.get(8).getText();
        String row10Text = rows.get(9).getText();
        for (String valoare1 : valuesFind1) {               // o metoda for in care variabila "valoare" parcurge "valuesFind" care este un sir de string-uri, iar assertul :   daca randul 1 contine variabila "valoare" care va lua pe rand fiecare valoare din sirul de stringuri
            Assert.assertTrue(row1Text.contains(valoare1));
        }
        for (String valoare2 : valuesFind2) {
            Assert.assertTrue(row2Text.contains(valoare2));
        }
        for (String valoare3 : valuesFind3) {
            Assert.assertTrue(row3Text.contains(valoare3));
        }
        for (String valoare4 : valuesFind4) {
            Assert.assertTrue(row4Text.contains(valoare4));
        }
        for (String valoare5 : valuesFind5) {
            Assert.assertTrue(row5Text.contains(valoare5));
        }
        for (String valoare6 : valuesFind6) {
            Assert.assertTrue(row6Text.contains(valoare6));
        }
        for (String valoare7 : valuesFind7) {
            Assert.assertTrue(row7Text.contains(valoare7));
        }
        for (String valoare8 : valuesFind8) {
            Assert.assertTrue(row8Text.contains(valoare8));
        }
        for (String valoare9 : valuesFind9) {
            Assert.assertTrue(row9Text.contains(valoare9));
        }
        for (String valoare10 : valuesFind10) {
            Assert.assertTrue(row10Text.contains(valoare10));
        }
    }
    //SAU : REFACTORIZATA ACEASTA METODA :
//    public void validareContinut(String[][] valuesFind) {
//        for (int i = 0; i < valuesFind.length; i++) {
//            String rowText = rows.get(i).getText();
//            for (String valoare : valuesFind[i]) {
//                boolean valoareGasita = rowText.contains(valoare);
//                Assert.assertTrue(valoareGasita, "Textul '" + valoare + "' nu a fost găsit în rândul " + (i + 1));
//            }
//        }
//    }
}
