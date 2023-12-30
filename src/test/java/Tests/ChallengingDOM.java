package Tests;

import Pages.ChallengingDOMPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class ChallengingDOM extends ShareData {

    //5. Test case: click butoane+ validare tabel(randuri + continut)

    @Test
    public void metodaTest(){
        ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(driver);
        challengingDOMPage.challengingClick();
        challengingDOMPage.clickButtons();
        Integer rowsNumber= 10;                                 // validare cate randuri exista in tabel
        challengingDOMPage.validareRanduri(rowsNumber);
        String[] row1text = {"Iuvaret0", "Apeirian0", "Adipisci0","Definiebas0","Consequuntur0","Phaedrum0"};   // Pentru validarea continutului de pe un rand am folosit un sir de string-uri
        String[] row2text = {"Iuvaret1", "Apeirian1", "Adipisci1","Definiebas1","Consequuntur1","Phaedrum1"};
        String[] row3text = {"Iuvaret2", "Apeirian2", "Adipisci2","Definiebas2","Consequuntur2","Phaedrum2"};
        String[] row4text = {"Iuvaret3", "Apeirian3", "Adipisci3","Definiebas3","Consequuntur3","Phaedrum3"};
        String[] row5text = {"Iuvaret4", "Apeirian4", "Adipisci4","Definiebas4","Consequuntur4","Phaedrum4"};
        String[] row6text = {"Iuvaret5", "Apeirian5", "Adipisci5","Definiebas5","Consequuntur5","Phaedrum5"};
        String[] row7text = {"Iuvaret6", "Apeirian6", "Adipisci6","Definiebas6","Consequuntur6","Phaedrum6"};
        String[] row8text = {"Iuvaret7", "Apeirian7", "Adipisci7","Definiebas7","Consequuntur7","Phaedrum7"};
        String[] row9text = {"Iuvaret8", "Apeirian8", "Adipisci8","Definiebas8","Consequuntur8","Phaedrum8"};
        String[] row10text = {"Iuvaret9", "Apeirian9", "Adipisci9","Definiebas9","Consequuntur9","Phaedrum9"};
        challengingDOMPage.validareContinut(row1text,row2text,row3text,row4text,row5text,row6text,row7text,row8text,row9text,row10text);
    }
}
