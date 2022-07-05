package ex0705;

public class P1 {
	
	public static void main(String[] args) {
		
		Cp1 t1 = new Cp1(5,10);
		System.out.print(t1.L);
		System.out.println(" "+t1.H);
		System.out.println(t1.a());
		t1.cng(3, 5);
		System.out.print(t1.L);
		System.out.println(" "+t1.H);
		System.out.println(t1.a());
		
	}

}
