package ex0705;

public class Ex01 {

	public static void main(String[] args) {
		
		C_Ex01 AA = new C_Ex01();
		C_Ex01 AB = new C_Ex01();
		
		AA.doA();
		AA.doA();
		AA.doB();
		System.out.println(AA.doC(3.14));
	}
}
