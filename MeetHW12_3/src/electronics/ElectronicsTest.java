package electronics;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import unit.Utility;

public class ElectronicsTest extends Utility {
    String url="https://demo.nopcommerce.com/";

    @Before
    public void open(){
        openBrowser(url);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        Actions action = new Actions(driver);

        WebElement ele = driver.findElement(By.xpath("(//div[2]/ul/li[2]/a[contains(text(),\"Electronics\")])[1]"));

        click2(By.xpath("(//div[2]/ul/li[2]/ul/li[2]/a[contains(text(),\"Cell phones \")])[1]"));

        Thread.sleep(2000);
        //click2(By.xpath("//a[@class='viewmode-icon list selected']"));
        WebElement grid = driver.findElement(By.xpath("//div[@class='product-viewmode']/a[2]"));
        grid.click();

       // click2(By.xpath("(//h2)[3]"));
        Thread.sleep(2000);
        WebElement nok = driver.findElement(By.xpath("//img[@alt='Picture of Nokia Lumia 1020']"));
        nok.click();

        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).sendKeys(Keys.DELETE);

        WebElement qty = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        qty.sendKeys("2");

        WebElement acart = driver.findElement(By.xpath("//button[@id='add-to-cart-button-20']"));
        acart.click();
        Thread.sleep(3000);

        WebElement scart = driver.findElement(By.xpath("//div/ul/li[4]/a/span[1]"));

        click2(By.xpath("//button[@class='button-1 cart-button']"));




    }
}
