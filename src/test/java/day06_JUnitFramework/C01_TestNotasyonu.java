package day06_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {

    /*
    Bu class içerisinde 3 test calılturalım
    1- google anasayfaya gidip, url'nin goggle içerdiğini test edin
    2- wisequarter anasayfaya gidip url'nin wisequarter içerdiğini test edin
    3-amazon anasayfaya gidip,amazon logosunun gorunduğunu test edin
     */

    /*
    JUnit'in bize sağladığı ilk ve belkide en önemli özellik
    test methodlarının bağımsız olarak calıştırlıabilmesini sağlayan
    @Test notasyonudur.

    JUnit ile class level'dan birden fazla test method'u calıştırırsak
    hangi sıralama ile calıştıracağını öngöremeyiz ve yönetemeyiz.

    Diyelim ki bir test method'u uzerinde calışıyorsunuz
    ve o method'un toplu calıştırılmalarda kullanılmasını istemiyorsanız
    @Ignore notasyonunu kullanabiliriz

     */
    WebDriver driver;
    @Test @Ignore
    public void googleTest(){
        // 1- google anasayfaya gidip, url'nin goggle içerdiğini test edin
        mahserin4atlısı();
        driver.get("https://www.google.com");
        String expectedIcerik ="google";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Google Testi PASSED");
        }else {
            System.out.println("Url goggle içermiyor,Goggle Testi FAILED");
        }

    }
    @Test
    public void  wiseTest(){
        //2- wisequarter anasayfaya gidip url'nin wisequarter içerdiğini test edin
        mahserin4atlısı();
        driver.get("https://www.wisequarter.com");
        String expectedIcerik ="wisequarter";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Wise Testi PASSED");
        }else {
            System.out.println("Url Wisequarter içermiyor,Wise Testi FAILED");
        }

    }
    @Test
    public void amazonTest(){
        //3-amazon anasayfaya gidip,amazon logosunun gorunduğunu test edin
        mahserin4atlısı();
        driver.get("https://www.amazon.com");
        WebElement amazonLogoElementi = driver.findElement(By.id("nav-logo-sprites"));
        if (amazonLogoElementi.isDisplayed()){
            System.out.println("Amazon testi PASSED");
        }else {
            System.out.println("Amazon testi FAILED");
        }
        driver.close();
    }
    public void mahserin4atlısı(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
