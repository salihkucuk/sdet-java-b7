package day12;

import util.InputFromUser;

public class AirPressure {
   public static final double NORMAL_PRESSURE_START=13.5;
   public static final double NORMAL_PRESSURE_END=15.5;
   
   public static void main(String[] args) {
	double pressure=Double.parseDouble(InputFromUser.getInput("Enter pressure:"));
	
	if(pressure>=NORMAL_PRESSURE_START && pressure<=NORMAL_PRESSURE_END) {
		System.out.println("normal pressure");
	}else if (pressure<NORMAL_PRESSURE_START) {
		System.out.println("low pressure");
	}else if (pressure>NORMAL_PRESSURE_END) {
		System.out.println("high pressure");
	}else {
		System.out.println("Undefined pressure");
	}
}
	
}
public static char getGrade(int score) {
	if(score>=90 && score<=100) {
		System.out.println('A');
	}else if(score>=80 && score<=89){
		System.out.println('B');
	}else if(score>=70 && score<=79){
		System.out.println('C');
	}else if(score>=60 && score<=69){
		System.out.println('D');
	}else if(score>=0 && score<=59){
		System.out.println('F');
	}else {
		System.out.println('0');
	}
}