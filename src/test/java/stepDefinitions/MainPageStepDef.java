package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;

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
    @Given("User goes to main page and accept cookies_c")
    public void userGoesToMainPageAndAcceptCookies_c() throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.33:4444"), new ChromeOptions());
        driver.get(ConfigReader.getProperty("url"));
        bekle(3);
        driver.findElement(By.xpath("//div[text()='Kabul Et ve Kapat']")).click();
        String actualTitle=driver.getTitle();
        System.out.println("mainpage title : "+actualTitle);
        String expectedTitle="Kitapyurdu";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.close();


    }
    @Given("User goes to main page and accept cookies_d")
    public void userGoesToMainPageAndAcceptCookies_d() throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.33:4444"), new EdgeOptions());
        driver.get(ConfigReader.getProperty("url"));
        bekle(3);
        driver.findElement(By.xpath("//div[text()='Kabul Et ve Kapat']")).click();
        String actualTitle=driver.getTitle();
        System.out.println("mainpage title : "+actualTitle);
        String expectedTitle="Kitapyurdu";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.close();
    }
    @Given("User goes to main page and accept cookies_e")
    public void userGoesToMainPageAndAcceptCookies_e() throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.33:4444"), new FirefoxOptions());
        driver.get(ConfigReader.getProperty("url"));
        bekle(3);
        driver.findElement(By.xpath("//div[text()='Kabul Et ve Kapat']")).click();
        String actualTitle=driver.getTitle();
        System.out.println("mainpage title : "+actualTitle);
        String expectedTitle="Kitapyurdu";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.close();
    }


    @Then("Verify the main page title")
    public void verifyTheMainPageTitle() {
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("mainpage title : "+actualTitle);
        String expectedTitle="Kitapyurdu";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    @Then("Verify the main page title_c")
    public void verifyTheMainPageTitle_c() {
    }
    @Then("Verify the main page title_d")
    public void verifyTheMainPageTitle_d() {

    }
    @Then("Verify the main page title_e")
    public void verifyTheMainPageTitle_e() {

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
