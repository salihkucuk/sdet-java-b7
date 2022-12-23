package day33;

import java.util.Arrays;

public class MArrayPractice {
	public static void main(String[] args) {
		int[][] numbers = {
				{1532, 1113, 1124, 1134, 1145},
				{1158, 1191, 1208, 1225, 1242},
				{1216, 1174, 1191, 1208, 1225},
				{1276, 1262, 1286, 1311, 1335},
				{1340, 1338, 1370, 1403, 1436}
		};
		System.out.println(Arrays.deepToString(numbers));
		
		// TODO print each element (number) of numbers array in new line
		for (int[] innerArr : numbers) {
			for (int num : innerArr) {
				System.out.println(num);
			}
		}
		System.out.println("---");
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				int num = numbers[i][j];
				System.out.println(num);
			}
		}
		
	}
}