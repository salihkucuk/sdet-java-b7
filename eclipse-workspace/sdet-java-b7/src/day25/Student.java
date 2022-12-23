package day25;

public class Student {
	 
	  public String firstName;
	  public String LastName;
	  public double grade;
		  
	  public Student(String firstName, String LastName, double grade) {
		  this.firstName=firstName;
		  this.LastName=LastName;
		  this.grade=grade;
		  }
	  public void display() {
		  System.out.println("first name: "+ firstName);
		  System.out.println("last name: "+ LastName);
		  System.out.println("grade: "+ grade);
	  }
	  
	  
	  
		}

