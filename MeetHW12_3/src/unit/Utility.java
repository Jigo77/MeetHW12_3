package unit;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    public void click2(By by){
        WebElement cl = driver.findElement(by);
        cl.click();
    }           
}
