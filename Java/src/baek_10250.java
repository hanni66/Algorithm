
import java.util.Scanner;
public class baek_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 테스트 케이스
		for(int i = 0; i < T; i++) {

			int A = sc.nextInt();
			int B = sc.nextInt();

			if(B % A == 0) {
				System.out.println((A * 100) + (B / A));

			} else {
				System.out.println(((B % A) * 100) + ((B / A) + 1));
			}
		}
        sc.close();
	}
}
