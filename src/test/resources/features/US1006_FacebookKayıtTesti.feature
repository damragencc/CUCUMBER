
    Feature: US1006 Fake bilgilerle kullanici olusturma
@sistem
      Scenario: TC14 Faker classi kullanarak facebook'da kayit olusturabilmeli

    Given kullanici "faceUrl" anasayfaya gider
    And facebook'da yeni hesap olustur butonuna basar
    And 1 saniye bekler
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 2 saniye bekler
    And facebook kayit ol tusuna basar
    Then 8 saniye bekler
    And sayfayi kapatir