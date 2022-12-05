package Step_definitions;

import code4life.pages.LoginPage;
import code4life.utilities.BrowserUtils;
import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.io.IOException;
import java.sql.SQLOutput;

public class LoginTest {

    @Given("user is on the login")
    public void user_is_on_the_login() throws IOException {
        Driver.getDriver().get(ConfigurationReader.getValue("site"));
    }




    @When("user enters correct username and password")
    public void user_enters_correct_username_and_password() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText(ConfigurationReader.getValue("user"));
        page.sendPasswordText(ConfigurationReader.getValue("pass"));
        page.clickLoginBtn();
    }
    @Then("the user should login successfully and must verify that the word products is visible")
    public void the_user_should_login_successfully_and_must_verify_that_the_word_products_is_visible() throws IOException {
        System.out.println("TEST1");
        LoginPage page = new LoginPage();
        String actual ="PRODUCTS";
        System.out.println(page.returnProductText());

       Assert.assertEquals(actual, page.returnProductText());




    }

}
