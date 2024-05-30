package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LocateSubTitle;
import utilities.Driver;
import utilities.ReusableMethods;

public class SubTitleStepDef extends ReusableMethods{


    LocateSubTitle locate = new LocateSubTitle();


    @Given("user clicks_{string} and validete with appeared Title")
    public void userClicks_AndValideteWithAppearedTitle(String subtitle) {
        switch (subtitle) {
            case "yuzuk":
                flash(locate.yuzuk,Driver.getDriver());
                locate.yuzuk.click();
                bekle(1);
                Assert.assertTrue(locate.yuzuk1.isDisplayed());
                break;
            case "kupe":
                flash(locate.kupe,Driver.getDriver());
                locate.kupe.click();
                bekle(1);
                Assert.assertTrue(locate.kupe1.isDisplayed());
                break;
            case "kolye":
                flash(locate.kolye,Driver.getDriver());
                locate.kolye.click();
                bekle(1);
                Assert.assertTrue(locate.kolye1.isDisplayed());
                break;
            case "zincir":
                flash(locate.zincir,Driver.getDriver());
                locate.zincir.click();
                bekle(1);
                Assert.assertTrue(locate.zincir1.isDisplayed());
                break;
            case "bilezik":
                flash(locate.bilezik,Driver.getDriver());
                locate.bilezik.click();
                bekle(1);
                Assert.assertTrue(locate.bilezik1.isDisplayed());
                break;
            case "bileklik":
                flash(locate.bileklik,Driver.getDriver());
                locate.bileklik.click();
                bekle(1);
                Assert.assertTrue( locate.bileklik1.isDisplayed());
                break;
            case "cocuk":
                flash(locate.cocuk,Driver.getDriver());
                locate.cocuk.click();
                bekle(1);
                Assert.assertTrue(locate.cocuk1.isDisplayed());
                break;
            case "hediyelik":
                flash(locate.hediyelik,Driver.getDriver());
                locate.hediyelik.click();
                bekle(1);
                Assert.assertTrue(locate.hediyelik1.isDisplayed());
                break;
            case "dugunSetleri":
                flash(locate.dugunSetleri,Driver.getDriver());
                locate.dugunSetleri.click();
                bekle(1);
                Assert.assertTrue(locate.dugunSetleri1.isDisplayed());
                break;
        }

    }



    @Given("user hovers over yuzuk title")
    public void userHoversOverYuzukTitle() {
        hoverOverToElement(locate.yuzuk);

    }

    @Then("clicks on {string}")
    public void clicksOn(String arg0) {
        String a="(//a[@href='/collections/"+arg0+"'])[2]";
        System.out.println(a);
        Driver.getDriver().findElement(By.xpath(a)).click();
    }

    @Given("user hovers over kupe title")
    public void userHoversOverKupeTitle() {
        hoverOverToElement(locate.kupe);
    }

    @Then("clicks on with text {string}")
    public void clicksOnWithText(String arg0) {
        String a="//a[text()='"+arg0+"']";
        System.out.println(a);
        Driver.getDriver().findElement(By.xpath(a)).click();

    }

    @Given("user hovers over kolye title")
    public void userHoversOverKolyeTitle() {
        hoverOverToElement(locate.kolye);
    }

    @Given("user hovers over bilezik title")
    public void userHoversOverBilezikTitle() {
        hoverOverToElement(locate.bilezik);
    }

    @Given("user hovers over bileklik title")
    public void userHoversOverBileklikTitle() {
        hoverOverToElement(locate.bileklik);
    }


}