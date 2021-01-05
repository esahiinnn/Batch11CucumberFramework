@smoke
Feature: US1007_kullanici_data_ekleyebilmeli

  Scenario Outline: TC09_5_farkli kisi_ile_farkli_kombinasyonlari_calismali
    When kullanici "editor_data_url" anasayfaya gider
    Then new butonuna basar
    And kullanici first name girer "<firstname>"
    And kullanici last girer "<lastname>"
    And kullanici position girer "<position>"
    And kullanici office girer "<office>"
    And kullanici extension  girer "<extension>"
    And kullanici start date name girer "<startdate>"
    And kullanici salary girer "<salary>"
    And kullanici istedigi saniye kadar "2" kodu bekletsin
    Then kullanici create butonuna basar
    And kullanici firstname ile arama yapar "<firstname>"
    Then isim bolumunde firstname oldugunu dogrular "<firstname>"
    And kullanici istedigi saniye kadar "2" kodu bekletsin
    Examples:
      | firstname | lastname  | position     | office    | extension | startdate  | salary |
      | Tuba      | Cetin     | QA           | Techproed | --        | 2020-12-10 | 6500   |
      | Ebubekir  | Sahin     | QA team lead | Techproed | --        | 2020-12-10 | 12000  |
      | Enes      | Cetin     | QA           | Techproed | Dr        | 2020-12-10 | 6500   |
      | Ayten     | Sahin     | QA           | Techproed | As        | 2020-12-10 | 12000  |
      | Mehmet    | Bulutluoz | QA           | Techproed | Alb       | 2020-12-10 | 6500   |



