package ex0705;

public class Cp1 {
	
	double L;
	double H;
		
	public Cp1(float l,float h) {
		L=l;
		H=h;
	}
	
	public double a() {
		return L*H/2;
	}
	
	public void cng(float l, float h) {
		L = l;
		H = h;
	}

}
