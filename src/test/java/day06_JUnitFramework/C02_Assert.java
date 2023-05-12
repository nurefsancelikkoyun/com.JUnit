package day06_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assert {

    //Amazon'a gidip title'ın Amazon içerdiğini test edin
    @Test
    public void test01(){
        /*
        JUnit calıştırılan test method(lar)ından kaç tanesinin
        passed,failed veya ignore olduğunu otomatik olarak raporlar

        Eğer JUnit'in test sonuçlarını doğru olarak raporlamasıı istiyorsak
        Assert class'indan hazır method'lar kullanarak test yapmalıyız
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        String expectedIcerik ="AMAZON";
        String actualTitle =driver.getTitle();
        /*
        if (expectedIcerik.contains(actualTitle)){
            System.out.println("Title Testi PASSED");
        } else {
            System.out.println("Actual Title : "+ actualTitle);
            System.out.println("Title testi PASSED");
        }
        driver.close();


         */
    }
}
