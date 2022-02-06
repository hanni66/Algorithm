import java.util.*;

public class baek_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h[] = new int[9];	// 키를 입력받을 배열 생성
		int sum = 0;			// 9명 키의 총 합을 저장할 변수
		int a = 0, b = 0;		// 100이 넘는 2명을 골라 저장할 변수
		
		for(int i=0; i<9; i++) {	// 9명의 키를 입력받기 위한 반복문 
			h[i] = sc.nextInt(); 	// 입력문 
			sum += h[i];			// 배열에 넣기
		}
		Arrays.sort(h);				// 배열 정렬하기
		
		for(int i=0; i<9; i++) {				// 2명을 고르기 위한 반복문
			for(int j=1; j<9; j++) {			
				if(sum - h[i] - h[j] == 100) {	// 총 합에서 2명을 뺐을 때 100이 되면 
					a = i;						// a는 i
					b = j;						// b는 j
				}
			}
		}
		for (int i=0; i<9; i++) {		// 결과를 출력할 반복문 
			if(i == a || i == b)		// i가 a나 b와 같다면 
				continue;			
			System.out.println(h[i]); 	// 출력문
		}
		sc.close();
	}
}
