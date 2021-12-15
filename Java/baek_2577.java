package baek_2577;

import java.util.Scanner;

public class baek_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int v = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(v);

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
