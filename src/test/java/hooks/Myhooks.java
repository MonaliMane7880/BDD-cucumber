package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Myhooks {
	
	@Before(value = "@sanity", order = 1)
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
	@Before(value="@functional", order = 2)
	public void beforeHook2()
	{
		System.out.println("Before hook2 is executing");
	}
	
	//@After(order = 0)
	//public void afterHook1()
	//{
		//System.out.println("after hook1 is running");
	//}
	
	@After("@regression")
	public void afterHook2()
	{
		System.out.println("after hook2 is running");
	}
	
	@BeforeStep("@sanity")
	public void beforeStep1()
	{
		System.out.println("Before step1 is executing");
	}
	
	@AfterStep("@regression")
	public void AfterStep1()
	{
		System.out.println("After step1 is executing");
	}
	
	//@BeforeStep(order = 2)
	//public void beforeStep2()
	//{
		//System.out.println("Before step2 is executing");
	//}
	
	//@AfterStep(order = 2)
	//public void AfterStep2()
	//{
		//System.out.println("After step2 is executing");
	//}
	
	@BeforeAll(order = 1)
	public static void beforeAll1()
	{
		System.out.println("Before all1 is executing");
	}
	
	@BeforeAll(order = 2)
	public static void beforeAll2()
	{
		System.out.println("before all2 is executing");
	}
}