
Feature: US1005 gecersiz bilgilerler giris yapılamamali

  Scenario: TC11 gecerli username ve gecersiz password ile giris yapilamamali


    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    And signIn butonuna basar
    Then giris yapilamadigini test eder
    Then sayfayi kapatir


  Scenario: TC12 gecersiz username ve gecerli password ile giris yapilamamali


    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email olarak "toGecersizEmail" girer
    And password olarak "toGecerliPassword" girer
    And signIn butonuna basar
    Then giris yapilamadigini test eder
    Then sayfayi kapatir



  Scenario: TC13 gecersiz username ve gecersiz password ile giris yapilamamali


    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email olarak "toGecersizEmail" girer
    And password olarak "toGecersizPassword" girer
    And signIn butonuna basar
    Then giris yapilamadigini test eder
    Then sayfayi kapatir


