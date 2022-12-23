package day22;

public class BreakAndContinueTwo {
public static void main(String[] args) {
	for(int i=1; i<=15; i++) {
		if(i==7 || i==9 || i==13) {
			continue;
		}
		System.out.print(i + " ");
		}
	
	    System.out.println();
	}
}

