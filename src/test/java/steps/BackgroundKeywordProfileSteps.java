package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundKeywordProfileSteps {
	

@Given("I have logged into the application")
public void i_have_logged_into_the_application() {
    System.out.println("Given statement");
}

@Given("I am at the home page")
public void i_am_at_the_home_page() {
   System.out.println("nav to home page"); 
}

@When("I click on add button")
public void i_click_on_add_button() {
    System.out.println("add button clicked");
}

@When("I enter details")
public void i_enter_details() {
  System.out.println("Details added");
}

@Then("Profile should get created")
public void profile_should_get_created() {
   System.out.println("Profile created !!!");
}

@When("I click on edit button")
public void i_click_on_edit_button() {
	System.out.println("edit button clicked");
}

@When("I update details")
public void i_update_details() {
    System.out.println("Details updated");
   // throw new NullPointerException("Deliberately we are failing  this step");
}

@Then("Profile should get updated")
public void profile_should_get_updated() {
  System.out.println("Profile updated");
}

@When("I click on delete button")
public void i_click_on_delete_button() {
  System.out.println("Delete clicked");
}

@Then("Profile should get deleted")
public void profile_should_get_deleted() {
    System.out.println("Profile deleted!!!");
}


}