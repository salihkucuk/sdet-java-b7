package day25;

public class Table {
	public String type;
	public String color;
	public boolean isReserved;
	public int numberOfSeats;
	
	public Table() {
		System.out.println("Indise empty constructor");
	}
	
	// this refers to this current object that is getting created by this constructor
	public Table(String type, String color, boolean isReserved, int numberOfSeats) {
		System.out.println("Inside 4 arguments constructor");
		this.type = type;
		this.color = color;
		this.isReserved = isReserved;
		this.numberOfSeats = numberOfSeats;
	}
}