package day30;

public class ForEach {
	public static void main(String[] args) {
		int[] numArr = {10, 11, 13, 100, 20, 60, 70, 70, 15, 14};
		// print elements which is greater than 50
		
		// solution with regular loop
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > 50) {
				System.out.println(numArr[i]);
			}
		}
		
		System.out.println("---");
		
		//           : [10, 11, 13, 100, 20, 60, 70, 70, 15, 14]
		for (int num : numArr) {
			if (num > 50) {
				System.out.println(num);
			}
		}
	}
}