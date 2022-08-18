package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Medunna_Page {

        public Medunna_Page(){
            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
        public WebElement makeAppointmentButton;

        @FindBy(xpath = "//input[@id='firstName']")
        public WebElement firstNameBox;

        @FindBy(xpath = "//input[@id='lastName']")
        public WebElement lastNameBox;

        @FindBy(xpath = "//input[@id='ssn']")
        public WebElement SSNBox;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement emailBox;

        @FindBy(xpath = "//input[@id='phone']")
        public WebElement phoneBox;

        @FindBy(xpath = "//input[@id='appoDate']")
        public WebElement appointmentDateBox;

        @FindBy(xpath = "//button[@id='register-submit']")
        public WebElement sendAnAppointmentRequestButton;

        @FindBy(xpath = "//div[@class='invalid-feedback']")
        public WebElement hataMesaji;

        // @FindBy(xpath = "//strong[normalize-space()='Appointment registration saved!']")
        @FindBy(xpath = "//div[@role='alert']")
        public WebElement registerOnayMesaji;  // "Appointment registration saved! We will call you as soon as possible."

        @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
        public WebElement myPageButton;

        @FindBy(xpath = "//span[text()='Make an Appointment']")
        public WebElement makeAppintmentclickbutonu;

        @FindBy(xpath = "//span[text()='Appointment date can not be past date!']")
        public WebElement hataliTarihUyariYazisiElementi;




        @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
        public WebElement anaSayfaGirisIkonu;

        @FindBy(xpath = "//a[@id='login-item']")
        public WebElement anaSayfaSignIn;

        @FindBy(xpath = "//input[@id='username']")
        public WebElement UserNameBox;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement passwordBox;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement signIn;

        @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
        public WebElement myPages;



        @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
        public WebElement myPagesButton;

        // @FindBy(xpath = "//span[.='My Appointments']")
        // @FindBy(partialLinkText = "-appointment")
        // @FindBy(xpath = "//a[.='My Appointments']")

        @FindBy(xpath = "//span[normalize-space()='My Appointments']")
        public WebElement myAppointmentButton;



        @FindBy(xpath = "//input[@id='fromDate']")
        public WebElement fromDate;

        @FindBy(id = "toDate")
        public WebElement todate;

    }

