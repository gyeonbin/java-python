package ex0704;

public class MyAccountBank {
	
	int balance = 0;
	String s = "";
	
	public void deposit(int n) {
		balance+=n;
		s+="입금:"+n+"원\n";
	}
	
	public void withdraw(int n) {
		balance-=n;
		s+="출금:"+n+"원\n";
	}
	
	public void check() {
		System.out.println("잔금 :"+balance);
	}
	
	
}
