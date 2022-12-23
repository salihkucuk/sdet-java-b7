package day48;

public class HandleExceptionsTwo {
	public static void main(String[] args) {
		String strNum = "432xyz";
		try {
			
			int num = Integer.parseInt(strNum);
			System.out.println(num);
			
		} catch(NumberFormatException | NullPointerException e) {
			System.out.println("Invalid strNum");
			
		} catch(IndexOutOfBoundsException e1) {
			System.out.println("Invalid strNum indexOutOfBound");
		}
		
		System.out.println("Completed");
	}
}