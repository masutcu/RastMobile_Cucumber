package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class GuestPage {
    public GuestPage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(text(),'Adres Ekle')]")
    public WebElement addAddress;

    @FindBy(id = "continue-button")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='overflow-hidden text-break']")
    public WebElement addressLabel;




}
