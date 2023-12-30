package Tests;

import Pages.CheckboxesPage;
import ShareData.ShareData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes extends ShareData {

    // 6. Test case: Selecteaza primul checkbox si debifeaza-l pe al doilea       + Validare.

    @Test
    public void metodaTest(){
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.checkboxesInterract();
        // Verific starea initiala a checkbox-urilor:
        Boolean initialStateCheckbox1 = checkboxesPage.isCheckbox1Checked();
        Boolean initialStateCheckbox2 = checkboxesPage.isCheckbox2Checked();

        checkboxesPage.checkbox1Interract();
        checkboxesPage.checkbox2Interract();
        // Validez starea finala a checkbox-urilor
        Boolean finalStateCheckbox1 = checkboxesPage.isCheckbox1Checked();
        Boolean finalStateCheckbox2 = checkboxesPage.isCheckbox2Checked();

        // Verificare starea initiala si finala
        Assert.assertNotEquals(initialStateCheckbox1, finalStateCheckbox1);                                          // Assert.assertNotEquals verifica daca cei 2 parametrii sunt diferiti.
        Assert.assertNotEquals(initialStateCheckbox2, finalStateCheckbox2);

        // Assert.assertEquals verifica daca cei 2 parametrii sunt identici   (ceea ce e fals in testul meu)
    }
}
