package alwayspracticehere;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;


public class jk {
	
	@BeforeStep
	public void setee()
	{
		System.out.println("welcome1");
		
	}
	
	
	@AfterStep
	public void tearrr()
	{

		System.out.println("welcome2");	
		
	}
	
	
	@Given("logineeee the functional testinn")
	public void logineeee_the_functional_testinn() {
	  System.out.println("important");
	}
	
	
	
	@When("do sanity")
	public void do_sanity() {
	   System.out.println("unimportant");
	}

	
	@Given("logineeee the functional testinn duplicate")
	public void logineeee_the_functional_testinn_duplicate() {
	    System.out.println("less important");
	}
}
