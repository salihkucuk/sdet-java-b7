package day14;

import util.InputFromUser;

public class GroceryStore {
public static void main(String[] args) {
	String item=InputFromUser.getInput("Enter item name:");
	
	double price=0.0;
	
	switch(item) {
	case "bread":
		price=4.99;
		break;
	case "water":
		price=2.99;
		break;
	case "apple":
		price=2.99;
		break;
	case "red bull":
		price=1.5;
		break;
	default:
		System.out.println("Invalid item name: "+item);
		
	}
	
	System.out.println("Item: "+item);
	System.out.println("Price "+ price);
}
}
