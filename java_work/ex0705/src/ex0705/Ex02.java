package ex0705;

public class Ex02 {
	
	public static void main(String[] args) {
		
		C_Ex01 AA = new C_Ex01();
		C_Ex01 AB = AA;
		
		AA.a += 10;
		System.out.println("AB.a ="+AB.a);
		
		int a = 10;
		int b = a;
		
		a = 20;
		System.out.println(b);
		
		
	}
}
