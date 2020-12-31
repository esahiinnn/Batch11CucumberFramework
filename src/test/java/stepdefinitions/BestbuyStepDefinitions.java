package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class BestbuyStepDefinitions {
    @When("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Then("{string} de oldugunu test eder")
    public void deOldugunuTestEder(String string) {
        Assert.assertEquals(ConfigReader.getProperty(string), Driver.getDriver().getCurrentUrl());
    }
}

