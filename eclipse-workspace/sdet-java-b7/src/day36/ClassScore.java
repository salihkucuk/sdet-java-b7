package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassScore {
	public static void main(String[] args) {
		List<Double> classScore = new ArrayList<>(Arrays.asList(1.5, 2.1, 3.4));
		double averageRes = getAverage(classScore);
		System.out.println(averageRes); // 2.
		
		List<Integer> listInput = new ArrayList<>(Arrays.asList(1, 2, 100, 50, 71, 70));
		int sumRes = sum70(listInput);
		System.out.println(sumRes); // 171
		
		sumRes = sum70(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
		System.out.println(sumRes); // 0
		
		sumRes = sum70(new ArrayList<>(Arrays.asList(250, 100, 75, 85)));
		System.out.println(sumRes); // 500
	}
	
	/*
	 * getAverage([1.5, 2.1, 3.4]) -> 2..
	 */
	public static double getAverage(List<Double> classScore) {
		// TODO
		double sum=0;
		for (int i = 0; i < classScore.size(); i++) {
			sum += classScore.get(i);
		}
		return sum/classScore.size();
		
	}
	
	/*
	 * it returns sum of elements which is greater than 70
	 * sum70([1, 2, 100, 50, 71, 70]) -> 171
	 * sum70([1, 2, 3, 4])            -> 0
	 * sum70([250, 100, 75, 85])      -> 500
	 */
	public static int sum70(List<Integer> listD) {
		int sum=0;
		for (int i = 0; i < listD.size(); i++) {
			 if (listD.get(i)>70){
				 sum += listD.get(i);
		        }
		}
		return sum;
		
	}
	
}