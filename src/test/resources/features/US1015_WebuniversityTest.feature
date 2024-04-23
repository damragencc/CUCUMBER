Feature: US1015 rastgele kullanici bilgileri ile giris yapilamaz


  Scenario:TC22 fake kullanici ile giris yapilamamali
    Given kullanici "webUrl" anasayfaya gider
    Then Login Portal' a  kadar asagi iner
    And 2 saniye bekler
    And Login Portal' a tiklar
    And 2 saniye bekler
    When acilan diger window'a gecer
    And 2 saniye bekler
    Then username ve password kutularina fake deger yazdirir
    And 2 saniye bekler
    And login butonuna basar
    And 2 saniye bekler
    Then Popup'ta cikan yazinin validation failed oldugunu test eder
    And 2 saniye bekler
    And Ok diyerek Popup'i kapatir
    When Ilk sayfaya geri doner
    And 2 saniye bekler
    And Ilk sayfaya donuldugunu test eder
    And 2 saniye bekler
    And sayfayi kapatir