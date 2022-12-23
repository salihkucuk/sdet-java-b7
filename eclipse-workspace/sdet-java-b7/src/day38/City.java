package day38;

import java.util.Map;
import java.util.HashMap;

public class City {
	public static void main(String[] args) {
		// TODO
		// 1. Create a Map<String, Integer> that will hold these values
		//    {Arlington=229164, Leesburg=375629, Manassas=451721, Richmond=210309}
		// 2. Print your map	
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		System.out.println(cities);
		
		// TODO
		// Loop over the map and print each element in this format
		// city: K, population: V
		// city: Arlington, population: 229164
		
		//                [Manassas, Leesburg, Arlington, Richmond]
		for (String key : cities.keySet()) {
			Integer value = cities.get(key);
			System.out.println("city: " + key + ", population: " + value);
		}
		System.out.println("---");
		
		int totalPopulation = 0;
		int averagePopulation = 0;
		
		// TODO 
		// find out total population
		// find out average population
		// .size() returns number of elements in the map
		
		for (String key : cities.keySet()) {
			Integer value = cities.get(key);
			totalPopulation += value;
		}
		
//		for (Integer value : cities.values()) {
//			totalPopulation += value;
//		}
		
		averagePopulation = totalPopulation / cities.size();
		System.out.println("Total population: " + totalPopulation);
		System.out.println("Average population: " + averagePopulation);
	}
}