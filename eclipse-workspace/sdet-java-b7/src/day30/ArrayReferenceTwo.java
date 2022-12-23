package day30;

import java.util.Arrays;

public class ArrayReferenceTwo {
	public static void main(String[] args) {
		String[] arrNames = {"Majid", "Maksym", "Kseniia", "Matt", "Panithan"};
		
		// [Majid, Maksym, Kseniia, Matt, Panithan]
		System.out.println(Arrays.toString(arrNames)); 
		
		changeArray(arrNames);
		
		// [John, John, John, John, John]
		System.out.println(Arrays.toString(arrNames));
		
		System.out.println("---");
		
		String name = "Alex";
		System.out.println(name); // Alex
		changeStr(name);
		System.out.println(name); // Alex
		
		StringBuilder sbName = new StringBuilder("Kuba");
		System.out.println(sbName); // Kuba
		changeSb(sbName);
		System.out.println(sbName); // KubaJohn
	}
	
	public static void changeSb(StringBuilder sb) {
		sb.append("John");
	}
	
	public static void changeStr(String str) {
		// str = name
		str = "John";
	}
	
	public static void changeArray(String[] names) {
		// names = arrNames
		for (int i = 0; i < names.length; i++) {
			names[i] = "John";
		}
	}
}