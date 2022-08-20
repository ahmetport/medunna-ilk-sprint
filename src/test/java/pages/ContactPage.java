package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


      @FindBy(xpath = "//*[text()='CONTACT']")
    public WebElement contactButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nametText;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailText;
    @FindBy(xpath = "//input[@id='subject']")
    public WebElement subjectText;
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageText;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendButton;
    @FindBy(xpath ="//*[contains (text(),'Your message has been received')]" )
    public WebElement receivedMessage;
    @FindBy(xpath = "//*[text()='Name is required.']")
    public WebElement nameIsRequiredMessage;
    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement yourEmailIsRequiredMessage;
    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement subjectThisFieldIsRequiredMessage;
    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement thisFieldIsInvalidMessage;
    @FindBy(xpath = "(//span)[10]")
    public WebElement contact;















}
