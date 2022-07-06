package circle;

public class Circle {
	
	private int rad;
	final double PI = 3.14;
	
	
	public int getRad() {
		return rad;
	}
	
	
	public void setRad(int rad) {
		if(rad<0) {
			this.rad=0;
			return;
		}
		this.rad = rad;
	}
	
	public void getArea() {
		int rad = this.rad;
		System.out.println(rad*rad*PI);
	}
	
	
}
