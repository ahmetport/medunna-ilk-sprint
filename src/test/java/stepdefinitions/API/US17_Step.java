package stepdefinitions.API;

import base_Url.MedunnaCıtemBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.TestItem;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US17_Step  extends MedunnaCıtemBaseUrl {

    TestItem testItem = new TestItem();
    ReusableMethods reusableMethods;
    Response response;
    int NewPrice = 10;


    @Given("admin items icin url alma istegi gonderir")
    public void adminItemsIcinUrlAlmaIstegiGonderir() {
        response = ApiUtils.getRequest(generateToken(ConfigReader.getProperty("adminUN"), ConfigReader.getProperty("adminPW")), "https://medunna.com/api/c-test-items/212174");
        response.prettyPrint();
    }
    @And("admin Status Code {int} oldugunu dogrular")
    public void adminStatusCodeOldugunuDogrular(int stCode) {
        Assert.assertEquals(stCode,response.getStatusCode());

}

    @Then("kullanici API kayitlarini onaylar")
    public void kullaniciAPIKayitlariniOnaylar() throws IOException {

        testItem.setDefaultValMax(ConfigReader.getProperty("New_Test_Max_Deger"));
        testItem.setDefaultValMin(ConfigReader.getProperty("New_Test_Min_Deger"));
        testItem.setDescription(ConfigReader.getProperty("New_Test_descrp"));
        testItem.setName(ConfigReader.getProperty("New_Test_Name"));
        testItem.setPrice(NewPrice);

        ObjectMapper obj = new ObjectMapper();
        TestItem actualTestItem= obj.readValue(response.asString(),TestItem.class);

        System.out.println("actualTestItem = " + actualTestItem);
        System.out.println("expected data=" + testItem);

        Assert.assertEquals("Test item isimleri farkli",testItem.getName(),actualTestItem.getName());
        Assert.assertEquals("Test item defMinValue farkli",testItem.getDefaultValMin(),actualTestItem.getDefaultValMin());
        Assert.assertEquals("Test item defMaxValue farkli",testItem.getDefaultValMax(),actualTestItem.getDefaultValMax());
        Assert.assertEquals("Test item description farkli",testItem.getDescription(),actualTestItem.getDescription());
        Assert.assertEquals("Test item price farkli",testItem.getPrice(),actualTestItem.getPrice());


    }




    }

