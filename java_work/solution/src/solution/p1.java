package solution;

public class p1 {

	public static void main(String[] args) {
		
		int num1 = 10; int num2 = 20; int num3 = 30;
		num1=num2=num3;
		System.out.println(num1);
		
		/* 30이 나오는 이유
		 * 오른쪽에서 왼쪽으로 순차적으로 값이 드가기 때문
		 */
	}
}
