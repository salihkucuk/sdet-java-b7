package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Review {
	public static void main(String[] args) {
		// What's Lambda in Java? 
		// Lambda gives ability to pass function as method argument
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7, 1, 3, 2));
		
		// Functional Interface - interface with one abstract method
		
		// when method accepts Functional interface
		// we can pass implementation for its one abstract method
		list.forEach((Integer el) -> {
			System.out.println(el);
		});
		System.out.println("---");
		
		list.forEach(el -> System.out.println(el));
		System.out.println("---");
		
		System.out.println(list);
		List<Integer> res = changeList(list, e -> e * 2);
		System.out.println(res);
		
		res = changeList(list, e -> e / 2);
		System.out.println(res);
	}
	
	public static List<Integer> changeList(List<Integer> list, Function<Integer, Integer> function) {
		List<Integer> res = new ArrayList<>();
		for (Integer element : list) {
			res.add(function.apply(element));
		}
		return res;
	}
}