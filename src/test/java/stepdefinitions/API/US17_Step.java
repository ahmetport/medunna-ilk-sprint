package stepdefinitions.API;

import base_Url.MedunnaCıtemBaseUrl;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.TestItem;
import utilities.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.ApiUtils.postRequestTestItems;
import static utilities.Authentication.generateToken;
//import static utilities.WriteToTxt.saveTestItemInfo;

public class US17_Step extends MedunnaCıtemBaseUrl {


    TestItem testItem = new TestItem();
    Response response;
    int NewPrice = 0;


    @Given("admin items icin url alma istegi gonderir")
    public void adminItemsIcinUrlAlmaIstegiGonderir() {
        response = ApiUtils.getRequest(generateToken(ConfigReader.getProperty("adminUN"),
                ConfigReader.getProperty("adminPW")), "https://medunna.com/api/c-test-items/217515");
        response.prettyPrint();
    }

    @And("admin Status Code {int} oldugunu dogrular")
    public void adminStatusCodeOldugunuDogrular(int stCode) {
        assertEquals(stCode, response.getStatusCode());

    }

    @Then("kullanici API kayitlarini onaylar")
    public void kullaniciAPIKayitlariniOnaylar() throws IOException {

        testItem.setDefaultValMax(ConfigReader.getProperty("New_Test_Max_Deger"));
        testItem.setDefaultValMin(ConfigReader.getProperty("New_Test_Min_Deger"));
        testItem.setDescription(ConfigReader.getProperty("New_Test_descrp"));
        testItem.setName(ConfigReader.getProperty("New_Test_Name"));
        testItem.setPrice(NewPrice);

        ObjectMapper obj = new ObjectMapper();
        TestItem actualTestItem = obj.readValue(response.asString(), TestItem.class);

        System.out.println("actualTestItem = " + actualTestItem);
        System.out.println("expected data=" + testItem);

        assertEquals("Test item isimleri farkli", testItem.getName(), actualTestItem.getName());
        assertEquals("Test item defMinValue farkli", testItem.getDefaultValMin(), actualTestItem.getDefaultValMin());
        assertEquals("Test item defMaxValue farkli", testItem.getDefaultValMax(), actualTestItem.getDefaultValMax());
        assertEquals("Test item description farkli", testItem.getDescription(), actualTestItem.getDescription());
        assertEquals("Test item price farkli", testItem.getPrice(), actualTestItem.getPrice());


    }


    @And("Api kullanarak yeni bir data olusturma {string} uzerinde post etme")
    public void apiKullanarakYeniBirDataOlusturmaUzerindePostEtme(String field) {
        Faker faker = new Faker();
        String endpoint = "https://medunna.com/api/" + field + "";
        /////////////////////  c-test-items  /////////////////////
        //set the expected data (data ekleme) tokenin guncel oldugunu kontrol et postman için
        testItem.setDescription("konya");
        testItem.setPrice(51);
        testItem.setDefaultValMax("42");
        testItem.setDefaultValMin("27");
        testItem.setName("Team51_" + faker.name().firstName());
        response = ApiUtils.postRequestTestItems(endpoint, testItem);
        response.prettyPrint();

        response.then().assertThat().statusCode(201);


    }

    @And("kullanici post request validition yapar")
    public void kullaniciPosrRequestValiditionYapar()throws Exception {

        //1 VALİDİTİON

        ObjectMapper obj = new ObjectMapper();
        TestItem actualDataItem = obj.readValue(response.asString(), TestItem.class);

        Assert.assertEquals(testItem.getDescription(), actualDataItem.getDescription());
        Assert.assertEquals(testItem.getDefaultValMin(), actualDataItem.getDefaultValMin());
        Assert.assertEquals(testItem.getDefaultValMax(), actualDataItem.getDefaultValMax());
        Assert.assertEquals(testItem.getPrice(), actualDataItem.getPrice());


        //2 VALİDİTİON
        Gson gson = new Gson();
        TestItem actualDataItem1 = gson.fromJson(response.asString(), TestItem.class);

        Assert.assertEquals(testItem.getDescription(), actualDataItem1.getDescription());
        Assert.assertEquals(testItem.getDefaultValMin(), actualDataItem1.getDefaultValMin());
        Assert.assertEquals(testItem.getDefaultValMax(), actualDataItem1.getDefaultValMax());
        Assert.assertEquals(testItem.getPrice(), actualDataItem1.getPrice());


    }
}









