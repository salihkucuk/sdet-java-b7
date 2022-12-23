package day10;

public class Greater {
	public static void main(String[] args) {
		
		double res=myMethod(124.5);
		System.out.println(res);
		
		res=myMethod(52.7);
		System.out.println(res);
	}
	
	public static double myMethod(double dNum) {
		
		if(dNum > 100.0) {
			return dNum;
		}else {
			return 100.0;
		}
		
	}

}
