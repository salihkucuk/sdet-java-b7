package day25;

public class Main {
	public static void main(String[] args) {
		Table tableOne = new Table();
		tableOne.type = "regular";
		tableOne.color = "brown";
		tableOne.isReserved = false;
		tableOne.numberOfSeats = 4;
		
		Table tableTwo = new Table();
		tableTwo.type = "regular";
		tableTwo.color = "yellow";
		tableTwo.isReserved = true;
		tableTwo.numberOfSeats = 6;
		
		System.out.println("Table 1");
		System.out.println(tableOne); // day25.Table@7ad041f3
		System.out.println(tableOne.type);
		System.out.println(tableOne.color); 
		System.out.println(tableOne.isReserved);
		System.out.println(tableOne.numberOfSeats);
		
		System.out.println("Table 2");
		System.out.println(tableTwo);
		System.out.println(tableTwo.type);
		System.out.println(tableTwo.color);
		System.out.println(tableTwo.isReserved);
		System.out.println(tableTwo.numberOfSeats);
	}
}