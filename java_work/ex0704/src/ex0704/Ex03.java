package ex0704;
import java.util.Scanner;

public class Ex03 {
	
	public static long doA(int n) {
		
		if(n==0)
			return 1;
		
		return 2*doA(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2^n, n을 입력하시오");
		int n = scan.nextInt();
		
		System.out.println("2^"+n+"="+doA(n));
		
	}
	
}
