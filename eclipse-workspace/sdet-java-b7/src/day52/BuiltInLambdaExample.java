package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuiltInLambdaExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(2, 1, 3, 4, 8, 7, 6, 5, 9, 10));
		System.out.println(list);
		
		// What's Lambda in Java?
		// It is feature of java that lets us to pass a method
		// as an argument to the method (anonymous method)
		
		list.forEach((Integer element) -> {
			System.out.println(element);
		});
		
//		list.removeIf((Integer element) -> {
//			return element % 2 == 0;
//		});
		
		list.removeIf(e -> e % 2 == 0);
		System.out.println(list);
		
		list.replaceAll(e -> e * 2);
		System.out.println(list);
	}
}