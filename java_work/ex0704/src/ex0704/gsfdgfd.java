package ex0704;
import java.util.Scanner;

public class gsfdgfd {

	public static int C(int n) {
		
		int jisu = 0;
		int n_clone = n;
		
		while(n_clone != 0) {
			n_clone=n_clone/2;
			jisu++;
			System.out.println(n_clone);
		}
		
		if(n==0)
			return 0;
		
		System.out.println("여기가 무한?");
		
		return (n%2)*(10^jisu)+C(n/2);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2진수로 표현할 10진수 입력");
		int ten = scan.nextInt();
		System.out.println("2진수:"+ C(ten));
		
		
	}
	
}
