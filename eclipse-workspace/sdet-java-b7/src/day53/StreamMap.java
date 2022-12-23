package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 2, 1));
		System.out.println(numbers); // [4, 5, 2, 1]
		// Get new List where each element of numbers multiplied by 3
		
		// Object oriented way
		List<Integer> res = new ArrayList<>();
		for (Integer num : numbers) {
			res.add(num * 3);
		}	
		System.out.println(res); // [12, 15, 6, 3]
		
		// Functional way by using streams
		// data source -> stream -> result
		List<Integer> resTwo = numbers.stream().map(number -> number * 3).collect(Collectors.toList());
		System.out.println(resTwo); // [12, 15, 6, 3]
		System.out.println("---");
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Bek", "Kuba", "Alex", "Misha", "Ramesh"));
		System.out.println(names); // [Bek, Kuba, Alex, Misha, Ramesh]
		
		// TODO Get new List where each element is length of the each name in names list
		List<Integer> resNames = new ArrayList<>();
		
		// oop way
		for (String name : names) {
			resNames.add(name.length());
		}		
		System.out.println(resNames); // [3, 4, 4, 5, 6]
		
		// functional way
		// TODO
		List<Integer> resNamesTwo = names.stream().map(name -> name.length()).collect(Collectors.toList());
		System.out.println(resNamesTwo); // [3, 4, 4, 5, 6]
	}
}