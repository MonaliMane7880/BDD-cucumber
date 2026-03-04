package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at the signup page")
	public void user_is_at_the_signup_page() {
	    System.out.println("Given Statement");
	}

	@When("user enters name as {string} on form")
	public void user_enters_name_as_on_form(String string) {
		System.out.println("Entered name is " +string);
	}

	@When("user selects gender as {string} with weight is {double}")
	public void user_selects_gender_as_with_weight_is(String string, Double wgt) {
		System.out.println("Selected gender is : "+string);
		System.out.println("entered weight is : "+wgt);
	}

	@When("user selects slotnumber as {int}")
	public void user_selects_slotnumber_as(Integer int1) {
		System.out.println("slot number : "+int1);
	}

	@Then("user gets created")
	public void user_gets_created() {
		System.out.println("user creation done");
	}

}
