package day10;

public class MethodOverloading2 {
	public static void main(String[] args) {
		
		myPrint("hello world!");
		
		myPrint(5);
		myPrint(99.99);
		myPrint(false);
	}
     public static void myPrint(String str) {
		
		System.out.println("printing: "+str);		
		
	}
     public static void myPrint(int num) {
 		
 		System.out.println("printing: "+num);		
 		
 	}
     public static void myPrint(double dNum) {
 		
 		System.out.println("printing: "+dNum);		
 		
 	}
     public static void myPrint(boolean b) {
 		
 		System.out.println("printing: "+b);		
 		
 	}
	

}
