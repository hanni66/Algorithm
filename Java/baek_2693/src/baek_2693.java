import java.util.*;

public class baek_2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();			// 테스트 케이스 수 입력받기  
		int A[] = new int[10];			// 입력할 배열을 저장할 배열 변수 선언 
		int result[] = new int[T];		// 출력할 수를 저장할 배열 변수 선언 
		
		for(int i=0; i<T; i++) {		// 테스트 케이스 수 만큼 반복
			for(int j=0; j<10; j++) {	// 10만큼 반복해 배열에 입력받기 
				A[j] = sc.nextInt();
			}
			Arrays.sort(A);				// 배열 정렬하기 
			result[i] += A[7];			// 출력할 수를 저장하기 (3번쨰 큰 값)
		}
		for(int i=0; i<T; i++) {		// 출력하기 위한 반복문
			System.out.println(result[i]);
		}
		sc.close();
	}
}
