package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CrystalKeyHotelsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CrystalKeyHotelsStepDefinitions {

    CrystalKeyHotelsPage crystalKeyHotelsPage = new CrystalKeyHotelsPage();
    @Given("kullanici Ck Hotels ana sayfasinda")
    public void kullanici_ck_hotels_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
    }

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        crystalKeyHotelsPage.logInButtonHomePage.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        crystalKeyHotelsPage.usernameTextBox.sendKeys(ConfigReader.getProperty("ck_valid_username"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        crystalKeyHotelsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_valid_password"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        crystalKeyHotelsPage.logInButtonLogInPage.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(crystalKeyHotelsPage.managerDropDrown).perform();
        Assert.assertTrue(crystalKeyHotelsPage.logOut.isDisplayed());
    }

    @Then("kulllanici sayfayi kapatir")
    public void kulllanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

}
