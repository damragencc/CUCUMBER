
Feature: US1011 Kullanici verilen gecersiz kullanici adi ve sifrelerle
  giris yapılamadigini test eder



  Scenario Outline: TC18 liste olarak verilen gecersiz bilgiler ile giris yapilamaz
    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email listesinden   "<verilenEmail>" girer
    And password listesinden "<verilenPassword>" girer
    And 3 saniye bekler
    Then signIn butonuna basar
    And  giris yapilamadigini test eder
    And 1 saniye bekler
    Then sayfayi kapatir
    Examples:
      |verilenEmail    |verilenPassword    |
      |murat@akar.com  |76jrf7  |
      |damragenc@wise.com  |123478418 |
      |selin@wise.com  |asknd1312  |
      |damra@hotmail.com |1235121 |
      |bugra@gmail.com|124124 |