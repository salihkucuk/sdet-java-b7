package day43;

public class Parrot extends Bird{
	public void talk() {
		System.out.println("Parrot is talking");
	}

	public static void main(String[] args) {
	Parrot parrot=new Parrot();
	parrot.name="Kesha";
	parrot.fly();
}
}

