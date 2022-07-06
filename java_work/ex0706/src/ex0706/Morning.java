package ex0706;
import java.util.Scanner;

class INF {
	
	String name,num;
	
	public INF(String Name, String Num) {
		name = Name;
		num = Num;
	}
	
	public void checkname() {
		System.out.println("이름 :"+name);
	}
	public void checknum() {
		System.out.println("번호 :"+num);
	}
	
}

public class Morning {
	
	public static void main(String[] args) {
		
		int n;
		INF kb = new INF("김경빈","21923262");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.이름확인 2.학번확인");
			n = scan.nextInt();
			
			switch (n) {
			case 1:
				kb.checkname();
				break;
			case 2:
				kb.checknum();
				break;
			default:
				System.out.println("잘못입력");
				break;
			}
		}
		
		
	}
	
	
}
