package ex0708;
import java.time.*;

public class Ex06 {
	static String date;
	
	static {
		LocalDate d = LocalDate.now();
		date = d.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(date);
		
	}
}
