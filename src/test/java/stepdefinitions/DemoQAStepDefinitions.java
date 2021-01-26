package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQAPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Map;

public class DemoQAStepDefinitions {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    DemoQAPage demoQAPage = new DemoQAPage();

    @Then("On button click, alert will appear after {int} seconds butonuna tiklar")
    public void onButtonClickAlertWillAppearAfterSecondsButonunaTiklar(int arg0) {
        demoQAPage.appearInFiveSecAlert.click();
    }

    @And("Alerts butonuna tiklar")
    public void alertsButonunaTiklar() {
        demoQAPage.alertsButton.click();
    }

    @And("Alert'in gorunur olmasini bekler")
    public void alertInGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Then("Alerrt uzerindeki yazinin This alert appeared after {int} seconds oldugunu test eder")
    public void alerrtUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEder(int arg0) {

        Alert alert = Driver.getDriver().switchTo().alert();
        String actualAlertMessage = alert.getText();
        Assert.assertEquals(ConfigReader.getProperty("alertMessage"), actualAlertMessage);
    }

    @And("Okey butonuna basar")
    public void okeyButonunaBasar() {
        Driver.getDriver().switchTo().alert().accept();
    }


}
