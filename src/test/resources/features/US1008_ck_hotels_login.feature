Feature: US1008 Ck Hotels Login
  Scenario: TC10 kullanici gecerli bilgilerle giris yapar
    Given kullanici Ck Hotels ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kulllanici sayfayi kapatir