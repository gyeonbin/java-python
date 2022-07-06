package capsule_practice;
import capsule_practice.Circle;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int x,y,r;
		Circle c = new Circle();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 x,y,r 입력");
		x=scan.nextInt();
		y=scan.nextInt();
		r=scan.nextInt();
		
		c.setX(x);
		c.setX(y);
		c.setX(r);
		
		c.showCircleInfo();
		
		
		
	}
}
