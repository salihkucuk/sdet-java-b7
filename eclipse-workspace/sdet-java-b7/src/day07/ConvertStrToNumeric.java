package day07;

public class ConvertStrToNumeric {
	public static void main(String[] args) {
		String strNum="2344";
		
		//to convert numeric String to int,
		//we need to use Integer.parseInt(stringToConvert)
		
		int num=Integer.parseInt(strNum);
		System.out.println(num);
		System.out.println(num * 2);
		
		String strNum2="10.5";
		double dNum=Double.parseDouble(strNum2);
		System.out.println(dNum);
		
		byte bNum=Byte.parseByte("15");
		short shNum=Short.parseShort("50");
		int intNum=Integer.parseInt("100");
		long longNum=Long.parseLong("1000000");
		float floatNum=Float.parseFloat("1.99");
		double doubleNum=Double.parseDouble("2121212");
		
		
		
	}

}
