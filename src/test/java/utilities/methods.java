package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Appointments;

public class methods {


    static Appointments enter = new Appointments();
    static Actions action = new Actions(Driver.getDriver());

    public static void adminGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        enter.accountMenu.click();
        enter.signIn.click();
        enter.userName.click();
        action.sendKeys(ConfigReader.getProperty("adminUN"),
                Keys.TAB, ConfigReader.getProperty("adminPW"), Keys.TAB, Keys.TAB, Keys.
                        TAB, Keys.TAB, Keys.ENTER).perform();
    }

    public static void staffGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        enter.accountMenu.click();
        enter.signIn.click();
        enter.userName.click();
        action.sendKeys(ConfigReader.getProperty("staffUN"),
                Keys.TAB, ConfigReader.getProperty("staffPW"), Keys.TAB, Keys.TAB, Keys.
                        TAB, Keys.TAB, Keys.ENTER).perform();
    }

    public static void patientGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        enter.accountMenu.click();
        enter.signIn.click();
        enter.userName.click();
        action.sendKeys(ConfigReader.getProperty("patientUN"),
                Keys.TAB, ConfigReader.getProperty("patientPW"), Keys.TAB, Keys.TAB, Keys.
                        TAB, Keys.TAB, Keys.ENTER).perform();

    }

    public static void physicianGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        enter.accountMenu.click();
        enter.signIn.click();
        enter.userName.click();
        action.sendKeys(ConfigReader.getProperty("physicianUN"),
                Keys.TAB, ConfigReader.getProperty("physicianPW"), Keys.TAB, Keys.TAB, Keys.
                        TAB, Keys.TAB, Keys.ENTER).perform();
    }

    public static void userGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        enter.accountMenu.click();
        enter.signIn.click();
        enter.userName.click();
        action.sendKeys(ConfigReader.getProperty("userUN"),
                Keys.TAB, ConfigReader.getProperty("userPW"), Keys.TAB, Keys.TAB, Keys.
                        TAB, Keys.TAB, Keys.ENTER).perform();
    }


        }



