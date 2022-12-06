package Step_definitions;

import code4life.pages.ElementsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;
import java.util.Map;

public class FillingOutForm {

    @Given("user is on the form page")
    public void user_is_on_the_form_page() throws IOException {
        ElementsPage e = new ElementsPage();
        e.clickElements();
        e.clickTextBox();
    }




    @When("user enters the following information:")
    public void user_enters_the_following_information(Map<String, String > dataTable) throws IOException {
    ElementsPage page = new ElementsPage();
    page.sendFullName(dataTable.get("fullName"));
    page.sendEmailValue(dataTable.get("email"));
    page.sendCurrentAddress(dataTable.get("currentAddress"));
    page.sendPermanentAddress(dataTable.get("permanentAdd"));

    }
    @When("user clicks the submit button")
    public void user_clicks_the_submit_button() throws IOException {
     ElementsPage page = new ElementsPage();
     page.clickSubmitBtn();
    }
    @Then("the user should be able to verify the below information:")
    public void the_user_should_be_able_to_verify_the_below_information(Map<String, String > dataTable ) throws IOException {
        ElementsPage page = new ElementsPage();
        String n ="Name:";
       String actualFullName = n+ dataTable.get("fullName");
        Assert.assertEquals(actualFullName, page.returnNameText());

        String e ="Email:";
        String actualEmail=e+dataTable.get("email");
        Assert.assertEquals(actualEmail, page.returnEmailText());

        String c ="Current Address :";
        String actualCurrentAdd = c+dataTable.get("currentAddress");
        Assert.assertEquals(actualCurrentAdd, page.returnCurrentAddLabel());
        String p ="Permananet Address :";
        String actualPermAdd = p+dataTable.get("permanentAdd");
        Assert.assertEquals(actualPermAdd, page.returnPermAddressLabel());
    }


}
