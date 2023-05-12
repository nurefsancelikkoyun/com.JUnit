package day08_testBase_JSalerts_iframe;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_TestBasIlkClass extends TestBase {

    @Test
    public void test01(){
        //amazona gidelim
        driver.get("https:/www.amazon.com");

        //Nutella için arama yapalım
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //arama sonuçlarının Nutella içerdiğini test edelim
        // arama sonuclarinin Nutella icerdigini test edelim
        String expectedicerik="Nutella";
        String actualAramaSonucYazisi= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedicerik));
    }


}
