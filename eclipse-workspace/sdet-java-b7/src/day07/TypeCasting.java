package day07;

public class TypeCasting {
	public static void main(String[] args) {
		//byte, short, int, long
		//float, double
		
		//byte -> short-> int-> long-> float-> double
		
		byte bNum =10;
		//auto casting / auto boxing
		int num=bNum;
		System.out.println(num);
		
		float fNum=num;
		System.out.println(fNum);
		
		int numTwo=50;
		//if we want to put 'bigger' type into the smaller one
		//we need to do type casting
		byte bNumTwo=(byte) numTwo;
		System.out.println(bNumTwo);
		
		double dinnerBill=99.99;
		int finalBill=(int) dinnerBill;
		//when casting from floating number to whole number
		//the value gets truncated
		System.out.println(finalBill);//99
		System.out.println("-----------");
		
		int intValue=1000;
		byte byteValue=(byte) intValue;
		System.out.println(byteValue);//-24



		
	}

}
