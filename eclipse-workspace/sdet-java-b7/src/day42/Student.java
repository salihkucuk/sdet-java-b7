package day42;

public class Student extends Person {
	public long studentId;
	public String course;
	
	public String getAllDetails() {
		return firstName + " " +lastName + " " + course + " " + studentId;
	}	
}