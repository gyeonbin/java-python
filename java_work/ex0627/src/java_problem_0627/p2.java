package java_problem_0627;

public class p2 {

	public static void main(String[] args) {

		int num1 = 50, num2 = 100;
		int big;
		int diff;

		if (num1 > num2)
			big = num1;
		else
			big = num2;
		System.out.println("큰 수 : "+big);
		
		if ((num1-num2)>0)
			diff = num1 - num2;
		else
			diff = num2-num1;
		System.out.println("절대값 : "+diff);
	}

}
