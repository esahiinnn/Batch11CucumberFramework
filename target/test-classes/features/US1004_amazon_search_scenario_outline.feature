@amazon
Feature:US1004_amazon_search_scenario_putline

  Scenario Outline: TC06_coklu_arama
    Given kullanici amazon anasayfaya gider
    And amazon sayfasinda "<kelime>" icin arama yapar
    Then sonucun "<kelime>" icerdigini test eder
    And kullanici sayfayi kapatir
    Examples:
      | kelime |
      | iphone |
      | teapot |
      | flower |