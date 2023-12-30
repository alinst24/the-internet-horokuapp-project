package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;

public class BasicAuth extends ShareData {

    //3. Test case : ??????? Selenium grid ??????

    @Test
    public void metodaTest(){
        String username = "admin";
        String password = "admin";

        String urlWithCredentials = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";      // introducem credentialele de conectare in link pentru autentificare
        driver.get(urlWithCredentials);
    }
}
