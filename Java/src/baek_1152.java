package baek_1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class baek_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();

		// st에 공백을 기준으로 나눈 토큰들을 st에 저장
		StringTokenizer st = new StringTokenizer(a," ");

		// countTokens()는 토큰의 개수를 반환
		System.out.println(st.countTokens());
        sc.close();
	}
}