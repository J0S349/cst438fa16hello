package feature.day;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edu.csumb.cst438fa16hello.DayOfWeek;

import java.util.Calendar;

public class DaySteps {
    Calendar calendar;

    @When("^I request the day on (\\d+/\\d+/\\d+)$")
    public void i_request_the_day_on(@Format("MM/dd/yyyy") Calendar calendar) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.calendar = calendar;
    }

    @Then("^the day should be (.*)$")
    public void the_day_should_be(String day) throws Throwable {
        assertThat(DayOfWeek.day(calendar), equalTo(day));
    }
}
