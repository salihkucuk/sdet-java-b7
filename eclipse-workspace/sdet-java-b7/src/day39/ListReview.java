package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListReview {
	public static void main(String[] args) {
		// What's the difference between array and ArrayList?
		// - Array is fixed size and ArrayList has dynamic size.
		// - Array accepts primitives and objects and ArrayList only objects.
		
		double[] dNums = new double[5];
		System.out.println(Arrays.toString(dNums));
		
		List<Double> listNumbers = new ArrayList<>();
		System.out.println(listNumbers);
		listNumbers.add(1.5);
		listNumbers.add(9.1);
		System.out.println(listNumbers); // [1.5, 9.1]
		
		// add(element) 
		listNumbers.add(5.5);
		listNumbers.add(4.3);
		System.out.println(listNumbers); // [1.5, 9.1, 5.5, 4.3]
		
		// get(index) returns element based on the index
		double element = listNumbers.get(0);
		System.out.println(element);
		
		// size() returns the size of the list
		int listSize = listNumbers.size();
		System.out.println("Size: " + listSize);
		
		double lastElement = listNumbers.get(listSize - 1);
		System.out.println(lastElement);
		
		// [1.5, 9.1, 5.5, 4.3] -> [10.0, 9.1, 5.5, 10.0]
		// set(index, newValue) change existing element
		listNumbers.set(0, 10.0);
		listNumbers.set(listSize - 1, 10.0);
		System.out.println(listNumbers); // [10.0, 9.1, 5.5, 10.0]
		System.out.println("---");
		// Loop over the list
		// 1. Loop and index
		for (int i = 0; i < listNumbers.size(); i++) {
			System.out.println(listNumbers.get(i));
		}
		System.out.println("---");
		
		// 2. for each loop
		for (Double num : listNumbers) {
			System.out.println(num);
		}
		System.out.println("---");
		
		// 3. Iterator
		Iterator<Double> iterator = listNumbers.iterator();
		// hastNext()
		// next()
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---");
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		// listTwo point to the object as list
		List<Integer> listTwo = list;
		listTwo.add(4);
		listTwo.add(5);
		
		System.out.println(list);    // [1, 2, 3, 4, 5]
		System.out.println(listTwo); // [1, 2, 3, 4, 5]
		
		// Make a copy of list
		List<Integer> listThree = new ArrayList<>(list);
		listThree.add(6);
		listThree.add(7);
		
		System.out.println(list);      // [1, 2, 3, 4, 5]
		System.out.println(listThree); // [1, 2, 3, 4, 5, 6, 7]
	}
}