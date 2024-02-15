package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {

        String wemail = "nimic@nimic.com";
        String FirstName = "BlaBla";


        LOG.info("Writte 'email' in field");
        signInPage.writteemail(wemail);

        LOG.info("Click 'sign up' button");
        signInPage.clickSignUp();

        LOG.info("Click 'consent' button");
        signInPage.clickConstent();

        LOG.info("Writte 'First name' in field");
        signInPage.enterFirstName(FirstName);



    }
}