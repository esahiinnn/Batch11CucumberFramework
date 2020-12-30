package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WalmartStepDefinitions {
    WalmartPage walmartPage = new WalmartPage();
    @When("kullanici walmart anasayfaya gider")
    public void kullaniciWalmartAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("walmart_url"));
    }

    @Then("walmart sayfasinda {string} icin arama yapar")
    public void walmartSayfasindaIcinAramaYapar(String kelime) {
        walmartPage.searchTextBox.sendKeys(kelime + Keys.ENTER);
    }

    @And("walmartta sayfa basliginin {string} icerdigini test eder")
    public void walmarttaSayfaBasligininIcerdiginiTestEder(String kelime) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(kelime));
    }
}
