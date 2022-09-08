import java.util.Scanner;
import java.util.Arrays;

public class baek_1302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();    // 팔린 책의 개수 
		String bookarr[] = new String[N]; // 순서, 책 제목
		
		for(int i=0; i<N; i++) {     // 책 제목 출력과 배열에 책 재목 넣기 
			String name = sc.next();
			bookarr[i] = name;
		}
		
		Arrays.sort(bookarr);    // bookarr를 순서대로 정렬 
		
		int count = 0;    // 책 제목이 같을 경우 저장하는 변수  (빈도)
		int max = 0;      // 가장 빈도가 높은 책 제목 
		String compare = bookarr[0];    // 비교할 배열 
		String bookname = "";
		
		for(int i=0; i<N; i++) {
			// 책 제목이 같은 경우
			if (bookarr[i].equals(compare)) {    // 포커스 되어 있는 배열이랑 정렬되지 않은 배열이랑 비교
				count ++;
			}
			
			// 책 제목이 다른 경우
			else {
				if(count > max) {    // 제목이 같은 경우 저장한 빈도수보다 max가 클 때 
					max = count;     // max에 넣어줌.
					bookname = compare;
				}
				compare = bookarr[i];    // 한개씩 비교해야되니까 
				count = 1;               // 빈도 수를 초기화
			}
		}
		
		if(count > max) {
			bookname = compare;
		}
		
		System.out.println(bookname);
		
		sc.close();
	}
}
