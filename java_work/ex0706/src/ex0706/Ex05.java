package ex0706;
import circle.Circle;


public class Ex05 {
	
	public static void main(String[] args) {
		
		Circle C = new Circle();
		
		C.setRad(3);System.out.println(C.getRad());C.getArea();
		C.setRad(5);System.out.println(C.getRad());C.getArea();
		
		
	}
}

// 1. private 개인의
// 2. protected
// 3. default
// 4. public 공공의

//접근 쉬운 순서 : public>protected>default>private

//사용예시