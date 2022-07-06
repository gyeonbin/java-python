//	alt + shift + s -> o 생성자
//  alt + shift + s -> r getter setter 만들기
// .jave를 compile -> .class로 변환

package ex0706;
import java.util.Scanner;
class tri {

	int w,h;
	
	public tri() {}
	public tri(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}



	public void A() {
		double a = (double)(w*h)/2;
		System.out.println("넓이 :"+a);
	}
}

public class Ex01 {
	
	
	
	public static void main(String[] args) {
		
		int w,h;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("너비 높이");
		w = scan.nextInt();
		h = scan.nextInt();
		tri TRI = new tri();
		tri TRI2 = new tri(2*w,h);
		TRI2.A();
		
		
	}
}
