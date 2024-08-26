package jkk;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class d {

	
	@Before
	public void e()
	{
		System.out.println("starting welcome productpage");
	}
	
	
	@Given("enter product")
	public void enter_product() {
	 System.out.println("byeeee444");
	}
	
	@After
	public void ee()
	{
		System.out.println("ending welcome productpage");
	}
}
