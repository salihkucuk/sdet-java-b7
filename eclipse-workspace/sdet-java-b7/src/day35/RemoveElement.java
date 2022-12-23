package day35;

import java.util.ArrayList;

public class RemoveElement {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		
		System.out.println(cars); // [bmw, audi, honda]
		
		// remove(index)
		cars.remove(0);
		System.out.println(cars); // [audi, honda]
		
		// remove(value)
		cars.remove("honda");
		System.out.println(cars); // [audi]
		
		cars.add("tesla"); // add tesla
		System.out.println(cars); // [audi, tesla]
		System.out.println("---");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(9);
		numbers.add(7);
		numbers.add(3);
		numbers.add(1);
		numbers.add(8);
		//                               0  1  2  3  4
		System.out.println(numbers); // [9, 7, 3, 1, 8]
		
		numbers.remove(1); // remove by index
		System.out.println(numbers); // [9, 3, 1, 8]
		
		Integer valueToRemove = 1;
		numbers.remove(valueToRemove); // remove by value
		System.out.println(numbers); // [9, 3, 8]
 	}
}