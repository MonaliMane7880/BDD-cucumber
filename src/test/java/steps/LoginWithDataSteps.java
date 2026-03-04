package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("user is at login page")
	public void goToLoginPage()
	{
		System.out.println("navigated to login page");
	}
	
	@When("user enters username as {string}")
	public void enterUsrname(String usrName)
	{
		System.out.println("Entered username "+usrName);
	}

	@When("user enters password as {string}")
	public void enterPwd(String pwd)
	{
		System.out.println("entered password is : "+pwd);
	}
	
	@When("user clicks on login button")
	public void ClickedOnLogin()
	{
		System.out.println("clicked on login!!");
	}
	
	@Then("user should be logged in")
	public void validateLogin()
	{
		System.out.println("Login validated!!!");
	}
	
	@When("user clicks on login {int} button with size {double}")
	public void clickedOnLogin(int value, Double d)
	{
		System.out.println("clicked on login "+value+" fractional value is :"+d);
	}
}


