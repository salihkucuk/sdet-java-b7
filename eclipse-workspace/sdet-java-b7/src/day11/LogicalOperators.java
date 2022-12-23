package day11;

public class LogicalOperators {
	public static void main(String[] args) {
		// && - logical AND
		// || - logical OR
		// !  - logical NOT
		
		int age=7;
		//check if age is even and greater than 5
		
		if(age%2==0 && age>5) {
			System.out.println("in line 13");
		}else {
			System.out.println("in line 15");
		}
		
		//check if number is 7 or 13
		
				if(age==7 || age==13) {
					System.out.println("in line 22");
				}else {
					System.out.println("in line 24");
				}
		
				// ! NOT will reverse value of boolean
				boolean b=true;
				System.out.println(b);
				System.out.println(!b);
				
				b=false;
				System.out.println(!b);
				
				
	}

}
