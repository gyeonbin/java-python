package ex0701;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int n = 1;
		int sum = 0;
		while (n<=1000) {
			
			if (n%14 == 0)
				sum = sum+n;
			System.out.println("num = "+n);
			System.out.println("sum = "+sum);
			
			n++;
		}
		
		System.out.println(sum);
	}
	
}
