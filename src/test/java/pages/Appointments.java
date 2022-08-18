package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class Appointments {


  public Appointments() {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//li[@id='account-menu']")
  public WebElement accountMenu;

  @FindBy(xpath = "//span[text()='Sign in']")
  public WebElement signIn;

  @FindBy(xpath = "//input[@name='username']")
  public WebElement userName;

  //benim locateler
  @FindBy(xpath = "//li[@id='account-menu']")
  public WebElement girisIkonu;

  @FindBy(xpath = "//h1[text()='Welcome to MEDUNNA']")
  public WebElement welcomeToMedunna;

  @FindBy(xpath = "//span[text()='Sign in']")
  public WebElement anaSayfaSignIn;


  @FindBy(xpath = "//div[@id='login-title']")
  public WebElement signInMenusu;

  @FindBy(xpath = "//input[@name='username']")
  public WebElement girisUsernameTextBox;

  @FindBy(xpath = "//input[@name='password']")
  public WebElement girisPasswordTextBox;


  @FindBy(xpath = "//button[@type='submit']")
  public WebElement girisSignInButton;

  @FindBy(xpath = "//li[@id='entity-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']//*[name()='svg']")
  public WebElement myPagesElementi;

  @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
  public WebElement sagUstKullaniciAdi;

  @FindBy(xpath = "//span[text()='Settings']")
  public WebElement settingsButton;

  @FindBy(xpath = "//span[text()='User settings for [']")
  public WebElement userSettingsFor;

  @FindBy(xpath = "//input[@name='firstName']")
  public WebElement settingsFirstnameTextBox;

  @FindBy(xpath = "//input[@name='lastName']")
  public WebElement settingsLastnameTextBox;


  @FindBy(xpath = "//input[@name='email']")
  public WebElement settingsEmailTextBox;

  @FindBy(xpath = "//span[normalize-space()='Save']")
  public WebElement settingsSaveButton;


  @FindBy(xpath = "//span[normalize-space()='Save']")
  public WebElement settingsDegisikliklerKaydedildiElement;



  }























