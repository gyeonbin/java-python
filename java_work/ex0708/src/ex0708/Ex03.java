package ex0708;

public class Ex03 {

	public static void doA() {
		System.out.println("DoA");
	}

	public void doB() {
		System.out.println("DoB");
	}
	
	public static void main(String[] args) {
		Ex03.doA();//쌉 가능(static)
		//Ex03.doB();쌉 불가능(non-static)
		Ex03 doB = new Ex03();
		doB.doB();
		
		//static 메서드는 바로 호출 가능
		//static 메서드가 아닌 것은 new를 통해 heap에 할당해야지 호출 가능하다.
	}
}