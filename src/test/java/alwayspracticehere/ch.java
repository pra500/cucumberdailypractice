package alwayspracticehere;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class ch {
	
	
	
	@Before
	public void setup()
	{
		System.out.println("login in db");
	}
	
	
	
	
	@After
	public void teardown()
	{
		System.out.println("closing db");
	}
	
		
	
	@Given("login in beta")
	public void login_in_beta() {
	 System.out.println("good");
	}

	
	
	@Given("login in beta2")
	public void login_in_beta2() {
	 System.out.println("good2");
	}

}
