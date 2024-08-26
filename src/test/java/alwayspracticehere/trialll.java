package alwayspracticehere;

import io.cucumber.java.en.*;

public class trialll {

	
	@Given("login by security group1")
	public void login_by_security_group1() {
	System.out.println("data1");
	}

	 @When("login by security group1 {string} and {string}")
	public void login_by_security_group1_pt_and_pt(String s, Integer int1) {
		System.out.println(s + " " + int1);
	}
	 	 
}
