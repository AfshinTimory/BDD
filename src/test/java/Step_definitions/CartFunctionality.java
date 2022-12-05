package Step_definitions;

import code4life.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class CartFunctionality {

    @When("user clicks on the Backpack item1")
    public void user_clicks_on_the_Backpack_item1() throws IOException {
        CartPage page = new CartPage();
        page.clickBackPack();

    }
    @When("user clicks on the Bike item2")
    public void user_clicks_on_the_Bike_item2() throws IOException {
        CartPage page = new CartPage();
        page.clickBike();
    }
    @When("user clicks on the shirt item3")
    public void user_clicks_on_the_shirt_item3() throws IOException {
        CartPage page = new CartPage();
        page.clickTShirt();
    }
    @When("user clicks the cart")
    public void user_clicks_the_cart() throws IOException {
        CartPage page = new CartPage();
        page.clickCart();
    }
    @When("user gets total items existing in the cart")
    public void user_gets_total_items_existing_in_the_cart() throws IOException {


    }
    @Then("the total number of items existing in the cart should match the actual items number")
    public void the_total_number_of_items_existing_in_the_cart_should_match_the_actual_items_number() throws IOException {
        CartPage page = new CartPage();
        int actualSize = 3;
        int size =  page.returnCartItemsNumber();
        Assert.assertEquals(actualSize, size);
    }

}
