package ex0705;

class AA {
	int a = 10;
}

public class Ex04 {
	
	public static void setAA (AA a) {
		a.a=100;
		System.out.println(a.a);
	}
	public static void main(String[] args) {
	
		AA aa = new AA();
		AA bb = aa;
		System.out.println(aa.a);
		setAA(aa);
		System.out.println(aa.a);
		aa = null;
		System.out.println(bb.a);
		aa = bb;
		System.out.println(aa.a);
		
		
	}
}
