 package day09;

public class MethodArguments2 {
	public static void main(String[] args) {
		int number=55;
		number= plusTen(number);	
		System.out.println(number);
		
		int res=plusTen(99);
		System.out.println(res); //109
		
		String returnResult=join("Java", "Python");
		System.out.println(returnResult);
		
		System.out.println(join("A", "B"));
		
		
		String nameInput="John Doe";
		int ageInput=26;
		String addressInput="101 Main st";
		printInfo(nameInput, ageInput, addressInput);
		System.out.println("---------");
		
		printInfo("Alex", 36, "102 North st");
	}
	public static int plusTen(int numInput) {
		return numInput + 10;
	}
	public static String join(String str, String str1) {
		String res= str + " " +str1;
		return res;
	}
	public static void printInfo(String name, int age, String address) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Adress "+ address);
	}

}
