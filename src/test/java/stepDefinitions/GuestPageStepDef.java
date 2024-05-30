package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GuestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GuestPageStepDef extends ReusableMethods {
    GuestPage locate=new GuestPage();

    @And("Verify the guest page title")
    public void verifyTheGuestPageTitle() {
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println("actual title : "+actualTitle);
        String expectedTitle="Satın Al";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @When("User clicks on add address button")
    public void userClicksOnAddAddressButton() {
        locate.addAddress.click();

    }

    @Given("Verifies that user address details has been displayed")
    public void verifiesThatUserAddressDetailsHasBeenDisplayed() {
        String adresBilgileri=locate.addressLabel.getText();
        System.out.println("Adres bilgileri : "+adresBilgileri);
        String expected="Kitap Sokak NO.10 ÇANKAYA";

        Assert.assertTrue(adresBilgileri.contains(expected));

    }
}
