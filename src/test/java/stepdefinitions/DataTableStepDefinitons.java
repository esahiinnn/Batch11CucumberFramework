package stepdefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorDataTablesPage;

public class DataTableStepDefinitons {
    EditorDataTablesPage editorDataTablesPage = new EditorDataTablesPage();

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorDataTablesPage.newButton.click();
    }

    @And("kullanici first name girer {string}")
    public void kullaniciFirstNameGirer(String firstName) {
        editorDataTablesPage.firstNameText.sendKeys(firstName);
    }

    @And("kullanici last girer {string}")
    public void kullaniciLastGirer(String lastName) {
        editorDataTablesPage.lastNameText.sendKeys(lastName);
    }

    @And("kullanici position girer {string}")
    public void kullaniciPositionGirer(String position) {
        editorDataTablesPage.positionText.sendKeys(position);
    }

    @And("kullanici office girer {string}")
    public void kullaniciOfficeGirer(String office) {
        editorDataTablesPage.officeText.sendKeys(office);
    }

    @And("kullanici extension  girer {string}")
    public void kullaniciExtensionGirer(String extension) {
        editorDataTablesPage.extensionText.sendKeys(extension);
    }

    @And("kullanici start date name girer {string}")
    public void kullaniciStartDateNameGirer(String startDate) {
        editorDataTablesPage.startDateText.sendKeys(startDate);
    }

    @And("kullanici salary girer {string}")
    public void kullaniciSalaryGirer(String arg0) {
        editorDataTablesPage.salaryText.sendKeys(arg0);
    }

    @Then("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        editorDataTablesPage.createButton.click();
    }

    @And("kullanici firstname ile arama yapar {string}")
    public void kullaniciFirstnameIleAramaYapar(String arg0) {
        editorDataTablesPage.searchTextBox.sendKeys(arg0);
    }

    @Then("isim bolumunde firstname oldugunu dogrular {string}")
    public void isimBolumundeFirstnameOldugunuDogrular(String arg0) {
        Assert.assertTrue(editorDataTablesPage.result.getText().contains(arg0));
    }

    @And("kullanici istedigi saniye kadar {string} kodu bekletsin")
    public void kullaniciIstedigiSaniyeKadarKoduBekletsin(String arg0) throws InterruptedException {
        Thread.sleep(Integer.parseInt(arg0)*1000);
    }
}
