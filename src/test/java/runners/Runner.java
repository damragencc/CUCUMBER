package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/html-reports/rapor.html",
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "wip",
        dryRun = false

)
public class Runner {

    /*
       Runner class'i framework'umuzun build edilmesinde onemlidir
       Java olmayan feature dosyalari ile
       java ile yazdigimiz stepdefinition'larin ilisiklendirilmesini saglar


       Ayni zamanda TestNG'degi .xml dosyalari gibi
       testlerimizi toplu olarak calistirmamizi
       ve istenirse rapor alınmasini saglar

       RUnner class'i bos bir class'dir icinde kod olmaz
       Runner class'in  gorevlerini tanımlamak icin
       Notasyonlar kullanilir


     Runner,  CucumberOptions'da verilen gorevi yapar
     features klasoru altında tags olarak verilen taga sahip
     senaryolari bulup glue olarak tanimlanan klasordeki java kodlari
     ile calistirir


     dryRun = true secildiginde
     Runner verilen testi CALISTIRMADAN
     sadece eksik stepleri olusturur
     eksik step yoksa, testi calistirmadan direk TestPassed olarak raporlanir


     */

}
