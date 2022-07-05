package ex0705;

public class Ex03 {
	
	public static void main(String[] args) {
		
		C03 KB = new C03();
		C03 kb = KB;
		
		kb.setBal(10000);
		System.out.println(KB.balance);
		System.out.println(kb.balance);
		
	}
	
	
	
	
	
}
