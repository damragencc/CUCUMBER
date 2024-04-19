package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {

    public FaceBookPage(){


        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="email")
    public WebElement loginEmailKutusu;

    @FindBy(id="pass")
    public WebElement loginpasswordKutusu;

    @FindBy(name="login")
    public WebElement loginSayfasiLoginButonu;

    @FindBy(className = "_9ay7")
    public WebElement logişnSayfasigirisYapılamadiYaziElementi;

    @FindBy(xpath = "//*[text()='Allow all cookies']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//*[text()='Yeni hesap oluştur']")
    public WebElement kayitButonu;


    @FindBy(name = "websubmit")
    public WebElement signUpButonu;




}
