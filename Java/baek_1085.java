/*
백준 1085
제출일: 2021.05.24
제출자: 202014014 김하은
*/
import java.util.Scanner;
public class baek_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, w, h;

		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();

		if (x > w-x) {
			if(y > h-y) {
				if (h-y > w-x) {
					System.out.println(w-x);
				}
				else {
					System.out.println(h-y);
				}
			}
			else {
				if(y > w-x) {
					System.out.println(w-x);
				}
				else {
					System.out.println(y);
				}
			}
		}
		else {
			if(y > h-y) {
				if (h-y > x) {
					System.out.println(x);
				}
				else {
					System.out.println(h-y);
				}
			}
			else {
				if(y > x) {
					System.out.println(x);
				}
				else {
					System.out.println(y);
				}
			}
		}

		sc.close();
	}
}
