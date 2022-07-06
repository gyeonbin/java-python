package ex0706;
import p1_circle.Circle;
import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {
		int x,y,r;
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.println("원의 x좌표 입력:");
			x = scan.nextInt();
			System.out.println("원의 y좌표 입력:");
			y = scan.nextInt();
			System.out.println("원의 반지름 입력:");
			r = scan.nextInt();
			
			Circle c = new Circle(x,y,r);
			c.showCircleInfo();
			
		}
		
		
	}
}
