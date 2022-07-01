package ex0701;
import java.util.Scanner;

public class P6202 {
	
	public static boolean is_prime(int n) {
		
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i<n; i++) {	
			if(n%i == 0) {
				return false;
			}			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("소수입력");
		int n = scan.nextInt();
		System.out.println(is_prime(n));
		
		
	}

}
