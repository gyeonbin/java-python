package car_v_control;

public class A {
	
	private double V;
	public A(int v) {
		V =v;
	}
	
	public void getV() {
		System.out.println("현재속도:"+V);
	}

	public void setV(double v) {
		V = v;
	}
	
}
