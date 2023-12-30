package Tests;

import Pages.ContextMenuPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class ContextMenu extends ShareData {

// 7. Test case :  click dreapta pe alertBox , validare text alerta , accept , revenire pe pagina

    @Test
    public void metodaTest(){
        ContextMenuPage contextMenuPage= new ContextMenuPage(driver);
        contextMenuPage.interractContextMenu();
        contextMenuPage.interractAlertBox();
        String alertText = "You selected a context menu";
        contextMenuPage.interractAlert(alertText);
    }
}
