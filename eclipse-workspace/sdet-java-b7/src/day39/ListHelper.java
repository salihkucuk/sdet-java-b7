package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListHelper {
	public static void main(String[] args) {
		// How do you sort your array?
		// Arrays.sort(array)
		// What's the helper class for array?
		// Arrays.java
		
		// How do you sort your list?
		// What's the helper class for all collections(List, Set, Map)? 
		// Collections.java
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 3, 9, 10, 1, 0, 50));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		int targetIndex = Collections.binarySearch(list, 10);
		System.out.println("index: " + targetIndex);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}