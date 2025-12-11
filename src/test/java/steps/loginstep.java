package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("user is on the login ");
        System.out.println("text");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        System.out.println("user enters valid credentials");
    }

    @Then("user should be navigated to the home page")
    public void userShouldBeNavigatedToTheHomePage() {
        System.out.println("user should be navigated to the home page");
    }
}

