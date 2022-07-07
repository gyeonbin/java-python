package ex0707;
import zoo.*;
// 같은 패키지 내에 있는 클래스가 우선, 최대한 이름 겹치지 않게

public class Ex03 {
	
	Ex03(){
		zoo.Dog dog = new zoo.Dog();
		zoo.Cat cat = new zoo.Cat();
		Duck duck = new Duck();
		sound(dog, cat, duck);
	}
	
	
	public void sound(zoo.Dog dog, zoo.Cat cat, Duck duck) {
		dog.sound();
		cat.sound();
		duck.sound();
	}
	
	
	public static void main(String[] args) {
		new Ex03();
	}
	
}
