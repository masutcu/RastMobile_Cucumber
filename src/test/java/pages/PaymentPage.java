package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class PaymentPage {
    public PaymentPage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "credit_card_number")
    public WebElement cardNumber;
    @FindBy(id = "credit_card_name")
    public WebElement cardName;
    @FindBy(id = "credit_card_expires")
    public WebElement sonKTarihi;
    @FindBy(id = "credit_card_security_code")
    public WebElement cvc;

    @FindBy(id = "terms-and-conditions-agree")
    public WebElement conditionsCheckBox;

    @FindBy(xpath = "//button[contains(text(),'Siparişi Onaylayın')] ")
    public WebElement orderConfirm;

    @FindBy(id = "terms-and-condition-error")
    public WebElement checkBoxErrMessage;

    @FindBy(id = "swal2-title")
    public WebElement cardMessage1;




}
