Feature: US1015_DBUtils ile yapilan islemler

  @dbread
  Scenario: TC23_ Kullanici tHOTEL tablosundan mail fieldini okur
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kullanici DBUtils ile "tHOTEL" tablosundan "Email" verilerini okur
    Then IDHotel degeri 8 olan kaydin Email bilgisinin "new@email" oldugunu dogrular

  @dbupdate1
  Scenario: TC_24 Kullanici tHotel tablosundan istedigi Emaili update eder
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And IDHotel degeri 3 olan kaydin Email degerini "batch11@javadabulurusuz.com" yapar

  @dbupdate2
  Scenario: TC_25 Kullanici
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    Then IDHotel degeri 11 olan kaydin Email bilgisini buisbukadar@mail.com

    @dbcreate
    Scenario: TC_26 Kullanici uygun degerlerle tHOTEL tablosuna yeni kayit ekler
      Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
      And uygun degerlerle tabloya yeni kayit ekler
