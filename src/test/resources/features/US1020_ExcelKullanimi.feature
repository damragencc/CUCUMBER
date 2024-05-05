Feature: US1020 excelde istenilen gorevleri yapma

  Scenario: TC27 kullanici excelde istenen bilgileri alabilmeli

    Given kullanici baskentler exceline ulasir
    Then 1.satir 2.hucredeki datayi yazdiri
    And 1.satir 2.hucredeki detayi bir string degiskene kaydeder
    And kaydedilen datanin "Başkent (İngilizce)" oldugunu test eder
    When İngilizce baskenti "Jakarta" olan ulkenin Turkce isminin "Endonezya" oldugunu test eder
    And excelde kayitli ulke sayisinin 190 oldugunu test eder
    And excelde kullanilan fiziki satir sayisinin 191 oldugunu test eder
    When Tum bilgileri map olarak kaydedip
    Then baskenti Jakarta olan ulkenin tum bilgilerini yazdirir
    And mapi kullanarak turkce ismi Hollanda olan bir ulke bulundugunu test eder

