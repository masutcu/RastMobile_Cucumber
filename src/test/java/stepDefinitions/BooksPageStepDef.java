package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BooksPage;
import utilities.ReusableMethods;

public class BooksPageStepDef extends ReusableMethods {
    BooksPage locate=new BooksPage();

    @And("User adds to cart first book")
    public void userAddsToCartFirstBook() {
        hoverOverToElement(locate.kitapImgs.get(0));
        bekle(1);
        locate.addToCart.get(0).click();
        bekle(1);

    }


    @Then("Verifies that the product has been added on the cart icon")
    public void verifiesThatTheProductHasBeenAddedOnTheCartIcon() {
        String actual=locate.cartIcon.getText();
        Assert.assertEquals("1",actual);
    }

    @Then("User clicks on cart ıcon")
    public void userClicksOnCartIcon() {
        locate.cartIcon.click();
    }

    @And("User clicks on satinAL button")
    public void userClicksOnSatinALButton() {
        locate.satinAlButton.click();
    }

    @Given("User selects continue without register option")
    public void userSelectsContinueWithoutRegisterOption() {

        showElementWithFrame(locate.paymentGirisOptions.get(2));
        tumSayfaResmi();
        bekle(1);
        locate.paymentGirisOptions.get(2).click();
    }



}
