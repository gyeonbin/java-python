package ex0706;
import java.util.Scanner;
import car_v_control.A;

public class Car_V_control {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n,v;
		A car1 = new A(0);
		
		while(true) {
			System.out.println("1.속도변경\n2.현재속도");
			n = scan.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("변경할 속도:");
				v = scan.nextInt();
				car1.setV(v);
				break;
			case 2:
				car1.getV();
				break;
			default:
				System.out.println("잘못입력");
				break;
			}
		}
	}
}
