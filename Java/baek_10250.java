package baek_10250;

import java.util.Scanner;
public class baek_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 테스트 케이스
		for(int i = 0; i < T; i++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			if(C % A == 0) {
				System.out.println((A * 100) + (C / A));

			} else {
				System.out.println(((C % A) * 100) + ((C / A) + 1));
			}
		}
        sc.close();
	}
}
