package utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {


    public static List<String> stringListeDonustur(List<WebElement> donusturulecekListe){


        List<String >stringliste = new ArrayList<>();

        for (WebElement eachElement : donusturulecekListe){

            stringliste.add(eachElement.getText());


        }

        return stringliste;

    }


    public static void bekle(int saniye){

        //Thread.sleep ekledigimizde method signature a eklememek icin more actions > surround with try catch dedik.

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            System.out.println("Bekletme isleminde sorun oldu...");
        }




    }


}
