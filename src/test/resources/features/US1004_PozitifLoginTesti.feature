
Feature: US1004 gecerli bilgilerler giris yapabilmeli


  Scenario: TC10 test datasi olarak verilen kullanici adi ve sifre
             ile giris yapabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn butonuna basar
    And basarili giris yapilabildigini test eder
    And 3 saniye bekler
    And sayfayi kapatir