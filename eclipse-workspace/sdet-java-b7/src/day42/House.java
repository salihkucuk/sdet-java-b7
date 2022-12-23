package day42;

/*
 * How to encapsulate:
 * 1. Make properties private to remove direct access
 * 2. Provide public getters and setters
 */
public class House {
	private String type;
	private int numberOfBedRooms;
	private int numberOfBathRooms;
	private double price;
	private int year;
	private String street;
	private double schoolRate;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfBedRooms() {
		return numberOfBedRooms;
	}
	public void setNumberOfBedRooms(int numberOfBedRooms) {
		this.numberOfBedRooms = numberOfBedRooms;
	}
	public int getNumberOfBathRooms() {
		return numberOfBathRooms;
	}
	public void setNumberOfBathRooms(int numberOfBathRooms) {
		this.numberOfBathRooms = numberOfBathRooms;
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public double getSchoolRate() {
		return schoolRate;
	}
	public void setSchoolRate(double schoolRate) {
		this.schoolRate = schoolRate;
	}
	
	
}