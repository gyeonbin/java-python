package ex0704;
//
//p.142
//문제2
//
import java.util.Scanner;
public class Ex01 {
	
	public static int abs(int a, int b) {
		
		if(a>b)
			return a-b;
		else
			return b-a;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int a = scan.nextInt();
		System.out.println("a="+a);
		System.out.println("두번째 수 입력");
		int b = scan.nextInt();
		System.out.println("b="+b);
		System.out.println("|a-b|="+abs(a,b));
		
	}
}
