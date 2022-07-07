package ex0707;
import java.util.Scanner;

class Person{
	
	private String name;
	public Person() {};
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return "Person:"+name;
	}
	
}

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("이름입력");
		name = scan.nextLine();
		Person p1 = new Person();
		Person p2 = new Person("한글");
		p1.setName(name);
		
		System.out.println(p2.toString());
		System.out.println(p1.toString());
		
	} 
	
}