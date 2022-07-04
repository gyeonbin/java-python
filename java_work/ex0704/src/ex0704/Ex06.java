package ex0704;
import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int money;
		MyAccountBank GYEONGBIN = new MyAccountBank();
		
		while(true) {
			
			System.out.println("1.입금 2.출금 3.잔금확인 4.입출금 리스트");
			int a = scan.nextInt();
			
			switch (a) {
			case 1:
				System.out.println("입금할 금액");
				money =scan.nextInt();
				GYEONGBIN.deposit(money);
				break;
			case 2:
				System.out.println("출금할 금액");
				money =scan.nextInt();
				GYEONGBIN.withdraw(money);
				break;
			case 3:
				System.out.println("잔금");
				GYEONGBIN.check();
				break;
			case 4:
				System.out.println(GYEONGBIN.s);
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			
			
			
		}
		
				
	}

}
