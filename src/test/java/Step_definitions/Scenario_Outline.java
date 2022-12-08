package Step_definitions;

import code4life.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class Scenario_Outline {

    @When("user enter {string} username and {string} password")
    public void user_enter_username_and_password(String string, String string2) throws IOException {
        LoginPage page = new LoginPage();
        page.loginWithParameters(string, string2);

    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() throws IOException {
     LoginPage page = new LoginPage();
     page.clickLoginBtn();
    }
    @Then("the user should verify the visibility of the following {string}")
    public void the_user_should_verify_the_visibility_of_the_following(String string) throws IOException {
    LoginPage page = new LoginPage();

    String actualText ="PRODUCTS";
        Assert.assertEquals(actualText, page.returnProductText());

    }

}
