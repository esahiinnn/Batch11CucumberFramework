package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPracticeStepDefinitions {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    Actions actions = new Actions(Driver.getDriver());

    public void asagiInme(){
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }


    @And("sign in butonuna basar")
    public void sign_in_butonuna_basar() {
        automationPracticePage.signInButton.click();
    }

    @Then("email adress text box'ina valid mail girer")
    public void email_adress_text_box_ina_valid_mail_girer() {
        automationPracticePage.emailTextBox.sendKeys(ConfigReader.getProperty("auto_mail"));
    }

    @Then("create an account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPracticePage.createAnAccountButton.click();
    }

    @Then("Title dan Mr butonuna basar")
    public void title_dan_mr_butonuna_basar() {
        automationPracticePage.title.click();
    }

    @Then("First name text boxina isim girer")
    public void first_name_text_boxina_isim_girer() {
        automationPracticePage.firstName.sendKeys(ConfigReader.getProperty("auto_name"));
    }

    @Then("Last name text boxina soyisim girer")
    public void last_name_text_boxina_soyisim_girer() {
        automationPracticePage.lastName.sendKeys(ConfigReader.getProperty("auto_surname"));
    }

    @Then("Password text boxina sifre girer")
    public void password_text_boxina_sifre_girer() throws InterruptedException {
        automationPracticePage.password.sendKeys(ConfigReader.getProperty("auto_pass"));
        Thread.sleep(1500);
        asagiInme();
        Thread.sleep(1500);
    }

    @Then("tarihlerden gun girer")
    public void tarihlerden_gun_girer() {
        Select select = new Select(automationPracticePage.days);
        select.selectByValue(ConfigReader.getProperty("auto_day"));
    }

    @Then("tarihlerden ay girer")
    public void tarihlerden_ay_girer() {
        Select select = new Select(automationPracticePage.months);
        select.selectByValue(ConfigReader.getProperty("auto_month"));
    }

    @Then("tarihlerden yil girer")
    public void tarihlerden_yil_girer() {
        Select select = new Select(automationPracticePage.years);
        select.selectByValue(ConfigReader.getProperty("auto_year"));
    }

    @Then("sign up for our newsletter check boxini isaretler")
    public void sign_up_for_our_newsletter_check_boxini_isaretler() {
        automationPracticePage.signUpCheckBox.click();
    }

    @Then("Receive speacial offers from our partners check boxini isaretler")
    public void receive_speacial_offers_from_our_partners_check_boxini_isaretler() {
        automationPracticePage.receiveCheckBox.click();
    }

    @Then("Company text boxina sirket girer")
    public void company_text_boxina_sirket_girer() {
        automationPracticePage.company.sendKeys(ConfigReader.getProperty("auto_company"));
    }

    @Then("Adress text boxina adress girer")
    public void adress_text_boxina_adress_girer() {
        automationPracticePage.address.sendKeys(ConfigReader.getProperty("auto_adress"));
    }

    @Then("Adress2 text boxina adress girer")
    public void adress2_text_boxina_adress_girer() {
      automationPracticePage.secondAdress.sendKeys(ConfigReader.getProperty("auto_adress2"));
    }

    @Then("City text boxina sehir girer")
    public void city_text_boxina_sehir_girer() {
        automationPracticePage.city.sendKeys(ConfigReader.getProperty("auto_city"));
    }

    @Then("State drop downundan eyalet secer")
    public void state_drop_downundan_eyalet_secer() {
        Select select = new Select(automationPracticePage.state);
        select.selectByVisibleText(ConfigReader.getProperty("auto_state"));
    }

    @Then("Postal Code text boxina code girer")
    public void postal_code_text_boxina_code_girer() throws InterruptedException {
        automationPracticePage.zipCode.sendKeys(ConfigReader.getProperty("auto_zip"));
        Thread.sleep(1500);
        asagiInme();
        Thread.sleep(1500);
    }

    @Then("Country drop downundan bir ulke secer")
    public void country_drop_downundan_bir_ulke_secer() {
    }

    @Then("Additional information text boxina bilgi girer")
    public void additional_information_text_boxina_bilgi_girer() {
        automationPracticePage.additionalInformation.sendKeys(ConfigReader.getProperty("auto_additional"));
    }

    @Then("Home phone text boxina ev telefonu girer")
    public void home_phone_text_boxina_ev_telefonu_girer() {
        automationPracticePage.homePhone.sendKeys(ConfigReader.getProperty("auto_homep"));
    }

    @Then("Mobile phone text boxina cep telefonu girer")
    public void mobile_phone_text_boxina_cep_telefonu_girer() {
        automationPracticePage.mobilePhone.sendKeys(ConfigReader.getProperty("auto_mobilep"));
    }

    @Then("Register butonuna basar")
    public void register_butonuna_basar() {
       automationPracticePage.registerButton.click();
    }

    @Given("email kutusuna gecersiz email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_gecersiz_email_adresi_yazar_ve_enter_a_tiklar() throws InterruptedException {
        automationPracticePage.emailTextBox.sendKeys(ConfigReader.getProperty("invalid_mail"));
        automationPracticePage.createAnAccountButton.click();
        Thread.sleep(1500);
    }

    @Then("error mesajinin Authentication failed. oldugunu dogrulayin")
    public void error_mesajinin_authentication_failed_oldugunu_dogrulayin() {
        Assert.assertTrue(automationPracticePage.errorMessage.getText().contains("Invalid"));
    }
}
