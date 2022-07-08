package ex0708;

class S{
	static int sum=0;
	static {
		sum=0;
	}
	static void add(int n) {
		sum+=n;
	}
	
	static void result() {
		System.out.println("sum = "+sum);
	}
}

public class P2 {
	public static void main(String[] args) {
		for(int i = 0; i <10; i++) 
			S.add(i);
		S.result();
	}
}
