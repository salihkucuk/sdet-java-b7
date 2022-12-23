package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class NameList {
	public static void main(String[] args) {
		// ArrayList
		
		// Array is fixed sized collection of variables
		// - fixed size
		// - it can work with primitives and objects
		
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		// names[3] = "Kuba";
		System.out.println(Arrays.toString(names));
		System.out.println(names[0]); // John
		
		
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("John");
		namesList.add("Bob");
		namesList.add("Alex");
		namesList.add("Kuba");
		System.out.println(namesList);
		
		System.out.println(namesList.get(0)); // John
		String name = namesList.get(3);
		System.out.println(name); // Kuba
	}
}