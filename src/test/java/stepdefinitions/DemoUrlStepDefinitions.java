package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoUrlPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoUrlStepDefinitions {

    DemoUrlPage demoUrlPage=new DemoUrlPage();

    ExcelOtomasyonDefinitions excelOtomasyonDefinitions = new ExcelOtomasyonDefinitions();





    @Then("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslik) {

        String dinamikSutunBasligiXpath = ""; // (//thead//th)[  3   ]
        String dinamikSutundakiTumDatalarXpath = ""; // (//tbody)[2]/tr/td[2]

        // basligi Company olan sutundaki tum datalari yazdirin

        // 1- tum basliklari bir liste olarak alirim




        // 2- tum basliklari bir loop ile gozden gecirip

        for (int i = 1; i <= demoUrlPage.baslikElementleriListesi.size() ; i++) {

            dinamikSutunBasligiXpath = "(//thead//th)[" + i + "]";
            String sutundakiBaslik = Driver.getDriver()
                    .findElement(By.xpath(dinamikSutunBasligiXpath))
                    .getText();

            // 3- istenen basligi hangi index'de bulursam
            //    o index'deki tum datalari yazdiririm

            if (sutundakiBaslik.equalsIgnoreCase(istenenBaslik)){

                dinamikSutundakiTumDatalarXpath = "(//tbody)[2]/tr/td[" + i + "]";

                List<WebElement> istenenSutundakiElementlerListesi =
                        Driver.getDriver().findElements(By.xpath(dinamikSutundakiTumDatalarXpath));

                System.out.println(ReusableMethods.stringListeDonustur(istenenSutundakiElementlerListesi));
            }

    }}

    @And("{int}.satir, {int}.sutundaki datayı yazdirir")
    public void satirSutundakiDatayıYazdirir(int satirNo, int sutunNo) {

        //(//tbody)[2]/tr[3]/td[2]

        String dinamikXpath="(//tbody)[2]/tr["+satirNo+"]/td["+sutunNo+"]";

        WebElement istenenDataElementi=Driver.getDriver().findElement(By.xpath(dinamikXpath));

        System.out.println(istenenDataElementi.getText());
    }

    @And("{string} ismi ile tum sayfa screenshot kaydeder")
    public void ismiIleTumSayfaScreenshotKaydeder(String raporIsmi) {

        ReusableMethods.tumSayfaScreenshot(Driver.getDriver(),raporIsmi);
    }
}
