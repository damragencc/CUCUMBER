
     Feature: US1001 Kullanici testotomasyonu sayfasindan urun aratabilmeli

    Scenario: TC01 Kullanici phone aratabilmeli

    Given  kullanici testotomasyonu anasayfaya gider
    When  arama kutusuna phone yazip enter tusuna basar
    Then  arama sonucunda urun bulunabildigini test eder
    Then  sayfayi kapatir

@smoke
         Scenario: TC01 Kullanici dress aratabilmeli

             Given  kullanici testotomasyonu anasayfaya gider
             When  arama kutusuna dress yazip enter tusuna basar
             Then  arama sonucunda urun bulunabildigini test eder
             Then  sayfayi kapatir


         Scenario: TC01 Kullanici baby aratabilmeli

             Given  kullanici testotomasyonu anasayfaya gider
             When  arama kutusuna baby yazip enter tusuna basar
             Then  arama sonucunda urun bulunabildigini test eder
             Then  sayfayi kapatir