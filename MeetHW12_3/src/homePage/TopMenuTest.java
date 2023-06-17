package homePage;

import org.junit.Before;
import org.junit.Test;
import unit.Utility;

public class TopMenuTest extends Utility {
    String url = "https://demo.nopcommerce.com/";
    @Before
    public void open(){
        openBrowser(url);
    }
    public void selectMenu(String menu){

    }

    @Test
    public void verifyPageNavigation(){
        selectMenu("Desktop");
        //click2();

    }
}
