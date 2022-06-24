package solution;

public class p3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			int ans = 3 * i * (i + 1) / 2;
			String s;

			String string = "3";

			for (int j = 1; j < i; j++) {
				s = 3*(1+j)+"";
				string += " + " + s;
			}
			string += " = ";

			System.out.println(string + ans);
		}
	}
}
