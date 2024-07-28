package tests;

import Pages.EdenRedMainPage;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class MainPageMyAccount{


    @Test

    public void myAccountandItsMenu(){


        Driver.getDriver().get("https://www.edenred.com.tr/");

        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        Assert.assertTrue(edenRedMainPage.hesabim.isDisplayed());

        edenRedMainPage.hesabim.click();

        System.out.println("Hesabim URL'e gecis yapildi : " +  " "  +driver.getCurrentUrl().contains("hesabim"));







    }

    @Test(dependsOnMethods ="myAccountandItsMenu")

    public void ticketOnlineSirketler(){

        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        Assert.assertTrue(edenRedMainPage.ticketOnlineSirketler.isDisplayed());

        edenRedMainPage.ticketOnlineSirketler.click();

        System.out.println("online.ticket.com.tr ' ye gecis yapildi :" + " " +driver.getCurrentUrl().contains("online.ticket.com.tr"));

        driver.navigate().back();

        ReusableMethods.bekle(1);




    }

    @Test(dependsOnMethods = "ticketOnlineSirketler")

    public void uyeIsyerleri(){


        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        Assert.assertTrue(edenRedMainPage.membersRestCafes.isDisplayed());

        edenRedMainPage.membersRestCafes.click();

        System.out.println("Üye Isyerleri Giris Sayfasina Gecildi : " + " " +driver.getCurrentUrl().contains("isortaklari.edenred"));

        edenRedMainPage.uyeIsyerleriGirisVKNAlani.sendKeys("123456789");

        ReusableMethods.bekle(1);

        edenRedMainPage.uyeIsyerleriGirisTelNoAlani.sendKeys("5318732878");

        ReusableMethods.bekle(1);

        driver.navigate().back();

        ReusableMethods.bekle(2);


    }

    @Test(dependsOnMethods = "uyeIsyerleri")

    public void kartKullanicilari(){

        //Kart kullanıcıları menüsüne erişim ve var olmayan uye ile login olunamadığının kontrolü

        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        edenRedMainPage.kartKullanicilari.click();

        System.out.println("Login Bireysel URL e gecis yapildi :" + " " + driver.getCurrentUrl().contains("login-bireysel"));

        edenRedMainPage.kartKullanicilariUsernameArea.sendKeys("gkhnuznts@gmail.com");

        edenRedMainPage.kartKullanicilariPasswordArea.sendKeys("123456");

        edenRedMainPage.getKartKullanicilariGirisYapBtn.click();

        ReusableMethods.bekle(3);

        driver.switchTo().alert().accept();

        driver.quit();





    }

    
}
