package ex0704;
import java.util.Scanner;

public class gsfdgfd {

	public static int i =0;
	
	public static int C(int n) {
		
		if(n==0)
			return 0;
		
		return 10*((n%2) + C(n/2));	
	}
	
	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("2진수로 표현할 10진수 입력");
			int ten = scan.nextInt();
			System.out.println("2진수:"+(C(ten)/10));
		}
	
		
	}
	
}
