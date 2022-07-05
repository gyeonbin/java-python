package ex0705;

public class BNK {
	
	String jumin;
	String acc;
	int bal;

	
	public void instance(String j, String k, int a) {
		jumin=j;
		acc = k;
		bal = a;
	}
	
	public void deposit(int a) {
		bal = bal +a;
	}
	
	public void print() {
		System.out.println("주민 :"+jumin);
		System.out.println("계좌 :"+acc);
		System.out.println("잔고 :"+bal);
	}
}
