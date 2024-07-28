package tests;

import Pages.EdenRedMainPage;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

import static utilities.Driver.driver;

public class Cookies extends Driver  {
    @Test
    public void cerez() {
        // EdenRed ana sayfasını açıyoruz
        Driver.getDriver().get("https://www.edenred.com.tr/");

        // EdenRed ana sayfa nesnesi oluşturuyoruz
        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        // Ana slider üzerindeki ilk sayfaya tıklıyoruz
        edenRedMainPage.mainSliderFirstPageDetailBtn.click();

        // Sitedeki mevcut çerez sayısını yazdırıyoruz
        System.out.println("Sitedeki Çerez Sayısı:" +driver .manage().getCookies().size());

        // Yeni bir çerez oluşturuyoruz ve ekliyoruz
        Cookie yenicookie = new Cookie("Yeni Eklenen Cookie", "Yeni Cookie");
        driver.manage().addCookie(yenicookie);

        // Tüm çerezleri yazdırıyoruz
        System.out.println(driver.manage().getCookies());

        // Çerez setini alıyoruz
        Set<Cookie> cookieSet = driver.manage().getCookies();

        // Yeni eklenen çerezin set içinde olup olmadığını kontrol ediyoruz
        System.out.println("Cookie Set yeni ekledigim Cookie'yi iceriyor : " + " "  + cookieSet.contains(yenicookie));


    }
}
