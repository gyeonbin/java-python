package ex0704;

import java.util.Scanner;

public class Ex02 {

	public static double Area(double r) {

		double a = r * r * 3.14;
		return a;
	}

	public static double Radious(double r) {

		double rad = 2 * r * 3.14;
		return rad;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 입력");
		double r = scan.nextDouble();

		System.out.println("면적:" + Area(r));
		System.out.println("둘레:" + Radious(r));

	}

}
