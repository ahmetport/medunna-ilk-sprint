package stepdefinitions.JDBC;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

import static utilities.ReadTxt.getDBTestItemNames;
import static utilities.ReadTxt.getTestItemNames;
import static utilities.WriteToTxt.saveDBTestItemsData;

public class US17_DBStepDefs {

    List< Object> allTestItemNames;

    @Given("user creates connection with DB using {string} and {string} , {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DBUtils.createConnection(url, username,password);
    }
    @Given("user sends query to DB and gets the column data {string} and {string}")
    public void user_sends_the_query_to_db_and_gets_the_column_data_and(String query, String columnName) {
        allTestItemNames = DBUtils.getColumnData(query, columnName);
        System.out.println(allTestItemNames);
        System.out.println(allTestItemNames.size());
    }
    @Given("user saves DB records to correspondent files")
    public void user_saves_the_db_records_to_correspondent_files()
    {
        saveDBTestItemsData(allTestItemNames);//bütün test isimlerini kayıt ettik yazdırdık
    }

    @Then("user validates DB test item data")
    public void user_validates_db_registrant_data() {
        List<String> expectedTestItemNamesUI = getTestItemNames();

        List<String> actualDatabaseData = getDBTestItemNames();//SQL sorgusu ile getirilen tüm kayıtlar
        Assert.assertTrue(actualDatabaseData.containsAll(expectedTestItemNamesUI));
        System.out.println(actualDatabaseData);
        System.out.println(expectedTestItemNamesUI);
    }


}

