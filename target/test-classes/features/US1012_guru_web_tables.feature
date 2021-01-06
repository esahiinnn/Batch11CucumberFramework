Feature:US1012_guru_web_tables

  Scenario:TC_16_kullanici_liste_alabilmeli
    Given kullanici "guru_web_url" anasayfaya gider
    Then Company listesini consola yazdirir
    And DCB Bank'in listede oldugunu test eder

  Scenario:TC_17_kullanici_sirket_Prev_Close_alabilmeli
    Given kullanici "guru_web_url" anasayfaya gider
    And "NCC" Prev.Close degerini yazdirir

    Scenario: qwe
      Given kullanici "guru_web_url" anasayfaya gider
      And "2", "1" daki yaziyi yazdirir