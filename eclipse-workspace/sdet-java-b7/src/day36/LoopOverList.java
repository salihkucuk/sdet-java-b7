package day36;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LoopOverList {
	public static void main(String[] args) {
		List<String> customers = new ArrayList<>();
		customers.add("Oliver");
		customers.add("William");
		customers.add("Anna");
		customers.add("James");
		customers.add("John");
		
		// Loop over the list
		// 1. By using regular loop
		
		for (int i = 0; i < customers.size(); i++) {
			String eachElement = customers.get(i);
			System.out.println(eachElement);
			customers.set(i, eachElement.toUpperCase());
		}
		System.out.println(customers);
		System.out.println("---");
		
		// 2. By using for each loop
		for (String element : customers) {
			System.out.println(element + " : " + element.length());
		}
		System.out.println("---");
		
		// 3. By using Iterator
		//    [OLIVER, WILLIAM, ANNA, JAMES, JOHN]
		// ^
		Iterator<String> iterator = customers.iterator();

		// hasNext() -> checks if iterator has next element
		// next()    -> returns next element and moves the focus to right
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}