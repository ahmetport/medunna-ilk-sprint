package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006 {
    Appointments appointments=new Appointments();

    @Given("AP Kullanici medunna.com adresine gider")
    public void ap_kullanici_medunna_com_adresine_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        //appointments = new Appointments();
        Assert.assertTrue(appointments.welcomeToMedunna.isEnabled());

    }


    @Given("AP Kullanici Account Menu ikonuna tiklar")
    public void ap_kullanici_account_menu_ikonuna_tiklar() {
        appointments = new Appointments();
        appointments.girisIkonu.click();

    }

    @Given("AP Kullanici sign in secenegine tiklar")
    public void ap_kullanici_sign_in_secenegine_tiklar() {
        appointments = new Appointments();
        appointments.anaSayfaSignIn.click();
        Assert.assertTrue(appointments.signInMenusu.isEnabled());
    }

    @Given("AP Kullanici username kutusuna {string} girer")
    public void ap_kullanici_username_kutusuna_girer(String username) {
        appointments = new Appointments();
        appointments.girisUsernameTextBox.sendKeys(username);
    }

    @Given("AP Kullanici Password kutusuna {string} girer")
    public void ap_kullanici_password_kutusuna_girer(String password) {
        appointments = new Appointments();
        appointments.girisPasswordTextBox.sendKeys(password);

        ReusableMethods.waitFor(2);
    }

    @Given("AP Kullanici sign in butonuna tiklar")
    public void ap_kullanici_sign_in_butonuna_tiklar() {
        appointments = new Appointments();
        appointments.girisSignInButton.click();
        Assert.assertTrue(appointments.myPagesElementi.isEnabled());
        ReusableMethods.waitFor(3);

    }

    @Given("AP Kullanici sag ust kosede bulunan kullanici ismine tiklar")
    public void ap_kullanici_sag_ust_kosede_bulunan_kullanici_ismine_tiklar() {
        appointments = new Appointments();
        appointments.sagUstKullaniciAdi.click();
        Assert.assertTrue(appointments.settingsButton.isEnabled());
    }

    @Given("AP Kullanici settings secenigine tiklar")
    public void ap_kullanici_settings_secenigine_tiklar() {
        appointments = new Appointments();
        appointments.settingsButton.click();
        Assert.assertTrue(appointments.userSettingsFor.isEnabled());
        ReusableMethods.waitFor(2);

    }

    @Given("AP Firstname kutusundaki isim kayit olurken girilen {string} olmali")
    public void ap_firstname_kutusundaki_isim_kayit_olurken_girilen_olmali(String firstname) {
        appointments = new Appointments();
        String actualFirstname = appointments.settingsFirstnameTextBox.getAttribute("value");
        System.out.println(actualFirstname);
        Assert.assertEquals(actualFirstname, firstname);
    }

    @Given("AP last name  kutusundaki soy isim kayit olurken girilen {string} olmali")
    public void ap_last_name_kutusundaki_soy_isim_kayit_olurken_girilen_olmali(String lastname) {
        appointments = new Appointments();
        String actualLastname = appointments.settingsLastnameTextBox.getAttribute("value");
        Assert.assertEquals(actualLastname, lastname);
    }

    @Given("AP email kutusundaki mail adresi  kayit olurken girilen {string} olmali")
    public void ap_email_kutusundaki_mail_adresi_kayit_olurken_girilen_olmali(String email) {
        appointments = new Appointments();
        String actualEmail = appointments.settingsEmailTextBox.getAttribute("value");
        Assert.assertEquals(actualEmail, email);
    }

    @Given("AP kullanici uygulamayi kapatir")
    public void ap_kullanici_uygulamayi_kapatir() {
        Driver.closeDriver();
    }


    @Given("AP kullanici firstname kutusuna yeni {string} yazar")
    public void ap_kullanici_firstname_kutusuna_yeni_yazar(String newFirstname) {
        appointments = new Appointments();
      appointments.settingsFirstnameTextBox.click();
      appointments.settingsFirstnameTextBox.clear();
      appointments.settingsFirstnameTextBox.sendKeys(newFirstname);

    }

    @Given("AP kullanici lastname kutusuna yeni {string} yazar")
    public void ap_kullanici_lastname_kutusuna_yeni_yazar(String newLastname) {
        appointments = new Appointments();
        appointments.settingsLastnameTextBox.click();
        appointments.settingsLastnameTextBox.clear();
        appointments.settingsLastnameTextBox.sendKeys(newLastname);
    }

    @Given("AP kullanici email kutusuna yeni {string} yazar")
    public void ap_kullanici_email_kutusuna_yeni_yazar(String newEmail) {
        appointments = new Appointments();
        appointments.settingsEmailTextBox.click();
        appointments.settingsEmailTextBox.clear();
        appointments.settingsEmailTextBox.sendKeys(newEmail);
    }
    @Given("AP kullanici save butonuna basar ve degisiklikleri kaydeder")
    public void ap_kullanici_save_butonuna_basar_ve_degisiklikleri_kaydeder() {
        appointments = new Appointments();
        appointments.settingsSaveButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(appointments.settingsDegisikliklerKaydedildiElement.isEnabled());
    }
}