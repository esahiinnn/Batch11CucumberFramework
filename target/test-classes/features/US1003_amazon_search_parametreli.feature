@amazon
Feature: US1003_amazon_search_parametreli

  Scenario: TC05_parametre_kullanma
    Given kullanici amazon anasayfaya gider
    And "hasan" icin arama yapar
    Then sonucun "teapot" icerdigini test eder
    And kullanici sayfayi kapatir