Feature: US1003_amazon_search_parametreli
#@wip
  Scenario: TC05_parametre_kullanma
    Given kullanici amazon anasayfaya gider
    And "teapot" icin arama yapar
    Then sonucun "teapot" icerdigini test eder
    And kullanici sayfayi kapatir