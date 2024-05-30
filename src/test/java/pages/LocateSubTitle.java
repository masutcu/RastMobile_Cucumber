package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class LocateSubTitle {

    public LocateSubTitle()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='YÜZÜK'])[2]")
    public WebElement yuzuk;
    @FindBy(xpath = "(//a[text()='KÜPE'])[2]")
    public WebElement kupe;
    @FindBy(xpath = "(//a[text()='KOLYE'])[2]")
    public WebElement kolye;
    @FindBy(xpath = "(//a[text()='ZİNCİR'])[2]")
    public WebElement zincir;
    @FindBy(xpath = "(//a[text()='BİLEZİK'])[2]")
    public WebElement bilezik;
    @FindBy(xpath = "(//a[text()='BİLEKLİK'])[2]")
    public WebElement bileklik;
    @FindBy(xpath = "(//a[text()='ÇOCUK'])[2]")
    public WebElement cocuk;
    @FindBy(xpath = "(//a[text()='HEDİYELİK'])[2]")
    public WebElement hediyelik;
    @FindBy(xpath = "(//a[text()='DÜĞÜN SETLERİ'])[2]")
    public WebElement dugunSetleri;


    @FindBy(xpath = "//h1[text()='Yüzük']")
    public WebElement yuzuk1;
    @FindBy(xpath = "//h1[text()='Küpe']")
    public WebElement kupe1;
    @FindBy(xpath = "//h1[text()='Kolye']")
    public WebElement kolye1;
    @FindBy(xpath = "//h1[text()='Zincir']")
    public WebElement zincir1;
    @FindBy(xpath = "//h1[text()='Bilezik']")
    public WebElement bilezik1;
    @FindBy(xpath = "//h1[text()='Bileklik']")
    public WebElement bileklik1;
    @FindBy(xpath = "//h1[text()='Çocuk']")
    public WebElement cocuk1;
    @FindBy(xpath = "//h1[text()='Hediyelik']")
    public WebElement hediyelik1;
    @FindBy(xpath = "//h1[text()='Düğün Setleri']")
    public WebElement dugunSetleri1;

    @FindBy(xpath = "(//a[@href='/collections/altin-yuzuk'])[2]")
    public WebElement altınYuzuk;

    @FindBy(xpath = "//button[contains(text(),'Sıralama')]")
    public WebElement siralama;

    @FindBy(xpath = "//h2[text()='ÖZEL GÜNLER']")
    public WebElement spacialDays;
    @FindBy(xpath = "//h2[text()='E-MAİL BÜLTENİ']")
    public WebElement newsletterTitle;
    @FindBy(xpath = "//input[@class='Form__Input']")
    public WebElement newsletterEmailInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement emailSubmit;
    @FindBy(xpath = "//p[@class='Form__Alert Alert Alert--success']")
    public WebElement successMessage;
    @FindBy(xpath = "//p[contains(text(),'Lütfen devam etmek için robot olmadığınızı onaylayın.')]")
    public WebElement capcthaPage;



    @FindBy(xpath = "//a[text()='Anneler Günü Hediyeleri']")
    public WebElement annelerGunu;







}


