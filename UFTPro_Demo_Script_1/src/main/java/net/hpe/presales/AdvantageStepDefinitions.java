package net.hpe.presales;

import java.io.IOException;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.Verify;

import com.sun.org.apache.xml.internal.utils.StringComparable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;


/**
 * Created by Administrator on 8/14/2016.
 */
public class AdvantageStepDefinitions
{
    Browser browser;

    @Before
    public void beforeVerifyScenario(Scenario scenario) throws IOException, GeneralLeanFtException, ReportException {
        //the following will start a new test node in the report
        browser = BrowserFactory.launch(BrowserType.CHROME);

    }

    @After
    public void afterVerifyScenario() throws InterruptedException, ReportException, GeneralLeanFtException {
        browser.close();
    }

    @Given("^I am in the Google web site$")
    public void i_am_in_the_Google_web_site() throws Throwable {
        browser.navigate("http://www.google.com");
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Given("^I search for MSN$")
    public void i_search_for_MSN() throws Throwable {

        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .type("text")
                .tagName("INPUT")
                .name("q").build()).setValue("MSN");

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .tagName("INPUT")
                .name("Google Search").build()).click();
        // Write code here that turns the phrase above into concrete actions
   //     throw new PendingException();
    }

    @When("^I view MSN page$")
    public void i_view_MSN_page() throws Throwable {

        browser.describe(Link.class, new LinkDescription.Builder()
                .tagName("A")
                .innerText("MSN.com - Hotmail, Outlook, Skype, Bing, Latest News, Photos & Videos").build()).click();
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
    }

    @Then("^the MSN logo is displayed$")
    public void the_MSN_log_is_displayed() throws Throwable {
        String display_text = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("H1")
                .innerText("msn refresh page msn ").build()).getOuterText();

        System.out.println("Displayed text is  "  + display_text);

        if (!display_text.equalsIgnoreCase("MSN")) {
            //System.out.println("Displayed text is"  + display_text);
            Assert.fail("MSN page is not displayed Displayed text is  "  + display_text);
        }
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
    }



}
