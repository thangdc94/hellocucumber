package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {
    private String today;
    private String actualAnswer;


    @Given("^today is \"([^\"]*)\"$")
    public void todayIs(String today) throws Throwable {
        this.today = today;
    }

    @When("^I ask whether it's Friday yet$")
    public void iAskWhetherItSFridayYet() throws Throwable {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void iShouldBeTold(String expectedAnswer) throws Throwable {
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
