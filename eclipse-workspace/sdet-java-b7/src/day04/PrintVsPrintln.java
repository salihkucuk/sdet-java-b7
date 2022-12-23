package day04;

public class PrintVsPrintln {
	public static void main(String[] args) {
		//there are two print statements in Java
		// 1. System.out.println(whatToPrint); it adds new line after the print
		// 2. System.out.print(whatToPrint);
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("-----");
		
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		
		System.out.println("D"); //new line after this
		
		System.out.print("X");
		System.out.println("Y"); //new line after this
		System.out.print("Z");
	}

}
