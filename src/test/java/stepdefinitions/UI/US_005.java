package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.MedunnaMainPage;

public class US_005 {
    MedunnaMainPage mainPage = new MedunnaMainPage();


    @And("Make appointment butonuna tiklar")
    public void makeAppointmentButonunaTiklar() {
        mainPage.makeAnAppointment.click();
    }

    @Given("First name kutusuna uygun isim girer")
    public void first_name_kutusuna_uygun_isim_girer() {
        mainPage.firstName.sendKeys("PATIENT");

    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hata_mesajinin_cikmadigini_test_eder() {
        US_005.isPresent(mainPage.nameVerification);

    }


    @And("SSN kutusuna uygun ssn girer")
    public void ssnKutusunaUygunSsnGirer() {
        mainPage.SSN.sendKeys("865-12-6355");


    }

    @Then("SSN icin hata mesajinin cikmadigini test eder")
    public void ssnIcinHataMesajininCikmadiginiTestEder() {
        US_005.isPresent(mainPage.ssnVerification);

    }

    @And("Last name kutusuna uygun lastname girer")
    public void lastNameKutusunaUygunLastnameGirer() {
        mainPage.lastName.sendKeys("PROJECT");

    }

    @Then("Lastname icin hata mesajinin cikmadigini test eder")
    public void lastnameIcinHataMesajininCikmadiginiTestEder() {
        US_005.isPresent(mainPage.lastNameVerification);
    }

    @And("e-mail kutusuna uygun e-mail girer")
    public void eMailKutusunaUygunEMailGirer() {
        mainPage.email.sendKeys("patient51@gmail.com");

    }

    @Then("e-mail icin hata mesajinin cikmadigini test eder")
    public void eMailIcinHataMesajininCikmadiginiTestEder() {
        US_005.isPresent(mainPage.emailVerification);

    }

    @And("Telefon kutusuna uygun telefon numarasi girer")
    public void telefonKutusunaUygunTelefonNumarasiGirer() {
        mainPage.phone.sendKeys("555-272-2727");

        //mainPage.phone.sendKeys(faker.random().nextInt(100, 999)+"-"+
        //    faker.random().nextInt(100, 999)+"-"+faker.random().nextInt(1000, 9999));
    }

    @Then("Telefon numarasi icin hata mesajinin cikmadigini test eder")
    public void telefonNumarasiIcinHataMesajininCikmadiginiTestEder() {
        US_005.isPresent(mainPage.phoneVerification);

    }

    @And("ana sayfa giris ikonuna tiklar")
    public void anaSayfaGirisIkonunaTiklar() {
        mainPage.openSignIn.click();
    }

    public static boolean isPresent(WebElement element) { // Ekranda bulunmayan bir elementi Assertun icine boolean deger atamak icin yapilmis method
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;


        }
    }
}



   


 
