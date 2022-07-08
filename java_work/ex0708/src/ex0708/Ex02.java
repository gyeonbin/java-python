package ex0708;

public class Ex02 {
	
	public static int a = 10;
	
	public Ex02(){
		System.out.println("a ="+a);
	}
	public Ex02(int s){
		a+=s;
		System.out.println("a ="+a);
	}
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		a++;
		Ex02 ex02_1 = new Ex02();
		a++;
		Ex02 ex02_2 = new Ex02();
		Ex02 ex02_3 = new Ex02(18);
		
	}
}
