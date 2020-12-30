Feature: US1005_Walmart_parameter_arama
  @wip
  Scenario Outline:TC07_aranan_kelime_titleda_olmali
    When kullanici walmart anasayfaya gider
    Then walmart sayfasinda "<arananlar>" icin arama yapar
    And walmartta sayfa basliginin "<arananlar>" icerdigini test eder
    Then kullanici sayfayi kapatir
    Examples:
      | arananlar |
      | Nutella   |
      | pencil    |
      | milk      |
      | tomatoes  |
      | popcorn   |