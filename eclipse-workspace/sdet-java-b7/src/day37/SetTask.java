package day37;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		System.out.println(removeDuplicates("hello")); // helo
		System.out.println(removeDuplicates("aaaabbbb")); // ab
		System.out.println(removeDuplicates("aabbaacc")); // abc
	}
	
	/* 
	 * Remove duplicates from str and return as new string
	 * Use Set
	 * Set<Character>
	 */
	public static String removeDuplicates(String str) {		
		Set<Character> set = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder res = new StringBuilder();
		for (char ch : set) {
			res.append(ch);
		}
		return res.toString();
	}
}