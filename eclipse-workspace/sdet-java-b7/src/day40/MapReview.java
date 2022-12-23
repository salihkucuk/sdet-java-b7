package day40;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
	public static void main(String[] args) {
		// Map is key value based data structure
		// keys are unique in the map
		// K - id
		// V - name
		//        K, V
		Map<Integer, String> employee = new HashMap<>();
		// put(K, V) adds element to the map
		
		employee.put(1, "Alex");
		employee.put(2, "John");
		employee.put(3, "Vijay");
		employee.put(4, "Ramesh");
		
		employee.put(1, "Kuba");
		employee.put(5, "John");
		
		System.out.println(employee.size()); // 4
		System.out.println(employee); // {1=Kuba, 2=John, 3=Vijay, 4=Ramesh, 5=John}
		
		String name = employee.get(3);
		System.out.println(name);
		
		// id=1, name=Alex
		// Loop over the map?
		// keySet(); set of keys
		
		for (Integer key : employee.keySet()) {
			System.out.println("id=" + key + ", name=" + employee.get(key));
		}
		
	}
}