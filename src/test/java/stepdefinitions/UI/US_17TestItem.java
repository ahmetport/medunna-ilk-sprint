package stepdefinitions.UI;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TestItemsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.ReusableMethods.getScreenshot;

public class US_17TestItem {

    TestItemsPage testItem = new TestItemsPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker=new Faker();


    @Given("is items&title butonuna tiklar")
    public void is_items_title_butonuna_tiklar() {
        Driver.wait(3);
        testItem.itemTitiesButton.click();

    }

    @Given("is test item linkine tiklar")
    public void is_test_item_linkine_tiklar() {
        Driver.wait(3);
        testItem.TestItem.click();

    }

    @Given("is create a new item buttonuna tiklar")
    public void is_create_a_new_item_buttonuna_tiklar() {
        testItem.NewCreate.click();

    }

    @Given("is test olusturma ekraninda name box a isim girer")
    public void is_test_olusturma_ekraninda_name_box_a_isim_girer() {
        testItem.TextBoxName.sendKeys(ConfigReader.getProperty("Test_adi"));
       // testItem.TextBoxName.sendKeys("Team_51" + faker.name().firstName());

    }

    @Given("is description box a test aciklamasini girer")
    public void is_description_box_a_test_aciklamasini_girer() {
        testItem.descriptionBox.sendKeys(ConfigReader.getProperty("Test_descrp"));

    }

    @Given("is test fiyat kutusuna ucreti girer")
    public void is_test_fiyat_kutusuna_ucreti_girer() {
        testItem.PriceBox.sendKeys(ConfigReader.getProperty("Test_fiyat"));

    }

    @Given("is testin min. deger boxina min degeri girer")
    public void is_testin_min_deger_boxina_min_degeri_girer() {
        testItem.DefaultValMinBox.sendKeys(ConfigReader.getProperty("Test_Min_Deger"));

    }

    @Given("is testin max. deger boxina max degeri girer")
    public void is_testin_max_deger_boxina_max_degeri_girer() {
        testItem.DefaultValMaxBox.sendKeys(ConfigReader.getProperty("Test_Max_Deger"));
        Driver.wait(5);

    }

    @Given("is save button a tiklar")
    public void is_save_button_a_tiklar() {
        js.executeScript("arguments[0].click();",testItem.SaveButton);

    }

    @Given("is testlerin bulundugu tabloda created date buttonuna tiklar")
    public void is_testlerin_bulundugu_tabloda_created_date_buttonuna_tiklar() {
        //ReusableMethods.waitForClickablility(testItem.createDateButton,3);
        js.executeScript("arguments[0].click();",testItem.createDateButton);
    }

    @Then("ilk satirda Ure testinin oldugunu dogrular")
    public void ilk_satirda_ure_testinin_oldugunu_dogrular() {
        Driver.wait(3);
        Assert.assertEquals(ConfigReader.getProperty("Test_adi"), testItem.NewTestItem.getText());

    }

    @And("is ilk satirda gelen Ure testinin edit buttonuna tiklar")
    public void isIlkSatirdaGelenUreTestininEditButtonunaTiklar() {
        Driver.wait(3);
        testItem.testEditButton.click();

    }

    @And("is test guncelleme ekraninda name box a guncellenecek isim girer")
    public void isTestGuncellemeEkranindaNameBoxAGuncellenecekIsimGirer() {
        testItem.TextBoxName.clear();
        testItem.TextBoxName.sendKeys(ConfigReader.getProperty("New_Test_Name"));

    }

    @And("is description box a guncellenecek test aciklamasini girer")
    public void isDescriptionBoxAGuncellenecekTestAciklamasiniGirer() {
        testItem.descriptionBox.clear();
        testItem.descriptionBox.sendKeys(ConfigReader.getProperty("New_Test_descrp"));

    }

    @And("is test fiyat kutusuna guncellenecek ucreti girer")
    public void isTestFiyatKutusunaGuncellenecekUcretiGirer() {
        testItem.PriceBox.clear();
        testItem.PriceBox.sendKeys(ConfigReader.getProperty("New_Test_fiyat"));

    }

    @And("is testin min. deger boxina guncellenecek min degeri girer")
    public void isTestinMinDegerBoxinaGuncellenecekMinDegeriGirer() {
        testItem.DefaultValMinBox.clear();
        testItem.DefaultValMinBox.sendKeys(ConfigReader.getProperty("New_Test_Min_Deger"));

    }

    @And("is testin max. deger boxina guncellenecek max degeri girer")
    public void isTestinMaxDegerBoxinaGuncellenecekMaxDegeriGirer() {
        testItem.DefaultValMaxBox.clear();
        testItem.DefaultValMaxBox.sendKeys(ConfigReader.getProperty("New_Test_Max_Deger"));

    }

    @Then("is ilk satirda gelen Ure_New testini dogrular")
    public void isIlkSatirdaGelenUre_NewTestiniDogrular() {
        Driver.wait(5);
        Assert.assertEquals(ConfigReader.getProperty("New_Test_Name"),testItem.NewTestItem.getText());
    }

    @And("is ilk satirda gelen Ure testinin delete ikonuna tiklar")
    public void isIlkSatirdaGelenUreTestininDeleteIkonunaTiklar() {
        Driver.wait(2);
        testItem.testDeleteIkon.click();
    }

    @And("is acilan ekranda delete buttonuna tiklar")
    public void isAcilanEkrandaDeleteButtonunaTiklar() {
        Driver.wait(2);
        testItem.deleteButton.click();
        
    }

    @Then("is silinen ogeyi dogrular")
    public void isSilinenOgeyiDogrular() {
        Assert.assertTrue(testItem.popUp.isDisplayed());
    }

    @Given("is test ogelerinin goruntulenebildigini dogrular")
    public void isTestOgelerininGoruntulenebildiginiDogrular()throws IOException {
        Driver.wait(2);
        getScreenshot("test_Items");
    }
}