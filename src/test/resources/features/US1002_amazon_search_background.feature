@amazon
Feature: US1002 Amazon search background
  #Before method ile ayni isleme sahiptir
  Background:
    Given kullanici amazon anasayfaya gider


  Scenario: TC02_amazon_iphone_arama_testi

    And iphone icin arama yapar
    Then sonucun iphone icerdigini test eder


  Scenario: TC03_amazon_teapot_arama_testi
    And tea pot icin arama yapar
    Then sonucun tea pot icerdigini test eder


  Scenario: TC04_amazon_flower_arama_testi

    And flower icin arama yapar
    Then sonucun flower icerdigini test eder
