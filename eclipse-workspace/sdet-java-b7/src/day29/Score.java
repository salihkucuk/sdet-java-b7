package day29;

public class Score {
	public static void main(String[] args) {
		// Array is fixed collection of data of the same type
		
		int[] score = new int[5];
		//   0  1   2   3   4
		// [70, 80, 90, 70, 60]
		
		score[0] = 70;
		score[1] = 80;
		score[2] = 90;
		score[3] = 70;
		score[4] = 60;
		
		// 6th
		// score[5] = 100; // java.lang.ArrayIndexOutOfBoundsException
		
		int num = score[1];
		System.out.println(num); // 80
		System.out.println("---");
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		// System.out.println(score[10]); // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("---");
		
		//   0  1   2   3   4
		// [70, 80, 90, 70, 60]
		// assign last element as sum of first two elements
		score[4] = score[0] + score[1];
		System.out.println(score[4]);
		
		// array works with references the same way as object reference
		// The actual array space will be created in heap memory
		System.out.println(score); // [I@1dbd16a6
	}
}