package day42;

import java.util.ArrayList;
import java.util.List;

public class PizzaDemo {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setPrice(19.5);
		
		List<String> myToppings = new ArrayList<>();
		myToppings.add("cheese");
		myToppings.add("chicken");
		// myToppings.add("broccoli");
		pizza.setToppings(myToppings);
		
		myToppings.add("broccoli");
		
		System.out.println(pizza.getPrice()); // 19.5
		System.out.println(pizza.getToppings()); // [cheese, chicken]
		System.out.println("---");
		
		List<String> pizzaToppings = pizza.getToppings();
		pizzaToppings.add("broccoli");
		System.out.println("toppings in the client side:" + pizzaToppings);
		
		System.out.println("---");
		System.out.println(pizza.getPrice());
		System.out.println("orininal: " + pizza.getToppings());
	}
}