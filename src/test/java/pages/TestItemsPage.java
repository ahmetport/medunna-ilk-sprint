package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestItemsPage {
    public  TestItemsPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    //US17 locateler
    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemTitiesButton;
    @FindBy(xpath = "(//*[text()='Test Item'])[1]")
    public WebElement TestItem;
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement NewCreate;
    @FindBy(xpath = "//input[@ id='c-test-item-name']")
    public WebElement TextBoxName;
    @FindBy(xpath = "//input[@id='c-test-item-description']")
    public WebElement descriptionBox;
    @FindBy(xpath = "//input[@id='c-test-item-price']")
    public WebElement PriceBox;
    @FindBy(xpath = "//input[@id='c-test-item-defaultValMin']")
    public WebElement DefaultValMinBox;
    @FindBy(xpath = "//input[@id='c-test-item-defaultValMax']")
    public WebElement DefaultValMaxBox;
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement SaveButton;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    public WebElement islemBasarili;

    @FindBy (xpath = "//thead/tr/th[1]")
    public WebElement testID;

    @FindBy (xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement view;
    @FindBy (xpath = "(//span[text()='Test Item'])[2]")
    public WebElement viewSayfa;
   // @FindBy (xpath = "(//*[@class='btn btn-link btn-sm'])[1]")
    //public WebElement NewTestİd;
   @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]")
    public  WebElement NewTestItem;
   @FindBy(xpath = "(//*[@data-icon='eye'])[1]")
    public WebElement ViewButton;
   @FindBy(xpath = "(//*[text()='Test Item'])[1]")
    public WebElement TestItemHeader;
    @FindBy(xpath = "//table/thead/tr/th[7]")
    public WebElement createDateButton;
    @FindBy(xpath = "//table/tbody/tr[1]/td[8]/div/a[2]")
    public WebElement testEditButton;
    @FindBy(xpath = "//table/tbody/tr[1]/td[8]/div/a[3]")
    public WebElement testDeleteIkon;
    @FindBy(id = "jhi-confirm-delete-cTestItem")
    public WebElement deleteButton;
    @FindBy(className = "Toastify__toast-body")
    public WebElement popUp;

}
