package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();


    @Then("Login Portal' a  kadar asagi iner")
    public void loginPortalAKadarAsagiIner() {


    }

    @And("Login Portal' a tiklar")
    public void loginPortalATiklar() {
        webUniversityPage.LoginPortal.click();
    }

    @When("acilan diger window'a gecer")
    public void acilanDigerWindowAGecer() {

ReusableMethods.switchWindow(Driver.getDriver(),"https://webdriveruniversity.com/Login-Portal/index.html");
    }

    @Then("username ve password kutularina fake deger yazdirir")
    public void usernameVePasswordKutularinaFakeDegerYazdirir() {

        Faker faker=new Faker();

        String fakerName = faker.name().username();
        String password = faker.internet().password();
       webUniversityPage.usernameKutusu.sendKeys(fakerName);
       webUniversityPage.passwordKutusu.sendKeys(password);
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        webUniversityPage.loginButton.click();
    }

    @Then("Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popupTaCikanYazininValidationFailedOldugunuTestEder() {
        String expectedAlertYazisi="validation failed";
        String actualAlertYazisi=Driver.getDriver().switchTo().alert().getText();

        Assert.assertEquals(actualAlertYazisi,expectedAlertYazisi);
    }

    @And("Ok diyerek Popup'i kapatir")
    public void okDiyerekPopupIKapatir() {

        Driver.getDriver().switchTo().alert().accept();
    }

    @When("Ilk sayfaya geri doner")
    public void ılkSayfayaGeriDoner() {

        ReusableMethods.switchWindow(Driver.getDriver(),"https://webdriveruniversity.com/");
    }

    @And("Ilk sayfaya donuldugunu test eder")
    public void ılkSayfayaDonuldugunuTestEder() {
        Assert.assertTrue(webUniversityPage.LoginPortal.isDisplayed());


    }
}
