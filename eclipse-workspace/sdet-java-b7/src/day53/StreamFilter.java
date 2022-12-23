package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 4, 3, 1, 2, 8, 10));
		System.out.println(numbers); // [5, 4, 3, 1, 2, 8, 10]
		
		// filter
		List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evens); // [4, 2, 8, 10]
		
		List<Integer> resOne = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());
		System.out.println(resOne); // [8, 10]
		
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Bek", "Kuba", "Misha", "Alex", "Ramesh", "Vlijay"));
		System.out.println(names);
		
		// TODO
		// Create new List with names length bigger than 4 by using stream
		List<String> resNames = names.stream().filter(name -> name.length() > 4).collect(Collectors.toList());
		System.out.println(resNames); // [Misha, Ramesh, Vlijay]

	}
}