package Tests;

import Pages.BrokenImagesPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class BrokenImages extends ShareData {

    //4. Test case : Validare ce imagini sunt incarcate corect si care nu.

    @Test
    public void metodaTest(){
    BrokenImagesPage brokenImagesPage = new BrokenImagesPage(driver);
    brokenImagesPage.interractBrokenImages();
    brokenImagesPage.brokenOrLoadedImages();
    }
}
