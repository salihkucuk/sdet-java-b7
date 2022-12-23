package day38;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
	public static void main(String[] args) {
		// LinkedHashMap maintains insertion order
		Map<String, Double> fruit = new LinkedHashMap<>();
		fruit.put("orange", 1.5);
		fruit.put("mango", 0.5);
		fruit.put("apple", 1.2);
		fruit.put("lemon", 0.7);
		fruit.put("banana", 1.3);
		
		System.out.println(fruit);
	}
}