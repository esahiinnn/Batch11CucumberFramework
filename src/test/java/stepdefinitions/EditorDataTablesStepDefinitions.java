package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorDataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorDataTablesStepDefinitions {
    EditorDataTablesPage editorDataTablesPage = new EditorDataTablesPage();


    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorDataTablesPage.newButton.click();
    }

    @And("first name girer {string}")
    public void firstNameGirer(String arg0) {
        editorDataTablesPage.firstNameText.sendKeys(arg0);
    }

    @And("Last name girer {string}")
    public void lastNameGirer(String arg0) {
        editorDataTablesPage.lastNameText.sendKeys(arg0);
    }

    @And("Position girer {string}")
    public void positionGirer(String arg0) {
        editorDataTablesPage.positionText.sendKeys(arg0);
    }

    @And("Office girer {string}")
    public void officeGirer(String arg0) {
        editorDataTablesPage.officeText.sendKeys(arg0);
    }

    @And("Extention girer {string}")
    public void extentionGirer(String arg0) {
        editorDataTablesPage.extensionText.sendKeys(arg0);
    }

    @And("Startdate girer {string}")
    public void startdateGirer(String arg0) {
        editorDataTablesPage.startDateText.sendKeys(arg0);
    }

    @And("Salary girer {string}")
    public void salaryGirer(String arg0) {
        editorDataTablesPage.salaryText.sendKeys(arg0);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorDataTablesPage.createButton.click();
    }



    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String arg0) {
        Assert.assertTrue(editorDataTablesPage.result.getText().contains(arg0));
    }

    @When("kullanici editor sayfasina gider anasayfaya gider")
    public void kullaniciEditorSayfasinaGiderAnasayfayaGider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }


    @When("kullanici ilk isim ile arama yapar {string}")
    public void kullaniciIlkIsimIleAramaYapar(String arg0) {
        editorDataTablesPage.searchTextBox.sendKeys(arg0);
    }

    @And("kullanici istedigi {string} kadar kodu bekletir")
    public void kullaniciIstedigiKadarKoduBekletir(String saniye) throws InterruptedException {
        int sn = Integer.parseInt(saniye);
        Thread.sleep(sn*1000);
    }
}
