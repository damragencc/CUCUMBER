Feature: US1019 Kullanici istedigi satir ve sutundaki datayi yazdiri
@wip
  Scenario: TC26 parametre olarak verilen satir ve sutundaki data yazdırabilmeli

    Given kullanici "demoUrl" anasayfaya gider
    And 5.satir, 1.sutundaki datayı yazdirir
    And "tum tablo" ismi ile tum sayfa screenshot kaydeder