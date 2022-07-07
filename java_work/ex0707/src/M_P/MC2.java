package M_P;
import M_P.MC1;
import java.util.Scanner;
public class MC2 {
	
	public static void main(String[] args) {
		
		MC1 KB = new MC1();
		String name,acc;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scan.nextLine();
		System.out.println("계좌를 입력하세요");
		acc = scan.nextLine();
		
		KB.setA(name);
		KB.setB(acc);
		
		System.out.println("이름:"+KB.getA());
		System.out.println("계좌:"+KB.getB());
		
		
	}
	
	

}
