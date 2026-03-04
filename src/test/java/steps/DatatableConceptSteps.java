package steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DatatableConceptSteps {
	
	String firstIndexOfFirstList;
	
	@Given("user is at accounts page")
	public void user_is_at_accounts_page() {
	  System.out.println("Given statement"); 
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) 
	{
		List<List<String>> data = dataTable.asLists();
		
		List<String> firstList = data.get(1);// defines the row index position
	
		System.out.println(firstList);
		
		 firstIndexOfFirstList = firstList.get(1);
		
		System.out.println(firstIndexOfFirstList);
		
		String firstRowAndZerothValue = data.get(1).get(0);
		
		System.out.println(firstRowAndZerothValue);
		
		for(String ss:firstList)
		{
			System.out.println(ss);
		}
		
		System.out.println("******************************");
		
		List<Map<String, String>> mapData = dataTable.asMaps();
		
		Map<String, String> row = mapData.get(0);
		
		String zerothRowEmailaddress = row.get("email");
		
		
		System.out.println(zerothRowEmailaddress);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	  System.out.println("Clicked on submit");
	  
	  System.out.println("Value is :" + firstIndexOfFirstList );
	  
	  Assert.assertEquals("Smith", firstIndexOfFirstList);
	}

	@Then("user should get confirmation")
	public void user_should_get_confirmation() {
	   System.out.println("Confirmation received!!!");
	}



}