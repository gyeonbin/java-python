package ex0701;

import java.util.Scanner;

public class P6102 {

	
	public static void abs(int a, int b) {
		if(a<b) {
			System.out.println(b-a);
		}
		else {
			System.out.println(a-b);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a :");
		int a = scan.nextInt();
		System.out.println("");
		System.out.print("b :");
		int b = scan.nextInt();
		System.out.println("");
		abs(a,b);
	
	}
	
	
}
