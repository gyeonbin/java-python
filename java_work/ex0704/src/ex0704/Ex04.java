package ex0704;

public class Ex04 {
	
	public static int bal = 0;
	
	public static void doA() {
		bal+=100;
		System.out.println("doA:"+bal);
	}
	public static void doB() {
		bal+=200;
		System.out.println("doB:"+bal);
	}
	public static void doC() {
		bal+=300;
		System.out.println("doC:"+bal);
	}
	public static void doD() {
		bal+=400;
		System.out.println("doD:"+bal);
	}
	
	public static void main(String[] args) {
		
		doA();
		doB();
		doC();
		doD();
		System.out.println("bal:"+bal);
			
	}
}
