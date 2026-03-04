package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	@Given("I am at the login page")
	public void navToLoginPage()
	{
		System.out.println("naviagted to login page");
	}
	
	@When("I enter the username")
	public void enterUsername()
	{
		System.out.println("username entered!!");
	}
	
	@When("I enter the password")
	public void enterPwd()
	{
		System.out.println("password entered");
	}
	@When("I click on login button")
	public void loginToApp()
	{
		System.out.println("clicked on login!!");
	}
	
	@Then("I should be able to login")
	public void ableToLogin()
	{
		System.out.println("login validated!!");
	}
	
	
	}

