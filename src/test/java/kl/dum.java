package kl;

import io.cucumber.java.en.*;

public class dum {
	
	@Given("the user has items in the cart {string}")
	public void the_user_has_items_in_the_cart(String string) {
	   System.out.println(string);
	}

}
