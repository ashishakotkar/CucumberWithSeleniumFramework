package steps;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given; //command+Shift+O to do the imports
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("User navigates to the bookcart application")
	public void userNavigatesToTheBookcartApplication() {
		System.out.println("Hey I am mapped");
	}

	@Given("User enters the username as {string}")
	public void userEntersTheUsernameAs(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("user enters the password as {string}")
	public void userEntersThePasswordAs(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
		System.out.println("Hey I am mapped");
	}

	@Then("the login should be successful")
	public void theLoginShouldBeSuccessful() {
		System.out.println("Hey I am mapped");
	}
	
	@But("the login should fail")
	public void theLoginShouldFail() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
