
Feature: US1002 Negatif arama testi
  # Eger her scenario'nun basinda belirli adimlar ayni ise
  # bu adimlari Background: olarak tanimlayabiliriz



  Scenario: TC04 kullanici java arattiginda sonuc bulunamamali

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna java yazip enter tusuna basar
    Then arama sonucunda urun bulunamadigini test eder
    And sayfayi kapatir


  Scenario: TC05 kullanici nutella arattiginda sonuc bulunamamali


    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna nutella yazip enter tusuna basar
    Then arama sonucunda urun bulunamadigini test eder
    And sayfayi kapatir