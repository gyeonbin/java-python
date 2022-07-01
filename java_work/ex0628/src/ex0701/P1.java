package ex0701;
import java.util.Scanner;

public class P1 {
	
	public static void add(int n1,int n2) {
		System.out.println(n1+"+"+n2+"="+(n1+n2));
	}
	
	public static void minus(int n1,int n2) {
		System.out.println(n1+"-"+n2+"="+(n1-n2));
	}
	
	public static void multiply(int n1,int n2) {
		System.out.println(n1+"*"+n2+"="+(n1*n2));
	}
	
	public static void div(int n1,int n2) {
		System.out.println(n1+"/"+n2+"="+(n1/n2));
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n1 :");
		int n1 = scan.nextInt();
		System.out.println("");
		System.out.println("n2 :");
		int n2 = scan.nextInt();
		boolean c = true;
		
		while(c) {
			System.out.print("연산의 종류를 입력하세요(+,-,*,/) :");
			String cal_char = scan.nextLine();
			
			if(cal_char == "+") {
				add(n1,n2);
				c = false;
			}
			else if(cal_char == "-") {
				minus(n1,n2);
				c = false;
			}
			else if(cal_char == "*") {
				multiply(n1,n2);
				c = false;
			}
			
			else if(cal_char == "/") {
				div(n1,n2);
				c = false;
			}
			else
				System.out.print("잘못입력하셨습니다. ");
			
		}
	}
}
