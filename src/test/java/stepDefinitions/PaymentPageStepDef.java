package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PaymentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class PaymentPageStepDef extends ReusableMethods {
    PaymentPage locate=new PaymentPage();

    @And("User enters credit cart number")
    public void userEntersCreditCartNumber() {
        locate.cardNumber.sendKeys(ConfigReader.getProperty("kartNo"));

    }

    @And("User enters credit cart name")
    public void userEntersCreditCartName() {
        locate.cardName.clear();
        locate.cardName.sendKeys(ConfigReader.getProperty("kartName"));
    }

    @And("User enters credit cart expires date")
    public void userEntersCreditCartExpiresDate() {
        locate.sonKTarihi.clear();
        locate.sonKTarihi.sendKeys(ConfigReader.getProperty("sktarihi"));
    }

    @And("User enters credit cart cvc number")
    public void userEntersCreditCartCvcNumber() {
        locate.cvc.clear();
        locate.cvc.sendKeys(ConfigReader.getProperty("cvc"));
    }

    @And("Verify the payment page title")
    public void verifyThePaymentPageTitle() {
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println("paymentpage title : "+actualTitle);
        String expectedTitle="Ödeme Seçenekleri";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Given("User checks the notification form checkbox")
    public void userChecksTheNotificationFormCheckbox() {
        Boolean isSelected=locate.conditionsCheckBox.isSelected();
        System.out.println("işaretli : "+isSelected);

        locate.conditionsCheckBox.click();

        Boolean isSelected2=locate.conditionsCheckBox.isSelected();
        System.out.println("işaretli : "+isSelected2);

    }

    @Then("user unchecks notification form checkbox")
    public void userUnchecksNotificationFormCheckbox() {
       locate.conditionsCheckBox.click();

    }

    @And("verify checkBOX isChecked")
    public void verifyCheckBOXIsChecked() {
        Assert.assertTrue(locate.conditionsCheckBox.isSelected());
    }

    @And("verify checkBOX isUnChecked")
    public void verifyCheckBOXIsUnChecked() {
        Assert.assertFalse(locate.conditionsCheckBox.isSelected());
    }

    @Then("User clicks on Order Confirmation button")
    public void userClicksOnOrderConfirmationButton() {
        locate.orderConfirm.click();

    }

    @And("Verifies that checkbox err message has been displayed")
    public void verifiesThatCheckboxErrMessageHasBeenDisplayed() {
        System.out.println(locate.checkBoxErrMessage.getText());
        Assert.assertTrue(locate.checkBoxErrMessage.isDisplayed());
    }



    @And("User enters credit cart {string} _Negative")
    public void userEntersCreditCart_Negative(String number) {
        showElementWithFrame(locate.cardNumber);
        locate.cardNumber.clear();
        locate.cardNumber.sendKeys(number);
        bekle(1);
       }

    @And("Verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {

        String unvalidCardNoMessage=locate.cardMessage1.getText();
        List<String> expected=new ArrayList<>();
        expected.add("Kart numarası geçersiz. Kontrol ediniz!");
        expected.add("Kart numarası alanı 16 karakter olmalı!");
        boolean containsExpectedMessage = expected.stream().anyMatch(unvalidCardNoMessage::contains);
        Assert.assertTrue(containsExpectedMessage);
    }
}
