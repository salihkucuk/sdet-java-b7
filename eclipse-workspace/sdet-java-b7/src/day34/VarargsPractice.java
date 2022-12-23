package day34;

public class VarargsPractice {
	public static void main(String[] args) {
		int res = max(4, 5);
		System.out.println(res); // 5
		
		res = max(9, 7, 3);
		System.out.println(res); // 9
		
		int[] arrNum = {8, 6, 7, 100, 4, 33, 12};
		res = max(arrNum);
		System.out.println(res); // 100
		
		// TODO create a single max method that will work for all three method calls above
	}
	
	public static int max(int... numbers) {
		int biggest = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (biggest < numbers[i]) {
				biggest = numbers[i];
			}
		}
		
		return biggest;
	}
	
}