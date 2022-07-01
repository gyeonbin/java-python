package ex0701;
import java.util.Scanner;
public class Ex10 {
	
	public static int factorial(int a) {
		if (a==1)
			return 1;
		else
			return a*factorial(a-1);
	}
	
	public static void main(String[] args) {
		int a;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("팩토리얼 계산 :");
			a = scan.nextInt();
			System.out.println(factorial(a));
		}
		
		
	}
}
