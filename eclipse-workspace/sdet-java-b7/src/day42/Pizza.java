package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * For mutable objects and arrays
 * - we always need to assign a copy in the set  method
 * - we always need to return a copy in the get method
 */
public class Pizza {
	public final String[] AVAILABLE_TOPPINGS = {"cheese", "chicken", "veggie", "mushrooms"};
	
	private double price;
	private List<String> toppings;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}
	
	public List<String> getToppings() {
		// we shoudn't return original reference of our mutable object property
		// we always need to return copy of this
		List<String> copyOfToppings = new ArrayList<>(toppings);
		return copyOfToppings;
		// return toppings;
	}
	
	public void setToppings(List<String> toppings) {
		for (String topping: toppings) {
			if (topping == null || !Arrays.asList(AVAILABLE_TOPPINGS).contains(topping)) {
				throw new IllegalArgumentException("This topping is not available: " + topping);
			}
		}

		// this.toppings = toppings;
		// get copy of mutable Object and assign it
		this.toppings = new ArrayList<>(toppings);
	}
}