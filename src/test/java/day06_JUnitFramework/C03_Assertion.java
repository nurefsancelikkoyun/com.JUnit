package day06_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Assertion {
    /*
    Bir Assertion failed olursa
    Assertion'in olduğu satırda exception oluşur
    ve Assertion satırından sonraki kodlar calışmaz.
     */
    WebDriver driver;
    @Test

    public void googleTest(){
        // 1- google anasayfaya gidip, url'nin goggle içerdiğini test edin
        mahserin4atlısı();
        driver.get("https://www.google.com");
        String expectedIcerik ="google1";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));


    }
    @Test
    public void  wiseTest(){
        //2- wisequarter anasayfaya gidip url'nin wisequarter içerdiğini test edin
        mahserin4atlısı();
        driver.get("https://www.wisequarter.com");
        String expectedIcerik ="wisequarter1";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));

    }
    @Test
    public void amazonTest(){
        //3-amazon anasayfaya gidip,amazon logosunun gorunduğunu test edin
        mahserin4atlısı();
        driver.get("https://www.amazon.com");
        WebElement amazonLogoElementi = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(amazonLogoElementi.isDisplayed());

        driver.close();
    }
    public void mahserin4atlısı(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}
