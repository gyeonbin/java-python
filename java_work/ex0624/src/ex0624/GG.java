package ex0624;

public class GG {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1 > num2);
		System.out.println((num1 < num2)+"\n");
		
		System.out.println(num1 < num2 && num2 < num3);
		System.out.println(num1 > num2 && num2 < num3);
		System.out.println(num1 > num2 || num2 < num3);
	}
}
