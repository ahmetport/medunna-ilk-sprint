package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Medunna_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_05T {



        Medunna_Page us05 = new Medunna_Page();

        @Given("Kullanıcı {string} adresine gider")
        public void kullanıcıAdresineGider(String url) {
            Driver.getDriver().get(ConfigReader.getProperty(url));
        }

        @Then("Make an Appointment sekmesine tiklar")
        public void make_an_appointment_sekmesine_tiklar() {
            Driver.wait(1);
            us05.makeAppointmentButton.click();
            Driver.wait(1);
        }

        @Then("isim olarak {string} girer")
        public void isim_olarak_girer(String firstName) {
            us05.firstNameBox.sendKeys(firstName);
        }

        @Then("soy isim {string} girer")
        public void soy_isim_girer(String lastName) {
            Driver.wait(1);
            us05.lastNameBox.sendKeys(lastName);
        }

        @Then("SSN numarasi olarak {string} girer")
        public void ssn_numarasi_olarak_girer(String ssn) {
            Driver.wait(1);
            us05.SSNBox.sendKeys(ssn);
        }

        @Then("Email adresi olarak {string} girer")
        public void email_adresi_olarak_girer(String email) {
            Driver.wait(1);
            us05.emailBox.sendKeys(email);
        }

        @Then("Telefon numarasi olarak {string} girer")
        public void telefon_numarasi_olarak_girer(String phone) {
            Driver.wait(1);
            us05.phoneBox.sendKeys(phone);
        }

        @Then("Appointment Date olarak {string} girer")
        public void appointment_date_olarak_girer(String date) {
            Driver.wait(1);
            us05.appointmentDateBox.sendKeys(date);
        }

        @Then("Send an Appointment Request butonuna tiklar.")
        public void send_an_appointment_request_butonuna_tiklar() {
            Driver.wait(2);
            us05.sendAnAppointmentRequestButton.click();
        }

        @Then("{string} hata mesajini gorur.")
        public void hata_mesajini_gorur(String message) {
            String expectedText = message;
            String actualText = us05.hataMesaji.getText();
            Assert.assertEquals(expectedText, actualText);
        }

        @Then("{string} sekmesine tiklar")
        public void sekmesineTiklar(String arg0) {

        }

        @And("kullanici browseri kapatir")
        public void kullaniciBrowseriKapatir() {

        }

        @And("{string} onay mesajini gorur.")
        public void onayMesajiniGorur(String message) {
            Driver.wait(1);
            String expectedText = message;
            Driver.wait(1);

            String actualtext = us05.registerOnayMesaji.getText();
            System.out.println(actualtext);
            Assert.assertEquals(expectedText, actualtext);


        }

    }


