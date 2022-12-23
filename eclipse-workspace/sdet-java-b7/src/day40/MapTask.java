package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "kiwi", "orange", "banana", "mango"));
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<>();
		// TODO add elements form the list to the map where element is key and element's length is value
		// 1. Loop over the list
		// 2. put element to the map where element as key and element's length as value
		//    put(str, str.length());
		for (String str : list) {			
			map.put(str, str.length());
		}
		System.out.println(map); // {apple=5, kiwi=4, orange=6, banana=6, mango=5}
	}
}