package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruWebTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class GuruWebTablesStepDefinitions {
    GuruWebTablesPage guruWebTablesPage = new GuruWebTablesPage();

    @Then("Company listesini consola yazdirir")
    public void companyListesiniConsolaYazdirir() {

        for (WebElement w : guruWebTablesPage.companies) {
            System.out.println(w.getText());
        }

    }

    @And("DCB Bank'in listede oldugunu test eder")
    public void dcbBankInListedeOldugunuTestEder() {
        int count = 0;
        for (WebElement w : guruWebTablesPage.companies) {
            if (w.getText().contains(ConfigReader.getProperty("aranilan_company"))) {
                count=1;
            }

        }
        Assert.assertTrue(count==1);
    }



    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String arg0) {
        List<String> company = new ArrayList<>();
        List<String> prev = new ArrayList<>();
        for (WebElement w:guruWebTablesPage.companies
             ) {
            company.add(w.getText());
        }

        for (WebElement w:guruWebTablesPage.prevCloses
        ) {
            prev.add(w.getText());
        }
        int c = company.indexOf(arg0);
        System.out.println(prev.get(c));

    }

    @And("{string}, {string} daki yaziyi yazdirir")
    public void dakiYaziyiYazdirir(String arg0, String arg1) {

        String istenenData=Driver.getDriver().findElement(By.xpath("//tr["+arg0+"]//td["+arg1+"]")).getText();
        System.out.println(istenenData);
    }
}
