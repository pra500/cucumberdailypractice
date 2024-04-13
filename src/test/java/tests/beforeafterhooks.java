package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class beforeafterhooks {
	
	
	
	@Before
	public void start()
	{
		System.out.println("pgm start");
	}
	
	
	@After
	public void stop()
	{
		System.out.println("pgm stop");
	}
	
	
	@Given("our alpha beta")
	public void our_alpha_beta() {
	   System.out.println("hellllll");
	}
	

}
