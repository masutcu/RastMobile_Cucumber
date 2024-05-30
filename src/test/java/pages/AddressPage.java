package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;
import java.util.List;

public class AddressPage {
    public AddressPage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "firstname")
    public WebElement name;
    @FindBy(id = "lastname")
    public WebElement lastname;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "firstname_companyname")
    public WebElement companyName;
    @FindBy(id = "lastname_title")
    public WebElement unvan;
    @FindBy(id = " btn-modal-country")
    public WebElement ulke;
    @FindBy(id = "btn-modal-zone")
    public WebElement sehir;
    @FindBy(id = "btn-modal-county")
    public WebElement ilce;
    @FindBy(id = "btn-modal-district")
    public WebElement mahalle;
    @FindBy(id = "//i[@class='fa-solid fa-angle-down text-gray-dark']")
    public List<WebElement> adresDDM;
    @FindBy(id = "address")
    public WebElement adres;
    @FindBy(id = "mobile_phone")
    public WebElement mobilePhone;

    @FindBy(id = "continue-button")
    public WebElement devamButton;







}
