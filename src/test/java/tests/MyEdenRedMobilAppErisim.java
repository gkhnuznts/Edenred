package tests;

import Pages.EdenRedMainPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class MyEdenRedMobilAppErisim extends Driver  {


    @Test

    public void myEdenRedErisim(){


        Driver.getDriver().get("https://www.edenred.com.tr/");

        EdenRedMainPage edenRedMainPage = new EdenRedMainPage();

        Actions actions = new Actions(driver);

        actions.moveToElement(edenRedMainPage.referanslarimiz);
        actions.perform();

        edenRedMainPage.myEdenredKesfet.click();

        ReusableMethods.bekle(1);

        System.out.println("Edenred'i kesfedin uzerinden detay sayfasina gecildi :"+" " +
                edenRedMainPage.mainPageMyEdenredErisim.isDisplayed());



        /* String expectedh1 = "Ticket’ım yüklendi mi?";

        String actualh1 = edenRedMainPage.mainPageMyEdenredErisim.getText();

        Assert.assertEquals(expectedh1,actualh1);


         */

        Assert.assertTrue(edenRedMainPage.oglenNeredeYiyelim.isDisplayed());

        String expectedUrl = "Öğlen nerede yiyelim?";

        String actualUrl = edenRedMainPage.oglenNeredeYiyelim.getText();

        Assert.assertEquals(expectedUrl,actualUrl);





    }











}
