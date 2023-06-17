package computer;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import unit.Utility;

public class TestSuite extends Utility {

    String url = "https://demo.nopcommerce.com/";

    @Before
    public void open() {
        openBrowser(url);
    }

    @Test
    public void name() {

        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[contains(text(),\"Computers\")]"));

        WebElement showme = driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/ul[1]/li[1]/a[contains(text(),\"Desktops\")]"));
        showme.click();


        WebElement desk = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select select = new Select(desk);
        select.selectByVisibleText("Name: Z to A");


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[contains(text(),\"Computers\")]"));

        WebElement showme = driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/ul[1]/li[1]/a[contains(text(),\"Desktops\")]"));
        showme.click();


        WebElement desk = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select select = new Select(desk);
        select.selectByVisibleText("Name: A to Z");
        Thread.sleep(2000);

        //click2(By.xpath("//h2/a[contains(text(),\"Build your own computer\")]"));  //click on Build your own computer
        WebElement sss = driver.findElement(By.xpath("//div[@class=\"details\"]/h2[@class=\"product-title\"]/a[contains(text(),\"Build your own computer\")]"));
        sss.click();

        WebElement desk1 = driver.findElement(By.xpath("//select[@id='product_attribute_1']"));
        Select select1 = new Select(desk1);
        select1.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");


        WebElement desk2 = driver.findElement(By.xpath("//select[@name='product_attribute_2']"));
        Select select2 = new Select(desk2);
        select2.selectByVisibleText("8GB [+$60.00]");

        click2(By.xpath("//input[@id='product_attribute_3_7']"));

        click2(By.xpath("//input[@id='product_attribute_4_9']"));

        click2(By.xpath("//input[@id='product_attribute_5_12']"));

        click2(By.xpath("//button[@id='add-to-cart-button-1']"));
        Thread.sleep(2000);

        WebElement shopping = driver.findElement(By.xpath("//div/ul/li[4]/a/span[1]"));

        click2(By.xpath("//button[@class='button-1 cart-button']"));

        WebElement qty = driver.findElement(By.xpath("//input[@id='itemquantity11220']"));
        qty.sendKeys("2");

        click2(By.xpath("//button[@id='updatecart']"));

        //click2(By.xpath("//input[@id='product_attribute_3_6']"));






    }
}
