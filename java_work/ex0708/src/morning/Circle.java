package morning;
import java.util.Scanner;

class Point {
	int xPos, yPos;

	Point() {}
	Point(int xPos, int yPos) {

		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void showPointInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}

public class Circle {

	protected int radious;
	protected Point point = new Point();

	public Circle(int x, int y, int r) {
		
		this.radious = r;
		point.xPos = x;
		point.yPos = y;
	}

	public void showCircleInfo() {
		point.showPointInfo();
		System.out.println("반지름 :"+radious);
	}
	
	public static void main(String[] args) {
		int x,y,r;
		Scanner scan = new Scanner(System.in);
		System.out.println("x, y, r 입력");
		x = scan.nextInt();
		y = scan.nextInt();
		r = scan.nextInt();
		
		Circle c = new Circle(x,y,r);
		
		c.showCircleInfo();
		
		
	}
}
