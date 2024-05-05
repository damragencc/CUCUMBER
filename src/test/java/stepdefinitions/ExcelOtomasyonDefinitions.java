package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelOtomasyonDefinitions {

    Sheet sayfa1;
    String istenenHucredekiData;

    @Given("kullanici baskentler exceline ulasir")
    public void kullanici_baskentler_exceline_ulasir() throws IOException {

        String dosyaYolU="src/test/resources/ulkeler.xlsx";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolU);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        sayfa1=workbook.getSheet("Sayfa1");

    }
    @Then("{int}.satir {int}.hucredeki datayi yazdiri")
    public void satir_hucredeki_datayi_yazdiri(Integer satirNo, Integer sutunNo) {

        System.out.println(satirNo+".satir,"+sutunNo+".sutundaki data :"+sayfa1.getRow(satirNo - 1).getCell(sutunNo - 1));


    }
    @Then("{int}.satir {int}.hucredeki detayi bir string degiskene kaydeder")
    public void satir_hucredeki_detayi_bir_string_degiskene_kaydeder(Integer satirNo, Integer sutunNo) {

        istenenHucredekiData=sayfa1.getRow(satirNo-1).getCell(sutunNo-1).toString();




    }
    @Then("kaydedilen datanin {string} oldugunu test eder")
    public void kaydedilen_datanin_oldugunu_test_eder(String expectedData) {

        Assert.assertEquals(istenenHucredekiData,expectedData);



    }
    @When("İngilizce baskenti {string} olan ulkenin Turkce isminin {string} oldugunu test eder")
    public void ingilizceBaskentiOlanUlkeninTurkceIsmininOldugunuTestEder(String verilenBaskent, String expectedUlkeIsmi) {


        for (int i = 0; i <=sayfa1.getLastRowNum() ; i++) {

            // i.indexteki satirda bulunan İngilizce baskent ismini bulalım

            String satirdakiIngilizceBaskent=sayfa1.getRow(i)

                                                 .getCell(1)
                                                  .toString();


            // eger satirdaki ingilizce baskent ismi verilenBaskent ile ayni ise

            if (satirdakiIngilizceBaskent.equalsIgnoreCase(verilenBaskent)){

                //satirdaki turkce ulke ismini kaydedip

                String satirdakiTukceUlkeIsmi=sayfa1.getRow(i).getCell(2).toString();
            }

            //expected ulke ismi ile ayni oldugunu test edelim
            Assert.assertEquals(expectedUlkeIsmi,satirdakiIngilizceBaskent);

        }



    }
    @When("excelde kayitli ulke sayisinin {int} oldugunu test eder")
    public void excelde_kayitli_ulke_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @When("excelde kullanilan fiziki satir sayisinin {int} oldugunu test eder")
    public void excelde_kullanilan_fiziki_satir_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @When("Tum bilgileri map olarak kaydedip")
    public void tum_bilgileri_map_olarak_kaydedip() {

    }
    @Then("baskenti Jakarta olan ulkenin tum bilgilerini yazdirir")
    public void baskenti_jakarta_olan_ulkenin_tum_bilgilerini_yazdirir() {

    }
    @Then("mapi kullanarak turkce ismi Hollanda olan bir ulke bulundugunu test eder")
    public void mapi_kullanarak_turkce_ismi_hollanda_olan_bir_ulke_bulundugunu_test_eder() {

    }


}
