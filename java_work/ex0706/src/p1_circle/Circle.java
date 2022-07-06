package p1_circle;
import p1_circle.Point;

public class Circle {
	
	private Point a1 = new Point();
	private int radious;
	public Circle(int x, int y,int r) {
		radious=r;
		a1 = new Point(x,y);
	}
	
	public void showCircleInfo() {
		a1.showPointInfo();
		System.out.println("반지름:"+radious);
	}
	
	
}
