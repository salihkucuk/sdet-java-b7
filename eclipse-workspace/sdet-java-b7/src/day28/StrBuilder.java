package day28;

public class StrBuilder {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	
	sb.append("hello");
	System.out.println(sb);
	
	sb.append(", world");
	System.out.println(sb);
	
	sb.append("java");
	System.out.println(sb);
	
	StringBuilder city=new StringBuilder("Tokyo");
	System.out.println(city);
}
}
