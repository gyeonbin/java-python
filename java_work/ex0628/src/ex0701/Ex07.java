package ex0701;

public class Ex07 {
	
	public static void main(String[] args) {
		
		doA();
		int result = doB();
		System.out.println("result = "+result);
		
		doB();
		
		doC();
		
		doD();
	
	
	}
	
	
	
	public static void doA() {
		System.out.println("doA");
		return;
	}
	
	public static int doB() {
		System.out.println("doB");
		return 10;
	}
	
	public static double doC() {
		return 10.5325;
	}
	
	public static String doD() {
		return "doD";
	}

}
