package day25;

public class Restaurant {
	public static void main(String[] args) {
		// Objects work with references(pointers)
		Table table = new Table();
		System.out.println(table);
		
		// Object properties have default values if not assigned
		// Object   -> null
		// boolean  -> false
		// Numerics -> 0
		System.out.println(table.type); // null
		System.out.println(table.color); // null
		System.out.println(table.isReserved); // false
		System.out.println(table.numberOfSeats); // 0
		
		table.type = "big table";
		table.color = "white";
		table.isReserved = true;
		table.numberOfSeats = 10;
		System.out.println("----");
		
		Table tableTwo = new Table("small table", "white", false, 3);
		System.out.println(tableTwo.type);
		System.out.println(tableTwo.color);
		System.out.println(tableTwo.isReserved);
		System.out.println(tableTwo.numberOfSeats);
		
	}
}