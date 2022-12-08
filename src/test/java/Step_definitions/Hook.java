package Step_definitions;

import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hook {

    @Before
    public void setup() throws IOException {
        System.out.println("Test setup ");
        String url = ConfigurationReader.getValue("site");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(url);
    }

    @After
    public void teardown  (){
        System.out.println("Terminating browser");
        Driver.closeDriver();
    }
}
