package day37;

import java.util.Set;
import java.util.LinkedHashSet;

public class SetExampleTwo {
	public static void main(String[] args) {
		// HashSet doesn't maintain insertion order
		// if we really need insertion order 
		// we can use LinkedHashSet
		
		// LinkedHashSet maintains insertion order
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(-8);
		numbers.add(1);
		numbers.add(0);
		System.out.println(numbers); // [3, 4, -8, 1, 0]
		
		Set<String> names = new LinkedHashSet<>();
		names.add("Kuba");
		names.add("John");
		names.add("Alex");
		System.out.println(names); // [Kuba, John, Alex]
		
		// remove(value) removes element from set if present
		names.remove("John");
		System.out.println(names);
		
		// contains
		boolean isThere = names.contains("Alex");
		System.out.println(isThere); // true
		
		isThere = names.contains("Bek");
		System.out.println(isThere); // false
	}
}