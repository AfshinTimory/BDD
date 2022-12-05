package Step_definitions;

import code4life.pages.LoginPage;
import code4life.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class DisplayLoginErrorMsg {

    @When("the user enters incorrect username and password")
    public void the_user_enters_incorrect_username_and_password() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText(ConfigurationReader.getValue("user2"));
        page.sendPasswordText(ConfigurationReader.getValue("pass2"));
        page.clickLoginBtn();
    }




    @Then("user should be denied access and the below error message should be displayed and verified")
    public void user_should_be_denied_access_and_the_below_error_message_should_be_displayed_and_verified() throws IOException {
    LoginPage page = new LoginPage();
        System.out.println("TEST2 ");
        String actual ="Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actual, page.returnLoginErrorText());
    }

}
