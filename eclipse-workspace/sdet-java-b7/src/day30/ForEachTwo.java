package day30;

import java.util.Arrays;

public class ForEachTwo {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		
		for (int element : numbers) {
			System.out.print(element + " ");
		}
		
		System.out.println();
		System.out.println("---");
		
		String[] names = {"Adrian", "Bianca", "Daria", "Kelvin", "Khorolsuren"};
		
		for (String element : names) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("---");
		
		double[] dNumArr = {1.1, 2.1, 3.2, 1.5, 6.1, 7.7, 10.5};
		for (double dNum : dNumArr) {
			System.out.print(dNum + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(dNumArr));
		// Limitations of for each loop:
		// 1. It is always from first element to last element (left to right)
		// 2. You cannot change array by using for each loop
	}
}