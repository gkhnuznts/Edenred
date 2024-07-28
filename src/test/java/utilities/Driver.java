package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Driver {




    public static WebDriver driver;


    @BeforeClass
    public static WebDriver getDriver(){

        if (driver==null){

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().deleteAllCookies();

        }




        return driver;

    }

    @AfterClass

    public static void quitDriver(){

        driver.quit();
        driver=null;





    }







}
