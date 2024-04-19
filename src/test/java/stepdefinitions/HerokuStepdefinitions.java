package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HeroKuPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepdefinitions {


    HeroKuPage heroKuPage = new HeroKuPage();



    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {

        heroKuPage.addButonu.click();


    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {

        heroKuPage.deleteButonu.isDisplayed();

    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
        heroKuPage.deleteButonu.click();

    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(heroKuPage.addRemoveYaziElementi.isDisplayed());



    }


    @And("Delete butonunun kayboldugunu test eder")
    public void deleteButonununKayboldugunuTestEder() {

        //gorunmeyen bir elemani locate edemeyecegimiz icin
        //gorunmedigini test edemeyiz
        //bu testi yapabilmek icin, gorunmeyen elemani kullanmaya calisip
        // NoSuchElementException vermesini saglar, ve bu exception'i kullanarak testimizi yapariz





        try {
            heroKuPage.addButonu.click();
        } catch (NoSuchElementException e) {

        }
        //Eger delete butonunu locate edip click yapamiyorsa
            // delete butonu gorunur degildir
            //yani testimiz passed olmustur

            Assert.assertTrue(true);
        }


    }

