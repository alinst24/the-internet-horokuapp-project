package Tests;

import Pages.ABTestingPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class ABTesting extends ShareData {

    // 1. Test case: click pe ABTesting si validarea mesajelor dinamice ( mesajul din header se modifica A/B)

    @Test
    public void metodaTest(){

        ABTestingPage abTestingPage = new ABTestingPage(driver);
        abTestingPage.abTestingClick();
        String expectedMessageTopHeaderVariant1 = "A/B Test Variation 1";
        String expectedMessageTopHeaderVariant2= "A/B Test Control";
        String expectedMessageContinut ="Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        abTestingPage.validareMesaje(expectedMessageTopHeaderVariant1,expectedMessageTopHeaderVariant2,expectedMessageContinut);
    }

}
