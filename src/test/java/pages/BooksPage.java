package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;
import java.util.List;

public class BooksPage {
    public BooksPage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='image']")
    public List<WebElement> kitapImgs;

    @FindBy(xpath = "//a[@class='add-to-cart']")
    public List<WebElement> addToCart;

    @FindBy(id="cart-items")
    public WebElement cartIcon;

    @FindBy(id="js-checkout")
    public WebElement satinAlButton;

    @FindBy(xpath = "//i[@class='fa-solid fa-arrow-right ms-8px']")
    public List<WebElement> paymentGirisOptions;





}
