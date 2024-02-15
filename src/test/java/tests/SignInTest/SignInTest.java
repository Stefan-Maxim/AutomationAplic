package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
        String email = "nimic@yahoo.com";
        String password = "nimic";

        LOG.info("Check 'Sign in' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInPage.clickSignInButton();

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed());

        LOG.info("Insert 'Email'");
        signInPage.insertemail(email);

        LOG.info("Insert password");
        signInPage.insertPassword(password);

        LOG.info("Click 'enter' button");
        signInPage.clickenterButton();

        LOG.info("Verify if errormsg is displayed");
        Assert.assertTrue(signInPage.iserrorMessageDisplayed());

        LOG.info("Navigate back in browser");
        signInPage.clickBack();

        LOG.info("Click 'skip sing in' button");
        signInPage.clickSkipSignIn();




    }
}
