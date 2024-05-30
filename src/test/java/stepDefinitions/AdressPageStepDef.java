package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.AddressPage;
import utilities.Driver;
import utilities.ReusableMethods;



public class AdressPageStepDef extends ReusableMethods {
    AddressPage locate=new AddressPage();



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
        bekle(1);
        //locate.adresDDM.get(1).click();
        Driver.getDriver().findElement(By.xpath("//li[@data-name='"+sehir+"']")).click();
        locate.ilce.click();
        //locate.adresDDM.get(2).click();
        bekle(1);
        Driver.getDriver().findElement(By.xpath("//li[@data-name='"+ilce+"']")).click();
        locate.adres.sendKeys(adress);
        locate.mobilePhone.sendKeys(tel);

    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() {
        locate.devamButton.click();
        bekle(2);
    }
}
