package ex0701;
import java.util.Scanner;


public class P6201 {
	public static double C(double r) {
		
		double c = 2*r*3.14;
		
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름을 입력하세요(소수점 가능)");
		double r = scan.nextDouble();
		
		System.out.println(C(r));
		
		
	}
	
	
}
