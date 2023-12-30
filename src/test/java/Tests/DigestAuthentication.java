package Tests;

import Pages.DigestAuthenticationPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class DigestAuthentication extends ShareData {

    // 8. Test case : interactionare cu digest Authentication                  // RestAssured

    @Test
    public void metodaTest(){
        DigestAuthenticationPage digestAuthentication = new DigestAuthenticationPage(driver);
        digestAuthentication.clickDigestAuthentication();
    }
}
