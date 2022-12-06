package code4life.pages;

import code4life.Base.PageBaseWait;
import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class ElementsPage extends PageBaseWait {

    By elementsBtn = By.xpath("//h5[text()='Elements']");

    By textBox = By.xpath("//span[text()='Text Box']");

    By fullNameField = By.cssSelector("#userName");

    By emailField = By.cssSelector("#userEmail");
    By submitBtn = By.cssSelector("#submit");
    By nameLabel = By.id("name");
    By emailLabel = By.id("email");

    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");

    By currentAddLabel = By.xpath("//p[@id='currentAddress']");
    By permAddressLabel = By.xpath("//p[@id='permanentAddress']");



    public String returnCurrentAddLabel() throws IOException {
     return    wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(currentAddLabel))).getText();



    }

    public String returnPermAddressLabel() throws IOException {
        return    wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(permAddressLabel))).getText();

    }


    public void clickSubmitBtn() throws IOException {

        executor.executeScript("window.scrollBy(0, 400)");
        wait.until(ExpectedConditions.elementToBeClickable(Driver.
                getDriver().findElement(submitBtn))).click();
    }


    public ElementsPage() throws IOException {
    }


    public void clickElements() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.
                getDriver().findElement(elementsBtn))).click();
    }

    public void clickTextBox () throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(textBox))).click();
    }

    public void sendFullName () throws IOException {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().
                findElement(fullNameField))).sendKeys(ConfigurationReader.getValue("name"));
    }
    public void sendFullName (String value) throws IOException {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().
                findElement(fullNameField))).sendKeys(value);
    }


    public void sendEmailValue () throws IOException {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(emailField))).
                sendKeys(ConfigurationReader.getValue("email"));
    }

    public void sendEmailValue (String email ) throws IOException {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(emailField))).
                sendKeys(email);
    }

    public String returnNameText () throws IOException {
        String value = wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(nameLabel))).getText();


        return value;
    }



    public String returnEmailText () throws IOException {
        String value = wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(emailLabel))).getText();


        return value;
    }

    public void sendCurrentAddress(String address) throws IOException {
        wait.until(ExpectedConditions.visibilityOf(Driver.
                getDriver().findElement(currentAddress))).sendKeys(address);
    }

    public void sendPermanentAddress(String PAddress) throws IOException {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(permanentAddress))).sendKeys(PAddress);
    }
}
