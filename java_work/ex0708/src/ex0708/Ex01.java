package ex0708;

class A{
	static int a = 0;
	int s = 0;
	A(){
		a++;
		s++;
		System.out.println("a ="+a);
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		A c = new A();
		System.out.println("a.s = "+a.s);
		System.out.println("b.s = "+b.s);
		System.out.println("c.s = "+c.s);
	}
	
	
}
