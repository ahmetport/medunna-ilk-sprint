package stepdefinitions.UI;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_26 {

    ContactPage contactPage=new ContactPage();

    @Given("Kullanici Contact Butonuna tiklar ve contact sayfasina yonlenirilir")
    public void kullanici_contact_butonuna_tiklar_ve_contact_sayfasina_yonlenirilir() {
        contactPage.contactButton.click();
       // contactPage.receivedMessage.isDisplayed();

    }
    @Given("Kullanici verilerini girer ve mesajini yazip gonder butonuna basar")
    public void kullanici_verilerini_girer_ve_mesajini_yazip_gonder_butonuna_basar() throws InterruptedException {
        contactPage.nametText.sendKeys("AHMET"+ Keys.ENTER);
        contactPage.emailText.sendKeys("umitenes89@gmail.com"+Keys.ENTER);
        contactPage.subjectText.sendKeys("patıent"+Keys.ENTER);
        contactPage.messageText.sendKeys("I can not appoıntment"+Keys.TAB);
        ReusableMethods.waitFor(2);
        contactPage.sendButton.click();
    }
    @Then("Kullanici mesajinin basarili bir sekilde gonderildiginin onaylamasini gorur")
    public void kullanici_mesajinin_basarili_bir_sekilde_gonderildiginin_onaylamasini_gorur() {
        //String expectedToastify="Your message has been received";
        String actualToastify= contactPage.receivedMessage.getText();
        //      Assert.assertTrue(actualToastify.contains(expectedToastify));

        Assert.assertTrue(contactPage.receivedMessage.isDisplayed());
    }
}

/*
    @Then("user provides name")
    public void user_provides_name() {
        String name=faker.name().firstName()+"xtest";
        cTestItem.setName(name);
        Driver.waitAndSendText(us17AdminPage.nameTextBox,name);
        //faker ile name oluşturma
 */






