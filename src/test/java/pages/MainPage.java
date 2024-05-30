package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class MainPage {
    public MainPage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[text()='Kabul Et ve Kapat']")
    public WebElement cookies;

    @FindBy(xpath = "//span[text()='Yeni Çıkan Kitaplar']")
    public WebElement yeniCikanKitaplar;




//div[@class='image']

}
