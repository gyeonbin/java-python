package ex0705;

public class Ex05 {
	public static void doA(String st1, String st2) {
		System.out.println(st1+st2);
	}
	
	public static void main(String[] args) {
		String a = "Happy";
		String b = new String("Happy");
		
		System.out.println(a);
		System.out.println(b);
		doA(a,b);
	}
}
