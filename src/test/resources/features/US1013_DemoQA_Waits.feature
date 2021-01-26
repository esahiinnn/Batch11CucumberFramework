Feature:US1013_DemoQA_Waits

  Scenario: Alert Test
    When kullanici "demoqa_url_1" anasayfaya gider
    And Alerts butonuna tiklar
    Then On button click, alert will appear after 5 seconds butonuna tiklar
    And Alert'in gorunur olmasini bekler
    Then Alerrt uzerindeki yazinin This alert appeared after 5 seconds oldugunu test eder
    And Okey butonuna basar
    