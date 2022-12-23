package day42;

/*
 * TODO encapsulate Car class
 * 1. Make properties private to remove direct access
 * 2. Provide getters and setters 
 */
public class Car {
	private String model;
	private String color;
	private String type;
	private double price;
	private int year;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}	
}