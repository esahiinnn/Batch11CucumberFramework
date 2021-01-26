package dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbWithDBUtils {

    @Given("kullanici DBUtils ile CK_Hotels veritabanina baglanir")
    public void kullanici_db_utils_ile_ck_hotels_veritabanina_baglanir() {
        DBUtils.getConnection();
    }

    @Given("kullanici DBUtils ile {string} tablosundaki {string} verilerini alir")
    public void kullanici_db_utils_ile_tablosundaki_verilerini_alir(String table, String field) {
        String query = "SELECT " + field + " FROM dbo." + table;
        DBUtils.executeQuery(query);
    }

    @Given("kullanici DBUtils ile {string} sutunundaki verileri okur")
    public void kullanici_db_utils_ile_sutunundaki_verileri_okur(String field) throws SQLException {
        DBUtils.getResultset().first();
        Object ilkSatirdakiObje = DBUtils.getResultset().getObject(field);
        System.out.println(ilkSatirdakiObje.toString());
    }

    @And("kullanici DBUtils ile {string} tablosundan {string} verilerini okur")
    public void kullaniciDBUtilsIleTablosundanVerileriniOkur(String table, String field) {
        String readQuery = "SELECT " + field + " FROM dbo." + table;
        DBUtils.executeQuery(readQuery);
    }

    @Then("IDHotel degeri {int} olan kaydin Email bilgisinin {string} oldugunu dogrular")
    public void idhotelDegeriOlanKaydinEmailBilgisininOldugunuDogrular(int sira, String testDegeri) throws Exception {
        // Istenen satirdaki Email verisini okuma ve yazdirma
        DBUtils.getResultset().absolute(sira);
        Object istenenSatirdakiObje = DBUtils.getResultset().getObject("Email");
        System.out.println(istenenSatirdakiObje.toString());

        // Email field'indaki tum email'leri satir numarasi ile birlikte yazdiralim
        int satirSayisi = DBUtils.getRowCount(); // bu hazir method bize satir sayisini verir
        DBUtils.getResultset().first();
        int satirNumarasi = DBUtils.getResultset().getRow(); // bu method bize bulundugumuz satirin numarasini verir
        System.out.println(satirNumarasi + ", " + satirSayisi);

        while (satirNumarasi < satirSayisi) {
            // baslanan satirdan son satira kadar her bir satirdaki objeyi, sonrada obje uzerinden
            // Emaili alicagim ayrica kacinci satirda oldugunu gostermek icin satir sayisini da licam
            Object satirdakiEmail = DBUtils.getResultset().getObject("Email"); // satirdaki objeyi verir
            satirNumarasi = DBUtils.getResultset().getRow(); // satirin numarasini verir
            System.out.println(satirNumarasi + ". satirdaki email: " + satirdakiEmail.toString());
            DBUtils.getResultset().next();
        }

        // Istenen satirdaki email degerinin istenen email oldugunu test edelim
        Assert.assertEquals(testDegeri, istenenSatirdakiObje.toString());

    }

    @And("IDHotel degeri {int} olan kaydin Email degerini {string} yapar")
    public void idhotelDegeriOlanKaydinEmailDegeriniYapar(int satir, String newMail) {
        String updateQuery = "UPDATE dbo.tHotel SET Email='" + newMail + "' WHERE IDHotel=" + (satir + 1);
        DBUtils.executeQuery(updateQuery);
    }

    @Then("IDHotel degeri {int} olan kaydin Email bilgisini buisbukadar@mail.com")
    public void idhotelDegeriOlanKaydinEmailBilgisiniBuisbukadarMailCom(int arg0) {
        String sqlSorgu = "UPDATE dbo.tHOTEL SET Email='buisbukadar@gmail.com' WHERE IDHotel=11";
        DBUtils.executeQuery(sqlSorgu);
    }

    @And("uygun degerlerle tabloya yeni kayit ekler")
    public void uygunDegerlerleTabloyaYeniKayitEkler() {
        String createQuery = "INSERT INTO dbo.tHOTEL(Code,Name,Address,Phone,Email,IDGroup,CreateDate,CreateUser) " +
                "VALUES('146','Asdf','testAdres','12345678','mrbnebu@gmail.com',10012,'2021-01-26 22:15:45.587',4)";
        DBUtils.executeQuery(createQuery);
    }











}


