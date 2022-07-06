package capsule_practice;
import capsule_practice.Point;

public class Circle {
	private int r;
	Point c = new Point();
	
	public Circle() {}
	public Circle(int x, int y, int r) {
		this.r = r;
		c.setX(x);
		c.setY(y);
	}
	
	public void setX(int x) {
		c.setX(x);
	}
	
	public void setY(int y) {
		c.setX(y);
	}
	
	public void setR(int r) {
		c.setX(r);
	}
	
	public void showCircleInfo() {
		c.showPointInfo();
		System.out.println("반지름:"+this.r);
	}
	
}
