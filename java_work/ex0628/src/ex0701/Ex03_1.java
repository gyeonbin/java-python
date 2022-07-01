package ex0701;

public class Ex03_1 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		
		while(sum<=1000) {
			
			System.out.println(n);
			
			if (n%2 ==1)
				sum = sum + n;
			
			n = n+1;
			
		}
	
		System.out.println(sum);
	}

}
