package ex0701;

import java.util.Scanner;
public class P6101 {
	
	public static void cal(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));

	}
	
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a :");
		a = scan.nextInt();
		System.out.println("b :");
		b = scan.nextInt();
		
		cal(a,b);
	}
}
