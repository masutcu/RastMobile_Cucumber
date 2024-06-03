package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddressPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;


public class AdressPageStepDef extends ReusableMethods {
    AddressPage locate=new AddressPage();
    WebDriverWait wait;



    @Then("User enters {string}, {string}, {string} to form")
    public void userEntersToForm(String name, String surname, String email) {
        locate.name.sendKeys(name);
        locate.lastname.sendKeys(surname);
        locate.email.sendKeys(email);
    }

    @Then("User enters {string}, {string}, {string}, {string}, {string}, {string}, {string} to delivery form")
    public void userEntersToDeliveryForm(String ad, String soyad, String ulke, String sehir, String ilce, String adress, String tel) {
        locate.companyName.sendKeys(ad);
        locate.unvan.sendKeys(soyad);
        //ülke default TR geliyor
        // locate.ulke.sendKeys(ulke);
        scroll(600);
        bekle(2);
        locate.sehir.click();

        //buradaki açılan pencere için Explicit wait kullandım.

        wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        WebElement sehirOptions=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-name='"+sehir+"']")));
        sehirOptions.click();
        locate.ilce.click();


        WebElement ilceOptions=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-name='"+ilce+"']")));
        ilceOptions.click();
        locate.adres.sendKeys(adress);
        locate.mobilePhone.sendKeys(tel);

    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() {
        locate.devamButton.click();
        bekle(2);
    }
}
