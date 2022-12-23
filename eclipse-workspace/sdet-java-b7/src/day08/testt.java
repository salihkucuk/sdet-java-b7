package day08;

public class testt {
	

	public static void main(String[] args) {
		makePyramid(9);
    }
	
	public static void makePyramid(int num) {
		if(num <= 1 || num >= 8){
			//Prints message and stops the program
			System.out.println("INVALID INPUT");
			return;
			}else{
			//Prints pyramid otherwise
			for(int i = 0; i<num; i++){
			//To print first pyramid
			for(int j = (num-i); j>1; j--)
			System.out.print(" ");
			for(int k = 0; k<=i; k++)
			System.out.print("# ");
			//Gap between two pyramins
			System.out.print(" ");
			//Prints the adjacent pyramid
			for(int m = 0; m<=i; m++)
			System.out.print("# ");
			//To avoid extra new line at the end
			if(i != num-1)
			System.out.println();
			}
			}
	}
}
