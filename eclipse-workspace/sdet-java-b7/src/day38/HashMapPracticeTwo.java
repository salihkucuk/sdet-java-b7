package day38;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapPracticeTwo {
	public static void main(String[] args) {
		//       K, V
		Map<String, Integer> items = new HashMap<>();
		items.put("apple", 5);
		items.put("orange", 10);
		items.put("kiwi", 5);
		items.put("banana", 90);
		
		System.out.println(items); // {orange=10, banana=90, apple=5, kiwi=5}
		
		// get(K) gets the value based on the key
		Integer amount = items.get("orange");
		System.out.println("amount: " + amount);
		
		// containsKey(K) checks if map has provided key
		boolean isKeyThere = items.containsKey("kiwi");
		System.out.println(isKeyThere); //  true
		
		isKeyThere = items.containsKey("mango");
		System.out.println(isKeyThere); // false
		
		// containsValue(V) checks if map has provided value
		boolean isValueThere = items.containsValue(10);
		System.out.println(isValueThere); // true
		System.out.println("---");
		
		// remove(K) removes the element by key
		System.out.println(items);
		items.remove("orange");
		System.out.println(items);
		System.out.println("---");
		
		// keySet() it returns all the keys as Set<K>
		Set<String> keys = items.keySet();
		System.out.println(keys);
		System.out.println("---");
		
		// values() it returns all the values for map as Collection (List)
		Collection<Integer> values = items.values();
		System.out.println(values); // [90, 5, 5]
	}
}	