package day05;

public class StrVarRaview {
	public static void main(String[] args) {
		// variable is a container that can hold piece of data
		// we need to declare our variable with a type and then we can use it
		
		String str="apple";
		
		//String - data type
		// str - name of the variable
		System.out.println(str);
		
		str="orange";
		System.out.println(str); //orange
		
		String firstName = "John", lastName = "Doe";
		System.out.println(firstName);
		System.out.println(lastName);
		
		String name = firstName;
		System.out.println(name); //John
		
		String fullName= firstName + " " + lastName;
		System.out.println(fullName); //John Doe
		
		
	}

}
