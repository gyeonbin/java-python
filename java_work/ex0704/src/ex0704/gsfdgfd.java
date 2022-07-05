package ex0704;
import java.util.Scanner;

public class gsfdgfd {
	
//	public static int C(int n) {
//		
//		if(n==0)
//			return 0;
//		
//		return 10*((n%2) + C(n/2));	
//	}
//	
//	public static void main(String[] args) {
//		
//		while(true) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("2진수로 표현할 10진수 입력");
//			int ten = scan.nextInt();
//			System.out.println("2진수:"+(C(ten)/10));
//		}
	
	public static void Exp(int num) {
	      int temp1;
	      temp1 = num % 2;
	      if(num>=2) {Exp(num / 2);}
	      //제일 마지막 순서가 맨 먼저 출력됨, return을 안만나야함.
	      System.out.print(temp1);
	      return ;
	   }

	   public static void main(String[] args) {
	      Exp(18);
	      System.out.print("(2)");
	   }
	
		
	}
