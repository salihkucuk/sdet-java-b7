package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		// removing duplicates
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 1))));
		// [1, 2, 3]
		
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(1, 1)))); 
		// [1]
		
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(5, 4, 6))));
		// [5, 4, 6]
		
		System.out.println("---");
		System.out.println(removeDupStr("aaabbccaa")); // abc
		System.out.println(removeDupStr("hello")); // helo
		System.out.println(removeDupStr("java")); // jav
	}
	
	/*
	 * remove duplicates from list
	 * removeDup([1, 1, 1, 2, 2, 3, 1]) -> [1, 2, 3]
	 * removeDup([1, 1])                -> [1]
	 * removeDup([5, 4, 6])             -> [5, 4, 6]
	 */
	public static List<Integer> removeDup(List<Integer> list) {
		Set<Integer> set = new LinkedHashSet<>(list);
		return new ArrayList<>(set);
	}
	
	/*
	 * remove duplicates from str
	 * removeDupStr("aaabbccaa") -> "abc"
	 * removeDupStr("hello")     -> "helo"
	 * removeDupStr("java")      -> "jav"
	 */
	public static String removeDupStr(String str) {
		Set<Character> set = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder sb = new StringBuilder();
		for (char ch : set) {
			sb.append(ch);
		}
		return sb.toString();
	}
}