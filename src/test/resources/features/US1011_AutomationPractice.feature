Feature: US1011_AutomationPractice
  Scenario: TC14_Kullanici_yeni_giris_olusturabilmeli
    Given kullanici "automation_practice_url" anasayfaya gider
    And sign in butonuna basar
    Then email adress text box'ina valid mail girer
    And create an account butonuna basar
    Then Title dan Mr butonuna basar
    And First name text boxina isim girer
    And Last name text boxina soyisim girer
    And Password text boxina sifre girer
    And tarihlerden gun girer
    And tarihlerden ay girer
    And tarihlerden yil girer
    And sign up for our newsletter check boxini isaretler
    And Receive speacial offers from our partners check boxini isaretler
    And Company text boxina sirket girer
    And Adress text boxina adress girer
    And Adress2 text boxina adress girer
    And City text boxina sehir girer
    And State drop downundan eyalet secer
    And Postal Code text boxina code girer
    And Country drop downundan bir ulke secer
    And Additional information text boxina bilgi girer
    And Home phone text boxina ev telefonu girer
    And Mobile phone text boxina cep telefonu girer
    And Register butonuna basar


