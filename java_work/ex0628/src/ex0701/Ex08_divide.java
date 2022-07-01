package ex0701;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex08_divide {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 수 입력 :");
			int num1 = scan.nextInt();
			System.out.print("두번째 수 입력 :");
			int num2 = scan.nextInt();
			division(num1,num2);
				
		}
	}
	
	public static void division(int a, int b) {
		if (b==0) {
			System.out.println("b == 0이므로 나눗셈을 할 수 없습니다.");
			return;
		}
		
		System.out.println("몫 : "+a/b+"\n");
		
	}
}
