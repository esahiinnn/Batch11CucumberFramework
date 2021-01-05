package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @Given("iphone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
            amazonPage.searchTextBox.sendKeys(ConfigReader.getProperty("aranicak_kelime"));
            amazonPage.searchButton.click();
    }

    @Then("sonucun iphone icerdigini test eder")
    public void sonucun_iphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(ConfigReader.getProperty("aranicak_kelime")));

    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonPage.searchTextBox.sendKeys(ConfigReader.getProperty("aranicak_kelime2"));
        amazonPage.searchButton.click();
    }

    @Then("sonucun tea pot icerdigini test eder")
    public void sonucun_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(ConfigReader.getProperty("aranicak_kelime2")));

    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.searchTextBox.sendKeys(ConfigReader.getProperty("aranicak_kelime3"));
        amazonPage.searchButton.click();
    }

    @Then("sonucun flower icerdigini test eder")
    public void sonucun_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(ConfigReader.getProperty("aranicak_kelime3")));

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String kelime) {
        amazonPage.searchTextBox.sendKeys(kelime);
        amazonPage.searchButton.click();
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucun_icerdigini_test_eder(String kelime) {
       Assert.assertTrue(amazonPage.searchResult.getText().contains(kelime));
    }

    @And("amazon sayfasinda {string} icin arama yapar")
    public void amazonSayfasindaIcinAramaYapar(String kelime) {
        amazonPage.searchTextBox.sendKeys(kelime);
        amazonPage.searchButton.click();
    }

}
