package Step_definitions;

import code4life.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class TitleVerification {

    @Then("user should be able to verify the title")
    public void user_should_be_able_to_verify_the_title() throws IOException {
        Assert.assertEquals("Swag Labs", Driver.getDriver().getTitle());
    }
}
