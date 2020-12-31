Feature: US1007_kullanici_data_ekleyebilmeli


  Scenario Outline: TC09_data_olusturabilmeli
    When kullanici editor sayfasina gider anasayfaya gider
    Then new butonuna basar
    And first name girer "<firstname>"
    And Last name girer "<Lastname>"
    And Position girer "<position>"
    And Office girer "<office>"
    And Extention girer "<extention>"
    And Startdate girer "<startdate>"
    And Salary girer "<salary>"
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar "<firstname>"
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And kullanici istedigi "Saniye" kadar kodu bekletir
    Examples:
      | firstname | Lastname | position | office | extention | startdate  | salary |
      | Ebubekir  | Sahin    | QA       | Tech   | DK        | 2020-12-23 | 6000   |
      | Ahmet     | Sahin    | QA       | Tech   | DK        | 2020-12-23 | 6000   |
      | Mehmet    | Sahin    | QA       | Tech   | DK        | 2020-12-23 | 6000   |
      | Ayse      | Sahin    | QA       | Tech   | DK        | 2020-12-23 | 6000   |
      | Hamza     | Sahin    | QA       | Tech   | DK        | 2020-12-23 | 6000   |