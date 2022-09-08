
import java.util.Scanner;
public class baek_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] C = new int [8]; // 크기가 8인 배열 C 선언
		String a = ""; //문자열 선언

		for (int i = 0; i < 8; i++) {
			C [i] = sc.nextInt(); // 8개의 숫자 입력받기
		}
		for (int i = 0; i < C.length-1; i++) {
			if(C[i+1] == C[i]+1){ //입력한 수의 배열과 순서가 같으면
				a = "ascending"; // 출력
			}
			else if(C[i+1] == C[i]-1){ //배열을 거꾸로 한 값과 입력된 배열의 값이 같으면
				a = "descending"; //출력
			}
			else{ // 아니라면
				a = "mixed"; //출력
				break;
			}
		}
		System.out.println(a); //문자열 a 출력
		sc.close();
	}
}
