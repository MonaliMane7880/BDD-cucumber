package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	@Given("user is already logged in")
	public void user_is_already_logged_in() {
		System.out.println("Given Statement");
	}

	@When("user clicks on current order button")
	public void user_clicks_on_current_order_button() {
		System.out.println("fetching current order info");
	}

	@Then("current order information should display")
	public void current_order_information_should_display() {
		System.out.println("current order info validated!!");
	}

	@When("user clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("fetching cancelled order info");
	}

	@Then("cancelled order information should display")
	public void cancelled_order_information_should_display() {
		System.out.println("Cancelled order info validated");
	}

	@When("user click on order history")
	public void user_click_on_order_history() {
		System.out.println("fetching complete order info");
	}

	@Then("completed order information should display")
	public void completed_order_information_should_display() {
		System.out.println("Completed order info validated");
	}




}
