package example;
import java.util.*;

public class scanner_practice {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	int x;
	int y;
	
	System.out.println("x+y 계산기");
	System.out.println("x :");
	
	x = input.nextInt();
	
	System.out.println("y :");
	y = input.nextInt();
	
	int ans = x+y;
	System.out.println("x+y = " + String.format("%d", ans));
	
	}
}
