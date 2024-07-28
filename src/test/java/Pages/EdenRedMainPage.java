package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class EdenRedMainPage {

    public EdenRedMainPage(){


        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "(//a[text()='DETAYLI BİLGİ İÇİN TIKLAYINIZ'])[1]")

    public WebElement mainSliderFirstPageDetailBtn;

    @FindBy(xpath = "(//li[@data-target='#carouselExampleIndicators'])[2]")

    public WebElement secondPage;


    @FindBy(xpath = "//a[@class='button button-cerulean slider-hover-button']")

    public WebElement mainSliderSecondPageDetailBtn;

    @FindBy(xpath = "//button[@class='button sub_button']")

    public WebElement teklifEkranıUcretsizTeklifBtn;

    @FindBy(xpath = "(//li[@data-target='#carouselExampleIndicators'])[3]")

    public WebElement thirdPage;

    @FindBy(xpath = "(//li[@data-target='#carouselExampleIndicators'])[4]")

    public WebElement fourthPage;

    @FindBy(xpath = "(//a[@class='button button-cerulean slider-hover-button'])[2]")

    public WebElement mainSliderFourthPageDetailBtn;

    @FindBy(xpath = "(//a[@class='button button-red'])[2]")

    public WebElement fuelCampaignSlideApplyNow;

    @FindBy(xpath = "(//div[@class='form-label'])[1]")

    public WebElement fuelCompaniesOptions;

    @FindBy(xpath = "//a[@class='button-link']")

    public WebElement hesabim;

    @FindBy(xpath = "(//div[@class='button-item'])[1]")

    public WebElement ticketOnlineSirketler;

    @FindBy(xpath = "(//div[@class='button-item'])[2]")

    public WebElement membersRestCafes;

    @FindBy(xpath = "//input[@placeholder='VKN numaranız']")

    public WebElement uyeIsyerleriGirisVKNAlani;

    @FindBy(xpath = "//input[@placeholder='(5__) ___ __ __']")

    public WebElement uyeIsyerleriGirisTelNoAlani;

    @FindBy(xpath = "(//div[@class='button-item'])[3]")

    public WebElement kartKullanicilari;

    @FindBy(xpath = "(//input[@name='userName'])[1]")

    public WebElement kartKullanicilariUsernameArea;

    @FindBy(xpath = "(//input[@name='userPassword'])[1]")

    public WebElement kartKullanicilariPasswordArea;

    @FindBy(xpath = "//button[@class='otpOpens button button-dark-slate-blue']")

    public WebElement getKartKullanicilariGirisYapBtn;

    @FindBy(xpath = "(//h2[@class='text-grape-purple'])[2]")

    public WebElement referanslarimiz;

    @FindBy(xpath = "//a[@class='discoverBtn button button-orangey-red']")

    public WebElement myEdenredKesfet;

    @FindBy(xpath = "//h1[@class='text-dark-slate-blue']")

    public WebElement mainPageMyEdenredErisim;

    @FindBy(xpath = "(//h2[@class='text-dark-slate-blue'])[2]")

    public WebElement oglenNeredeYiyelim;


















}
