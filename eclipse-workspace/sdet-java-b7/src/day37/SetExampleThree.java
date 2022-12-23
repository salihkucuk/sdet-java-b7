package day37;

import java.util.Set;
import java.util.TreeSet;

public class SetExampleThree {
	public static void main(String[] args) {
		// TreeSet
		// The elements of TreeSet are sorted
		
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(8);
		numbers.add(-8);
		System.out.println(numbers); // [-8, 1, 2, 3, 4, 8]
		
		Set<String> names = new TreeSet<>();
		names.add("Kuba");
		names.add("John");
		names.add("Bek");
		names.add("Alex");
		names.add("Azamat");
		System.out.println(names); // [Alex, Azamat, Bek, John, Kuba]
	}
}