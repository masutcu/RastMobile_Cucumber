package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.naming.MalformedLinkException;

import static org.junit.Assert.assertTrue;

public class MainPageStepDef extends ReusableMethods {
    MainPage locate=new MainPage();

    @Given("user goes mainpage")
    public void user_goes_mainpage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }



    @Given("User goes to main page and accept cookies")
    public void userGoesToMainPageAndAcceptCookies() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);
        locate.cookies.click();


    }

    @Then("Verify the main page title")
    public void verifyTheMainPageTitle() {
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("mainpage title : "+actualTitle);
        String expectedTitle="Kitapyurdu";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Given("User hovers the mouse over the title of newly released books")
    public void userHoversTheMouseOverTheTitleOfNewlyReleasedBooks() {
        showElementWithFrame(locate.yeniCikanKitaplar);
        bekle(2);
        hoverOverToElement(locate.yeniCikanKitaplar);
        bekle(1);

    }


    @Then("User clicks on newly realesed {string} books options")
    public void userClicksOnNewlyRealesedBooksOptions(String arg0) {
        showElementWithFrameXPath("//strong[text()='"+arg0+"']");
        bekle(1);
        Driver.getDriver().findElement(By.xpath("//strong[text()='"+arg0+"']")).click();
    }


}
