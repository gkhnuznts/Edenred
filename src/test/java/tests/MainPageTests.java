package tests;

import Pages.EdenRedMainPage; // EdenRedMainPage sınıfını içe aktarıyoruz
 // JUnit Assert sınıfını içe aktarıyoruz
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver; // Driver yardımcı sınıfını içe aktarıyoruz
import utilities.ReusableMethods;

import static utilities.Driver.driver;


public class MainPageTests extends Driver  {



    @Test
    public void mainPageSlider() {
        // EdenRed ana sayfasını açıyoruz
        Driver.getDriver().get("https://www.edenred.com.tr/");

        // EdenRed ana sayfa nesnesi oluşturuyoruz
        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        // Ana slider üzerindeki ilk sayfaya tıklıyoruz
        edenRedMainPage.mainSliderFirstPageDetailBtn.click();

        // Geçerli URL'de "bedeli" kelimesinin olup olmadığını kontrol ediyoruz ve yazdırıyoruz
        System.out.println("URL Günlük Yemek Bedeli :" +driver.getCurrentUrl().contains("bedeli"));

        driver.navigate().back();

        edenRedMainPage.secondPage.click();

        ReusableMethods.bekle(1);

        edenRedMainPage.mainSliderSecondPageDetailBtn.click();

        Assert.assertTrue(edenRedMainPage.teklifEkranıUcretsizTeklifBtn.isDisplayed());

        System.out.println(edenRedMainPage.teklifEkranıUcretsizTeklifBtn.getText());

        driver.navigate().back();
        ReusableMethods.bekle(1);

        edenRedMainPage.fourthPage.click();

        ReusableMethods.bekle(1);

        edenRedMainPage.mainSliderFourthPageDetailBtn.click();

        //ReusableMethods.bekle(3);

        System.out.println("URL Ticket Akaryakit Karti İceriyor :" + driver.getCurrentUrl().contains("ticket-akaryakit-karti"));

        driver.navigate().back();


        edenRedMainPage.fourthPage.click();

        ReusableMethods.bekle(1);

        edenRedMainPage.fuelCampaignSlideApplyNow.click();

        Assert.assertTrue(edenRedMainPage.fuelCompaniesOptions.isDisplayed());

        System.out.println("Akaryakit Sirketi Belirleme Sayfasi :" + edenRedMainPage.fuelCompaniesOptions.isDisplayed());


    }
}
