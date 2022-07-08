package java_problem_0627;

public class p3_2 {
	
	public static void main(String[] args) {
	
		int n = 24;
		n = (n/10) + 1;
		
		
		switch(n) {
		
		case 1:
			System.out.println("0이상 10 미만의 수");
			break;
		case 2:
			System.out.println("10이상 20 미만의 수");
			break;
		case 3:
			System.out.println("20이상 30 미만의 수");
			break;
		case 4:
			System.out.println("음수 혹은 30 이상의 수");
			break;
		}
		
		
	}

}
