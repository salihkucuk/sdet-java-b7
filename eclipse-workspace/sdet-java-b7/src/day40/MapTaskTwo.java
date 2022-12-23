package day40;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTaskTwo {
	public static void main(String[] args) {
		System.out.println(countLetters("hello")); // {h=1, e=1, l=2, o=1}
		System.out.println(countLetters("aaauucchh")); // {a=3, u=2, c=2, h=2}
		System.out.println(countLetters("tttrrtt")); // {t=5, r=2}
	}
	
	/*
	 * countLetters("hello")     -> {h=1, e=1, l=2, o=1}
	 * countLetters("aaauucchh") -> {a=3, u=2, c=2, h=2}
	 * countLetters("tttrrtt")   -> {t=5, r=2}
	 * 
	 */
	public static Map<Character, Integer> countLetters(String str) {
		Map<Character, Integer> letters = new LinkedHashMap<>(); 
		for (char ch : str.toCharArray()) {
			if (letters.containsKey(ch)) {           
				int value = letters.get(ch);
				letters.put(ch, value + 1);
			} else {
				//          r
				letters.put(ch, 1);
			}
		}
		
		return letters;
	}
}