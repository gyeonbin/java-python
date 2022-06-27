package ex627;

public class ex01 {
	
	public static void main(String[] args) {
		
		int a = 10;
		double b = a;
		
		double c = 30.44;
		int d = (int)c;
		System.out.println("b = "+b);
		System.out.println("d = "+d);
		
		System.out.println("(3+4)*5 ="+(3+4)*5);
		System.out.println("3>4 = "+(3>4));
		
		int num1 = 3;
		System.out.println("3>4 ="+(3>4 && (num1+=3)<3));
		System.out.println("num1 ="+ num1);
		System.out.println("3>4 = "+(3>4 || (num1+=3)<3));
		System.out.println("num1 = "+ num1);
	}
	
}
