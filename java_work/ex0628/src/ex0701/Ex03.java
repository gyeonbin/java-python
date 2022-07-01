package ex0701;

public class Ex03 {
	
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		
		while(sum<=1000) {
			
			System.out.println(n);
			sum = sum + n;
			n = n+2;
			
		}
	
		System.out.println(sum);
	}
}
