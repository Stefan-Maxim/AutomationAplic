package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        SignInPage instance = null;
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By SignInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");
    private By enterButton = By.id("enterbtn");
    private By errormessage = By.id("errormsg");
    private By skipSignIn = By.id("btn2");
    private By enterEmail = By.id("email");
    private By enterEmailB = By.id("enterimg");
    private By enterFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By consent = By.xpath("//input[@aria-label='Accept all']");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(SignInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in button is displayed");
        return driver.findElement(SignInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image button is displayed");
        return driver.findElement(logo).isDisplayed();


    }

    public void insertemail(String email) {
        LOG.info("Input 'Email adress' in field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void insertPassword(String password) {
        LOG.info("Input 'password' in field");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickenterButton(){
        LOG.info("Click 'enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean iserrorMessageDisplayed(){
        LOG.info("Verifi if errormsg is displayed");
        return driver.findElement(errormessage).isDisplayed();
    }

    //Back in browser
    public void clickBack(){
    LOG.info("Click 'back' in browser");
    driver.navigate().back();
    }

    public void clickSkipSignIn() {
        LOG.info("Click 'SKip sign in' button");
        driver.findElement(skipSignIn).click();
    }

    public void writteemail(String wemail) {
        LOG.info("Input 'email' in field");
        driver.findElement(enterEmail).sendKeys(wemail);
    }

    public void clickSignUp() {
        LOG.info("Click 'sign up' button");
        driver.findElement(enterEmailB).click();
    }

    public void enterFirstName(String FirstName) {
        LOG.info("Input 'email' in field");
        driver.findElement(enterFirstName).sendKeys(FirstName);
    }

    public void clickConstent() {
        LOG.info("Click 'consent' button");
        driver.findElement(consent).click();
    }

}


