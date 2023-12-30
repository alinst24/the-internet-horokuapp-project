package Tests;

import Pages.AddRemoveElementsPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class AddRemoveElements extends ShareData {

    // 2. Test case :   Adaug 6 elemente si apoi le sterg pe : 1,3,5.

    @Test
    public void metodaTest(){

        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.addRemoveElementsClick();
        Integer numbersOfAddElement = 6;                                                   // De cate ori sa apese pe addElement
        addRemoveElementsPage.performInterractions(numbersOfAddElement);
        Integer firstDeleteButton = 1;                              // Pozitia butoanelor pe care sa le stearga
        Integer secondDeleteButton = 3;
        Integer thirdDeleteButton = 5;
        addRemoveElementsPage.deleteActions(firstDeleteButton,secondDeleteButton,thirdDeleteButton);
        }
    }

