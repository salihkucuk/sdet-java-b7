package day07;

public class AssignmentCompatibility {
	public static void main(String[] args) {
		//int-> long-> float-> double
		long l=500;
		float f=55.99F;
		short sh=123;
		
		//long + float + short =>float
		
		float result=l + f + sh ;
		System.out.println(result);
		System.out.println(l + f+ sh);

		
		
		
		//byte -> short-> int-> long-> float-> double

}
}