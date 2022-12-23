package day37;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Review {
	public static void main(String[] args) {
		// 1. Create ArrayList by using List interface
		// 2. Create ArrayList with init values
		// 3. ArrayList works internally based on array
		// 4. Iterator
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(9);
		System.out.println(numbers); // [2, 3, 5, 9]

		List<Integer> numbersTwo = new ArrayList<>(Arrays.asList(2, 3, 5, 9));
		numbersTwo.add(7);
		numbersTwo.remove(0);
		System.out.println(numbersTwo); // [3, 5, 9, 7]
		
		// this not resizable list.
		// - you cannot add new elements
		// - you cannot remove elements
		List<Integer> numbersThree = Arrays.asList(2, 3, 5, 9);
		// numbersThree.add(7);
		// numbersThree.remove(0);
		System.out.println(numbersThree);
		System.out.println("---");
		
		// Array vs ArrayList?
		// Array is fixed size and ArrayList has dynamic size
		// Array can hold primitives and objects
		// ArrayList can hold only objects
		
		// ArrayList is based on array internally.
		// It handles resizing its internal array automatically
		
		// What's the initial size of inner array in ArrayList?
		// Initial size of inner array is 10
		// new ArrayList<>(1000000) - we can specify the size of inner array
		// specifying size makes sense when we know we will add big amount of 
		// elements to our ArrayList. Specifying this size to bigger size 
		// we are saving resizing effort
		
		List<String> names = new ArrayList<>(1000000);
		System.out.println(names);
		System.out.println(names.size());
		System.out.println("---");
		
		// Iterator
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 8, 9, 10, 54, 34, 76, 8));
		System.out.println(list);
		
		// hasNext() - checks if iterator has next element or not
		// next()    - returns next element and moves iterator to the right next
		
		//   [5, 7, 8, 9, 10, 54, 34, 76, 8]
		// ^
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println(element);
		}
		System.out.println("---");
		
		for (int element : list) {
			System.out.println(element);
		}
	} 
}